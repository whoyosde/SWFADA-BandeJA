package org.swfada.Bandeja08.page;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyPage extends PageObject {
    @FindBy(id = "borrarFiltros")
    private WebElementFacade btnborrarfiltro;

    @FindBy(id = "estadosFiltro")
    private WebElementFacade listaEstados;

    @FindBy(id = "filtrar")
    private WebElementFacade btnFiltrar;

    @FindBy(id = "finalizarCom")
    private WebElementFacade btnDeshacer;

    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/div")
    private WebElementFacade mensaje;

    private WebElement fila;
    private String codigo;

    public void EliminarFiltros() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultadoComunicacionesRecibidas_wrapper")));
        btnborrarfiltro.waitUntilClickable();
        btnborrarfiltro.click();
    }

    public void SeleccionarFiltroFinalizado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Estados...\"]")));
        Select select = new Select(listaEstados);
        // Seleccionar opción por valor
        select.selectByValue("FINALIZADO");
    }

    public void PulsarFiltrar() {
        try {
            btnFiltrar.click();
        } catch (Exception e) {
            System.out.println("Se produjo un error al hacer clic en el botón: " + e.getMessage());
        }
    }

    public void ValidarComunicacionesFinalizadas() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//table[@id=\"resultadoComunicacionesRecibidas\"]//div[contains(text(),'FINALIZADO')]")));
    }

    public void PulsarDeshacerFinalizar() {
        String estado = "FINALIZADO";
        // Encontrar todas las filas de la tabla
        List<WebElement> filas = getDriver().findElements(By.tagName("tr"));
        // Bandera para indicar si se encontró el elemento
        boolean encontrado = false;

        for (int i = 0; i < filas.size(); i++) {
            WebElement fila = filas.get(i);
            // Buscar el elemento en la fila por su texto
            if (fila.getText().contains(estado)) {
                Actions actions = new Actions(getDriver());
                actions.moveToElement(fila)
                        .perform();

                WebElement columnaCodigo = fila.findElement(By.xpath(".//td[5]"));
                // Capturar el texto de la columna deseada
                String codigo = columnaCodigo.getText();

                WebElement deshacer = fila.findElement(By.xpath("(//table[@id=\"resultadoComunicacionesRecibidas\"]//tr[" + (i - 1) + "]/td[10]/div[2]/img[3])"));
                actions.moveToElement(deshacer)
                        .perform();
                deshacer.click();

                this.fila = fila;
                this.codigo =codigo;
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el elemento buscado.");
        }
    }

    public void PulsarDeshacer() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Deshacer el estado finalizado de la comunicación')]")));
        btnDeshacer.click();
    }

    public void ValidarMensajeSatisfactorio() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"toast toast-success\"]")));
        assertEquals("La comunicación ha regresado al estado ASIGNADO.", mensaje.getText());
    }

    public void ValidarAnulacionDeFinalizados() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        // Esperar hasta que la fila desaparezca completamente de la página
        wait.until(ExpectedConditions.invisibilityOf(fila));
        List<WebElement> filas = getDriver().findElements(By.tagName("tr"));
        // Bandera para indicar si se encontró el elemento
        boolean encontrado = false;

        for (int i = 0; i < filas.size(); i++) {
            WebElement row = filas.get(i);
            // Buscar el elemento en la fila por su texto
            if (row.getText().contains(codigo)) {
                Assert.fail("No paso a ASIGNADO");
                encontrado = true;
                break;
            } else {
                Assert.assertTrue(true);
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el elemento buscado.");
        }
    }
}
