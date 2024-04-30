package org.swfada.Bandeja02.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.File;

public class MyPage extends PageObject {

    @FindBy (xpath = "//a/span/img[@title='Nueva comunicacion']")
    private WebElementFacade NuevaComunicacion;

    @FindBy (xpath = "//input[@id='descripcionAltaComunicacion']")
    private WebElementFacade txt_asunto;

    @FindBy (xpath = "(//li/input[@class=\"select2-search__field\"])[1]")
    private WebElementFacade selecProcedimiento;

    @FindBy (xpath = "//input[@id='expedienteRelacionadoAltaComunicacion']")
    private WebElementFacade txt_codigoExpedienteRelacionado;

    @FindBy(id = "fileselectAltaDoc")
    private WebElementFacade adjuntarDoc;

    @FindBy(id = "destinoComunicacion")
    private WebElementFacade campoDestino;

    @FindBy(id = "fechaLimiteAltaComunicacion")
    private WebElementFacade campoFecha;

    @FindBy (id = "subirPortaFDoc")
    private WebElementFacade btnEnviarPortafirmas;

    public void ValidarBandeja() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoBandeja")));
        WebElement bandeja = getDriver().findElement(By.id("logoBandeja"));
        assertTrue(bandeja.isDisplayed());
    }

    public void usuarioPresionaEnNuevaComunicacion() {
        WebDriverWait wait = new WebDriverWait (getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultadoComunicacionesRecibidas_wrapper")));
        NuevaComunicacion.waitUntilClickable();
        NuevaComunicacion.click();
    }

    public void sistemaMuesraVentanaAltaComunicacin() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 180);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']")));
        WebElement titulo = getDriver().findElement(By.tagName("h4"));
        assertEquals("Alta de comunicación", titulo.getText());
    }
    public void usuarioRegistraAsunto(String asunto) {
        txt_asunto.sendKeys(asunto);
    }
    public void usuarioSeleccionaProcedimientoServicio(String procedimiento) {
        selecProcedimiento.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//optgroup/option[contains(text(),'" + procedimiento + "')]"));
        clickOn(selectOptions);
    }

    public void usuarioIngresaCodigoExpediente(String codigoExpediente) {
        txt_codigoExpedienteRelacionado.sendKeys(codigoExpediente);
    }

    public void usuarioAnexaDocumento() {
        // Específica la ruta absoluta del archivo que deseas subir
        File file = new File("C:\\Empresa\\DocumentosTest\\DOC01.pdf");

        // Envía la ruta del archivo al elemento de entrada de archivo
        adjuntarDoc.sendKeys(file.getAbsolutePath());
    }

    public void usuarioSeleccionaDestinoComunicacion(String destino) {
        campoDestino.sendKeys(destino);
        WebElement Destino = getDriver().findElement(By.xpath("//span[contains(text(),'" + destino + "')]"));
        Destino.click();
    }

    public void usuarioRegsitraFechaLimite(String fecha) {
        campoFecha.sendKeys(fecha);
    }

    public void presionoElBotónEnviarAPortafirmas() {
        btnEnviarPortafirmas.click();
    }

    public void usuarioVisualizaVentanaPeticionAPortaFirmas() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='modalFirma']")));
        WebElement tituloPeticionPortafirmas = getDriver().findElement(By.cssSelector("#modalFirma .modal-dialog .modal-content .modal-header h4"));
        assertEquals("Enviar petición a Port@firmas", tituloPeticionPortafirmas.getText());
    }
}
