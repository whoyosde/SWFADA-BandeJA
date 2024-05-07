package org.swfada.Bandeja04.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.Comparator;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.io.File;
import java.util.List;



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
            int filaSelccionadaIndex;
            String codigo;

            for (int i = 0; i < cantReg ; i++) {
                filaSelccionadaIndex = valorAleatorio.nextInt(cantReg);
                filaSeleccionada = filas.get(filaSelccionadaIndex);
                WebElement columnsCodigo = filaSeleccionada.findElement(By.xpath(".//td[5]"));
                codigo = columnsCodigo.getText();

                String codigoDeseado = "INT/2024/0000000000001342";

                if (codigo.equals(codigoDeseado)) {
                    this.codigo = codigo;
                    filaSeleccionada.click();
                    break;
                }
            }
        }
    }

    public void usuarioPresionaIconoInformacionDetallada() {

        WebElement iconoInformacionDetallada = filaSeleccionada.findElement(By.xpath(".//img[@alt='informacion']"));
        iconoInformacionDetallada.click();
    }

    public void usuarioVisualizaVentanaInformacionDetallada() {

        WebElement tituloInformacionDetallada = getDriver().findElement(By.cssSelector("#modal > div > div > div.modal-header > h4"));
        assertTrue(tituloInformacionDetallada.getText().contains("Información detallada"));
    }

    public void usuarioPresionaDescargarDocumentos() throws AWTException {

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
            waitFor(10).seconds();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("mensaje" + e.getMessage());
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
