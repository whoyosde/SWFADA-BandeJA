package org.swfada.Bandeja04.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.junit.platform.commons.function.Try;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Random;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;


import java.util.List;
import java.io.File;
import java.lang.Thread;


public class MyPage extends PageObject {

    @FindBy(xpath = "//table[@id='resultadoComunicacionesRecibidas']/tbody/tr")
    private List<WebElementFacade> filas;

    @FindBy(xpath = "//a[@id=\"descargarZip\"]")
    private WebElementFacade btnDescargarDocumento;

    @FindBy(id = "campoDocInfo")
    private WebElementFacade pestanaDocumentacioonAso;

    @FindBy(id = "cerrarModalInfo")
    private WebElementFacade btnCerrar;

    private WebElement filaSeleccionada;
    private String codigo;

    public void usuarioSeleccionaComunicacionLista() {

        int cantReg = filas.size();

        if (cantReg > 0) {
            Random valorAleatorio = new Random();
            int filaSelccionadaIndex = valorAleatorio.nextInt(cantReg);

            //Seleccionar la fila seleccionada
            filaSeleccionada = filas.get(filaSelccionadaIndex);
            WebElement columnsCodigo = filaSeleccionada.findElement(By.xpath(".//td[5]"));
            String codigo = columnsCodigo.getText();
            filaSeleccionada.click();
            this.codigo = codigo;
        }
    }

    public void usuarioPresionaIconoInformacionDetallada() {

        WebElement iconoInformacionDetallada = filaSeleccionada.findElement(By.xpath(".//img[@alt='informacion']"));
        WebDriverWait wait1 = new WebDriverWait(getDriver(), 30);
        iconoInformacionDetallada.click();
        WebDriverWait wait2 = new WebDriverWait(getDriver(), 8);
    }

    public void usuarioVisualizaVentanaInformacionDetallada() {

        WebElement tituloInformacionDetallada = getDriver().findElement(By.cssSelector("#modal > div > div > div.modal-header > h4"));
        assertTrue(tituloInformacionDetallada.getText().contains("Información detallada"));

        // if  ( pestanaDocumentacioonAso.isEnabled() ){
        //}else {
        //   waitFor(3).seconds();
        //   btnCerrar.click();
        //  usuarioSeleccionaComunicacionLista();
        //}

    }

    public void usuarioPresionaDescargarDocumentos() throws AWTException {

        WebDriverWait wait = new WebDriverWait(getDriver(), 3);
        try {
            if (btnDescargarDocumento != null) {
                btnDescargarDocumento.waitUntilClickable();
                Actions action = new Actions(getDriver());
                action.moveToElement(btnDescargarDocumento)
                        .click()
                        .perform();
                waitFor(5).seconds();
                Robot robot = new Robot();
                try {
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    waitFor(45).seconds();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("mensaje" + e.getMessage());
                }
            }
            //else    {

            //    System.out.println("El botón no está disponible para descargar documentos.");
            // }
        //}
        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("El botón no se encuentra disponible. No se puede descargar documentos.");
        }
    }



    public void usuarioValidoDocumentoDescargado() {

        String downloadPath = "C:\\Users\\lmanriqp\\Downloads";
        // Obtener lista de archivos en el directorio de descargas

        File dir = new File(downloadPath);
        File[] files = dir.listFiles();
        // Ordenar archivos por fecha de modificación descendente
        Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
        // Verificar si se descargó algún archivo
        if (files.length > 0) {
        // El archivo más reciente estará en la posición 0 del arreglo
            File archivoDescargado = files[0];
            System.out.println("El archivo más reciente descargado es: " + archivoDescargado.getName());
        } else {
            System.out.println("No se descargaron archivos.");
        }

    }
}
