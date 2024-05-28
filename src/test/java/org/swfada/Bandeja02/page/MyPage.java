package org.swfada.Bandeja02.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
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

    @FindBy(xpath = "//a/span/img[@title='Nueva comunicacion']")
    private WebElementFacade NuevaComunicacion;

    @FindBy(id = "codigoFirmante_0")
    private WebElementFacade añadirFirmante1;

    @FindBy(xpath = "//input[@id='descripcionAltaComunicacion']")
    private WebElementFacade txt_asunto;

    @FindBy(xpath = "(//li/input[@class=\"select2-search__field\"])[1]")
    private WebElementFacade selecProcedimiento;

    @FindBy(xpath = "//input[@id='expedienteRelacionadoAltaComunicacion']")
    private WebElementFacade txt_codigoExpedienteRelacionado;

    @FindBy(id = "fileselectAltaDoc")
    private WebElementFacade adjuntarDoc;

    @FindBy(id = "destinoComunicacion")
    private WebElementFacade campoDestino;

    @FindBy(id = "fechaLimiteAltaComunicacion")
    private WebElementFacade campoFecha;

    @FindBy(id = "subirPortaFDoc")
    private WebElementFacade btnEnviarPortafirmas;

    @FindBy(xpath = "//td[@class='contenido_tabla_portlet cabeceraTabla']/div[@class='form-check']")
    private WebElementFacade chkFrimar;

    @FindBy(id = "busqueda")
    private WebElementFacade txt_busqueda;

    @FindBy(id = "buscarFirmante")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//input[@id=\"codigoFirmante_0\"]/../img")
    private WebElementFacade firmante01;

    @FindBy(xpath = "//*[@id=\"rowAdd_1\"]/td[2]")
    private WebElementFacade validarFirmante01;

    @FindBy(xpath = "//input[@value=\"00828343K|8462110|\"]/../img")
    private WebElementFacade añadirAdicional01;

    @FindBy(xpath = "//input[@value=\"05216859E|9556810|\"]/../img")
    private WebElementFacade añadirAdicional02;

    @FindBy(xpath = "//*[@id=\"rowAdd_1\"]/td[6]/img")
    private WebElementFacade eliminarAdcional01;

    @FindBy(xpath = "//div[@id=\"submitbuttonAltaDoc\"]/button[@id=\"subirPortaFDoc\"]")
    private WebElementFacade btnEnviarPortafirmaFinal;

    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/div")
    private WebElementFacade mensaje;

    @FindBy(xpath = "//a[@aria-label=\"Texto documentos\"]")
    private WebElementFacade pestañaMensaje;

    @FindBy(xpath = "//textarea[@name=\"textoDoc\"]")
    private WebElementFacade campoMensaje;

    private String nombreFirmante;

    public void usuarioPresionaEnNuevaComunicacion() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
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
        txt_codigoExpedienteRelacionado.click();
        txt_codigoExpedienteRelacionado.sendKeys(codigoExpediente);
    }

    public void usuarioAnexaDocumento() {
        /*Actions actions = new Actions(getDriver());
        actions.moveToElement(pestañaMensaje).click().perform();
        campoMensaje.waitUntilClickable();
        campoMensaje.sendKeys("DOC01");*/

        // Específica la ruta absoluta del archivo que deseas subir
        File file = new File("C:\\Users\\whoyosde\\Documents\\ADA\\DOC01.pdf");

        // Envía la ruta del archivo al elemento de entrada de archivo
        adjuntarDoc.sendKeys(file.getAbsolutePath());
    }

    public void usuarioSeleccionaDestinoComunicacion(String destino) {
        campoDestino.sendKeys(destino);
        WebElement Destino = getDriver().findElement(By.xpath("//span[contains(text(),'" + destino + "')]"));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Destino)
                .click()
                .perform();

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

    public void usuarioSeleccionaDocumentoAFirmar() {
        chkFrimar.click();
    }

    public void usuarioIngresaNombreFirmante(String nombreFirmante) {
        txt_busqueda.sendKeys(nombreFirmante);
        this.nombreFirmante = nombreFirmante;
    }

    public void usuarioPresionaBotonBuscar() {
        btnBuscar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("row_0")));
    }

    public void SeleccionarFirmante() {
        firmante01.waitUntilClickable();
        firmante01.click();
    }

    public void ValidarFirmanteEnSeccionFirmantes() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id=\"tablaResultadoAdd\"]")));
        assertEquals(nombreFirmante, validarFirmante01.getText());
    }

    public void SeleccionarFirmanteAdiconal01() {
        String adicional01 = "RAQUEL BRIONES LEON";
        txt_busqueda.clear();
        txt_busqueda.sendKeys(adicional01);
        btnBuscar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("row_0")));
        añadirAdicional01.waitUntilClickable();
        añadirAdicional01.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id=\"tablaResultadoAdd\"]//tr[@id=\"rowAdd_2\"]")));
    }

    public void SeleccionarFirmanteAdiconal02() {
        String adicional02 = "RAFAEL CABELLO GARCIA";
        txt_busqueda.clear();
        txt_busqueda.sendKeys(adicional02);
        btnBuscar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("row_0")));
        añadirAdicional02.waitUntilClickable();
        añadirAdicional02.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id=\"tablaResultadoAdd\"]//tr[@id=\"rowAdd_3\"]")));

    }

    public void CambiarPosicionAFirmantes() {
       //waitFor(3).second();
      //  WebDriverWait wait = new WebDriverWait(getDriver(), 20);
       // WebElement elementoOrigen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='rowAdd_3']")));
       // WebElement elementoDestino = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='rowAdd_1']")));

        WebElement elementoOrigen = getDriver().findElement(By.id("rowAdd_3"));

        WebElement elementoDestino = getDriver().findElement(By.id("rowAdd_1"));

        Actions actions = new Actions(getDriver());
        // Arrastrar y soltar el elemento desde el origen al destino
       // actions.dragAndDrop(elementoOrigen, elementoDestino).perform();
        actions.moveToElement(elementoOrigen)
                .clickAndHold()
                .moveToElement(elementoDestino)
                .release()
                .build()
                .perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"nombreFirmanteAdd_1\"][@value=\"RAFAEL CABELLO GARCIA\"]")));
        //Localizar nuevo destino despues que se cambia de posición
        elementoOrigen = getDriver().findElement(By.xpath("//tr[@id=\"rowAdd_3\"]"));
        WebElement elementoDestino2 = getDriver().findElement(By.xpath("//tr[@id=\"rowAdd_2\"]"));
        Actions actions2 = new Actions(getDriver());
        // Arrastrar y soltar el elemento desde el origen al destino
        actions2.moveToElement(elementoOrigen).clickAndHold().moveToElement(elementoDestino2).release().build().perform();
        waitFor(3).second();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"nombreFirmanteAdd_2\"][@value=\"RAQUEL BRIONES LEON\"]")));
    }

    public void EliminarFirmantesAdicionales() {
        eliminarAdcional01.waitUntilClickable();
        eliminarAdcional01.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id=\"nombreFirmanteAdd_1\"][@value=\"RAFAEL CABELLO GARCIA\"]")));
        WebElement eliminarAdcional02 = getDriver().findElement(By.xpath("//*[@id=\"rowAdd_1\"]/td[2]/input[@value=\"RAQUEL BRIONES LEON\"]/ancestor::tr/td[6]/img"));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(eliminarAdcional02)
                .click()
                .perform();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id=\"nombreFirmanteAdd_1\"][@value=\"RAQUEL BRIONES LEON\"]")));
    }

    public void EviarAPortafirma() {
        btnEnviarPortafirmaFinal.waitUntilClickable();
        waitFor(2).second();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnEnviarPortafirmaFinal)
                .click()
                .perform();

    }

    public void ValidarMensajeDeExito() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"toast toast-success\"]")));
        assertEquals("Las comunicaciones se han creado correctamente y se han enviado los documentos seleccionados a Port@firmas.", mensaje.getText());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/input[@id=\"codigoExpedienteFiltro\"]")));
        //waitFor(10).second();
    }
}
