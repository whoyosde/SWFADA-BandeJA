package org.swfada.Bandeja01.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyPage extends PageObject {

    @FindBy(xpath = "//a/span/img[@title=\"Nueva comunicacion\"]")
    private WebElementFacade NuevaComunicacion;

    @FindBy(id = "descripcionAltaComunicacion")
    private WebElementFacade campoAsunto;

    @FindBy(xpath = "(//li/input[@class=\"select2-search__field\"])[1]")
    private WebElementFacade selecProcedimiento;

    @FindBy(id = "expedienteRelacionadoAltaComunicacion")
    private WebElementFacade campoCodigo;

    @FindBy(id = "fileselectAltaDoc")
    private WebElementFacade adjuntarDoc;

    @FindBy(id = "destinoComunicacion")
    private WebElementFacade campoDestino;

    @FindBy(id = "fechaLimiteAltaComunicacion")
    private WebElementFacade campoFecha;

    @FindBy(id = "subirAltaDoc")
    private WebElementFacade btnEnviarSinFirma;

    public void ValidarBandeja() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoBandeja")));
        WebElement bandeja = getDriver().findElement(By.id("logoBandeja"));
        assertTrue(bandeja.isDisplayed());
    }

    public void PulsarNuevaComunicacion() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultadoComunicacionesRecibidas_wrapper")));
        NuevaComunicacion.waitUntilClickable();
        NuevaComunicacion.click();
    }

    public void ModalAltaComunicacion() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"modal-content\"])[1]")));
        WebElement titulo = getDriver().findElement(By.tagName("h4"));
        assertEquals("Alta de comunicación", titulo.getText());
    }

    public void RegistrarAsunto(String asunto) {

        campoAsunto.sendKeys(asunto);
    }

    public void SeleccionarProcedimientoYServicios(String procedimiento) {
        selecProcedimiento.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//optgroup/option[contains(text(),'" + procedimiento + "')]"));
        clickOn(selectOptions);

    }

    public void RegistrarCodigo(String codigo) {
        campoCodigo.click();
        campoCodigo.sendKeys(codigo);
    }

    public void AdjuntarDocumento() {

        // Específica la ruta absoluta del archivo que deseas subir
        File file = new File("C:\\Users\\whoyosde\\Documents\\ADA\\DOC01.pdf");

        // Envía la ruta del archivo al elemento de entrada de archivo
        adjuntarDoc.sendKeys(file.getAbsolutePath());
    }

    public void SeleccionarDestino(String destino) {
        campoDestino.sendKeys(destino);
        WebElement Destino = getDriver().findElement(By.xpath("//span[contains(text(),'" + destino + "')]"));
        Destino.click();
    }

    public void RegistrarFechaLimite(String fecha) {

        campoFecha.sendKeys(fecha);
    }

    public void PulsarEnviarSinFirma() {
        btnEnviarSinFirma.click();
    }

    public void ValidarMensajeExito() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));

        WebElement mensaje = getDriver().findElement(By.xpath("//div[@class=\"toast-message\"]"));
        assertEquals("Se ha creado con éxito la comunicación", mensaje.getText());
        waitFor(9).second();
    }
}
