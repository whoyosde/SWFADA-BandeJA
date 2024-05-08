package org.swfada.Bandeja03.page;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class MyPage extends PageObject {
    private WebElement fila;
    private String codigo;
    @FindBy(id = "finalizarCom")
    private WebElementFacade btnFinalizar;
    @FindBy(xpath = "//div[@class=\"toast-message\"]")
    private WebElementFacade mensaje;

    public void FinalizarComunicacion() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultadoComunicacionesRecibidas_wrapper")));
        String estado = "PENDIENTE";
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
                System.out.println("Texto de la columna deseada: " + codigo);

                Actions actions = new Actions(getDriver());
                actions.moveToElement(fila)
                        .perform();

                WebElement finalizar = fila.findElement(By.xpath("(//tr[" + (i - 1) + "]/td[10]/div[2]/img[7])"));
                actions.moveToElement(finalizar)
                        .perform();
                finalizar.click();

                this.fila = fila;
                this.codigo = codigo;
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el elemento buscado.");
        }
    }

    public void PulsarBotonFinalizar() {

        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),\"Finalizar comunicación\")]")));
        btnFinalizar.click();
    }

    public void ValidarMensajeExito() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"toast-container\"]")));
        assertEquals("La comunicación se ha finalizado correctamente.", mensaje.getText());
    }

    public void ValidarFinalizacionComunicacion() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        // Esperar hasta que la fila desaparezca completamente de la página
        wait.until(ExpectedConditions.invisibilityOf(fila));

        String estado = "PENDIENTE";
        // Encontrar todas las filas de la tabla
        List<WebElement> filas = getDriver().findElements(By.tagName("tr"));
        // Bandera para indicar si se encontró el elemento
        boolean encontrado = false;

        for (int i = 0; i < filas.size(); i++) {
            WebElement row = filas.get(i);
            // Buscar el elemento en la fila por su texto
            if (row.getText().contains(estado) && row.getText().contains(codigo)) {
                Assert.fail("No se elimino de la tabla");
                System.out.println("La comunicación con el código " + codigo + " no finalizó");
                encontrado = true;
                break;

            } else {
                Assert.assertTrue(true);
                System.out.println("La comunicación con el código " + codigo + " no se muestra en la tabla");
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el elemento buscado.");
        }

    }
}
