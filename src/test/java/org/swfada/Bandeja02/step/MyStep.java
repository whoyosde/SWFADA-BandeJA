package org.swfada.Bandeja02.step;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Bandeja02.page.MyPage;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void presionoEnNuevaComunicación() {
        myPage.usuarioPresionaEnNuevaComunicacion();
    }

    @net.thucydides.core.annotations.Step
    public void seMuestraLaVentanaAltaDeComunicación() {
        myPage.sistemaMuesraVentanaAltaComunicacin();
    }

    @net.thucydides.core.annotations.Step
    public void registroElAsunto(String asunto) {
        myPage.usuarioRegistraAsunto(asunto);
    }

    @net.thucydides.core.annotations.Step
    public void seleccionoElRegistroDeProcedimientosYServicios(String nombreProcedimiento) {
        myPage.usuarioSeleccionaProcedimientoServicio(nombreProcedimiento);
    }

    @net.thucydides.core.annotations.Step
    public void registroElCódigoExpedienteRelacionado(String codigoExpediente) {
        myPage.usuarioIngresaCodigoExpediente(codigoExpediente);
    }
    @net.thucydides.core.annotations.Step
    public void anexoDocumento() {
        myPage.usuarioAnexaDocumento();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionoElDestinoDeComunicación(String destino) {
        myPage.usuarioSeleccionaDestinoComunicacion(destino);
    }

    @net.thucydides.core.annotations.Step
    public void registroLaFechaLimite(String fecha) {
        myPage.usuarioRegsitraFechaLimite(fecha);
    }

    @net.thucydides.core.annotations.Step
    public void presionoElBotónEnviarAPortafirmas() {
        myPage.presionoElBotónEnviarAPortafirmas();
    }

    @net.thucydides.core.annotations.Step
    public void elSistemaPresentaLaVentanaEnviarPeticiónAPortFirmas() {
        myPage.usuarioVisualizaVentanaPeticionAPortaFirmas();
    }
    @net.thucydides.core.annotations.Step
    public void seleccionoElDocumentoAFirmar() {
        myPage.usuarioSeleccionaDocumentoAFirmar();
    }
    @net.thucydides.core.annotations.Step
    public void ingresarElNombreDelFirmante(String nombreFirmante) {
        myPage.usuarioIngresaNombreFirmante(nombreFirmante);
    }
    @net.thucydides.core.annotations.Step
    public void presioneElBotónBuscar() {
        myPage.usuarioPresionaBotonBuscar();
    }
    @net.thucydides.core.annotations.Step
    public void SeleccionoElFirmanteBuscado() {
        myPage.SeleccionarFirmante();
    }
    @net.thucydides.core.annotations.Step
    public void SeMuestraElFirmanteEnLaSecciónFirmantesDelDocumento() {
        myPage.ValidarFirmanteEnSeccionFirmantes();
    }
    @net.thucydides.core.annotations.Step
    public void SeleccionoElRestoDeFirmantes() {
        myPage.SeleccionarFirmanteAdiconal01();
        myPage.SeleccionarFirmanteAdiconal02();
    }
    @net.thucydides.core.annotations.Step
    public void CambioDePosiciónALosFirmantes() {
        myPage.CambiarPosicionAFirmantes();

    }
    @net.thucydides.core.annotations.Step
    public void PresionoElBotónEnviarAPortafirmaFinal() {
        myPage.EliminarFirmantesAdicionales();
        myPage.EviarAPortafirma();
    }
    @net.thucydides.core.annotations.Step
    public void SeMuestraElMensajeDeÉxito() {
        myPage.ValidarMensajeDeExito();
    }
}