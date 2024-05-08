package org.swfada.Bandeja06.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MyPage extends PageObject {
    @FindBy(xpath = "//a[@title=\"Eliminar asignacion\"]")
    private WebElementFacade eliminarAsignacion;

    @FindBy(xpath = "//div[@class=\"toast-message\"]")
    private WebElementFacade mensaje;

    @FindBy(xpath = "//button[@title=\"Aceptar\"]")
    private WebElementFacade btnAceptar;

    @FindBy(xpath = "//button[@class=\"toast-close-button\"]")
    private WebElementFacade bntcerrar;

    @FindBy(id="filtrar")
    private WebElementFacade actualizarComuni;

    private String codigo;


    public void PulsarReasignarComunicacion() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultadoComunicacionesRecibidas_wrapper")));
        String estado = "ASIGNADO";
        // Encontrar todas las filas de la tabla
        List<WebElement> filas = getDriver().findElements(By.tagName("tr"));
        // Bandera para indicar si se encontró el elemento
        boolean encontrado = false;

        for (int i = 0; i < filas.size(); i++) {
            WebElement fila = filas.get(i);
            // Buscar el elemento en la fila por su texto
            if (fila.getText().contains(estado)) {
                // Encontrar la columna deseada (por ejemplo, la tercera columna)
                WebElement columnaCodigo = fila.findElement(By.xpath(".//td[5]"));
                // Capturar el texto de la columna deseada
                String codigo = columnaCodigo.getText();

                Actions actions = new Actions(getDriver());
                actions.moveToElement(fila)
                        .perform();

                WebElement reasignar = fila.findElement(By.xpath("(//tr[" + (i - 1) + "]/td[10]/div[2]/img[4])"));
                actions.moveToElement(reasignar)
                        .perform();
                reasignar.click();

                //this.fila = fila;
                this.codigo = codigo;
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el elemento buscado.");
        }

    }

    public void PulsarEliminarAsignacion() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Asignación de la comunicación')]")));
        eliminarAsignacion.waitUntilClickable();
        eliminarAsignacion.click();
    }

    public void ValidarMensajeDeExito() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"toast-message\"]")));
        assertEquals("La asignación se ha eliminado correctamente y la comunicación ha vuelto al estado PENDIENTE", mensaje.getText());
    }

    public void PulsarAceptar() {
        btnAceptar.click();
        waitFor(8).second();
        bntcerrar.click();
        actualizarComuni.click();
    }

    public void ValidarCambioDeEstado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=\"resultadoComunicacionesRecibidas\"]//tbody/tr[1]")));

        List<WebElement> filas = getDriver().findElements(By.tagName("tr"));
        boolean buscado = false;
        for (int i = 0; i < filas.size(); i++) {
            WebElement row = filas.get(i);
            // Buscar el elemento en la fila por su texto
            if (row.getText().contains(codigo)) {
                String estadofinal = "PENDIENTE";
                WebElement columnaEstado = row.findElement(By.xpath(".//td[10]/div"));
                String verestado = columnaEstado.getText();
                Actions actions = new Actions(getDriver());
                actions.moveToElement(row)
                        .perform();
                System.out.println("estado final"+verestado);
                //waitFor(10).second();
                Assert.assertEquals("No cambio el estado", estadofinal, verestado);
                buscado = true;
                break;
            }
        }
        if (!buscado) {
            System.out.println("No se encontró el elemento buscado.");
        }

    }
}
