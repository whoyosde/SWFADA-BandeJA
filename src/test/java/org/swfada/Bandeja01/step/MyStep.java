package org.swfada.Bandeja01.step;


import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Bandeja01.page.MyPage;

public class MyStep extends ScenarioSteps {
    MyPage myPage;


    @net.thucydides.core.annotations.Step
    public void QuePresionoLaAcciónNuevaComunicación() {

        myPage.PulsarNuevaComunicacion();
    }

    @net.thucydides.core.annotations.Step
    public void SeMuestraElModalAltaDeComunicación() {

        myPage.ModalAltaComunicacion();
    }

    @net.thucydides.core.annotations.Step
    public void RegistroElAsunto(String asunto) {

        myPage.RegistrarAsunto(asunto);
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionoRegistroDeProcedimientosYServicios(String procedimiento) {
        myPage.SeleccionarProcedimientoYServicios(procedimiento);

    }

    @net.thucydides.core.annotations.Step
    public void RegistroElCódigoExpediente(String codigo) {

        myPage.RegistrarCodigo(codigo);
    }

    @net.thucydides.core.annotations.Step
    public void AdjuntoDocumento() {
        myPage.AdjuntarDocumento();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionoDestinoDeComunicación(String destino) {

        myPage.SeleccionarDestino(destino);
    }

    @net.thucydides.core.annotations.Step
    public void ResgitroLaFechaLimite(String fecha) {

        myPage.RegistrarFechaLimite(fecha);
    }

    @net.thucydides.core.annotations.Step
    public void presionoElBotonEnviarSinFirma() {
        myPage.PulsarEnviarSinFirma();
    }
    @net.thucydides.core.annotations.Step
    public void SeMuestraMensajeÉxito() {
        myPage.ValidarMensajeExito();
    }

    public void ValidaQueSeEnvióLaComunicación() {
        myPage.ValidarEnvioDeComunicacion();
    }
}


