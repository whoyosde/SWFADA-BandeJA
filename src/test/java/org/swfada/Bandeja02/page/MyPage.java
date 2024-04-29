package org.swfada.Bandeja02.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;


public class MyPage extends PageObject {

    @FindBy (xpath ="//button[@class='btn botonLogin' and text()='Aceptar']")
    protected WebElementFacade btnAceptarObligaciones;

   @FindBy (xpath = "//button[@class='btn botonLogin' and text()='Acceder']")
   protected WebElementFacade btnAcceder;

    @FindBy (xpath = "//a[@class='nav-link' and @href='#' and @aria-label='Nueva comunicacion']/span[@class='nuevaComunicacion']")
     protected WebElementFacade iconoNuevaComunicacion;

    @FindBy (xpath = "//input[@id='descripcionAltaComunicacion']")
    protected WebElementFacade txt_asunto;

    @FindBy (xpath = "//ul[@id='select2-codigoRPAAltaComunicacion-results']")
    protected List<WebElementFacade> procedimientoServicio;

    @FindBy (xpath = "//input[@id='expedienteRelacionadoAltaComunicacion']")
    protected WebElementFacade txt_codigoExpedienteRelacionado;

    @FindBy (xpath = "//input[@id='fileselectAltaDoc']")
    protected WebElementFacade lbl_nombreArchivo;

    @FindBy (xpath = "//textarea[@id='cuerpoMensaje']")
    protected WebElementFacade txt_mensaje;

    @FindBy (xpath = "//div[@id='resultadosSeleccionados']")
    protected List<WebElementFacade> destinosComunicacion;

    @FindBy (xpath = "//input[@id='requiereRespuesta']")
    protected WebElementFacade btnCheckbox;

    @FindBy (xpath = "//button[@id='subirPortaFDoc']")
    protected WebElementFacade btnEnviarPortafirmas;

    @FindBy (xpath = "//input[@class='form-check-input documentosFirmables filled-in']")
    protected WebElementFacade btnCheck;

    @FindBy (xpath = "//input[@id='busqueda']")
    protected WebElementFacade txt_nombreFirmante;

    @FindBy (xpath = "//button[@id='buscarFirmante']")
    protected WebElementFacade btnBuscar;

    @FindBy (xpath = "//input[@id='codigoFirmante_0']\n")
    protected WebElementFacade iconoAgregarFirmante;

}
