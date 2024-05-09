package org.swfada.Bandeja04.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.Comparator;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.io.File;
import java.util.List;


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@id=\"descargarZip\"]")
    private WebElementFacade btnDescargarDocumento;

    @FindBy(id = "campoDocInfo")
    private WebElementFacade pestanaDocumentacioonAso;

    @FindBy(id = "cerrarModalInfo")
    private WebElementFacade btnCerrar;


    public void usuarioSeleccionaComunicacionLista() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultadoComunicacionesRecibidas_wrapper")));
        String codigo = "EXT/2024/0000000000001254";
        // Encontrar todas las filas de la tabla
        List<WebElement> filas = getDriver().findElements(By.tagName("tr"));
        // Bandera para indicar si se encontró el elemento
        boolean encontrado = false;

        for (int i = 0; i < filas.size(); i++) {
            WebElement fila = filas.get(i);
            // Buscar el elemento en la fila por su texto
            if (fila.getText().contains(codigo)) {
                // Encontrar la columna deseada (por ejemplo, la tercera columna)
                Actions actions = new Actions(getDriver());
                actions.moveToElement(fila)
                        .perform();
                WebElement detalle = fila.findElement(By.xpath("(//tr[" + (i - 1) + "]/td[10]/div[2]/img[2])"));

                actions.moveToElement(detalle)
                        .perform();
                detalle.click();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el elemento buscado.");
        }

    }


    public void usuarioVisualizaVentanaInformacionDetallada() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#modal > div > div > div.modal-header > h4")));
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

        //String downloadPath = "C:\\Users\\lmanriqp\\Downloads";
        String downloadPath = "C:\\Users\\whoyosde\\Downloads";
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
