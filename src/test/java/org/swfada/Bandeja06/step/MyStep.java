package org.swfada.Bandeja06.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Bandeja06.page.MyPage;

public class MyStep extends ScenarioSteps {

    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void QuePresionoElÍconoReasignarDeUnaComunicacionEnEstadoAsignado() {
        myPage.PulsarReasignarComunicacion();

    }
    @net.thucydides.core.annotations.Step
    public void PresionoEliminarAsignacion() {
        myPage.PulsarEliminarAsignacion();
    }
    @net.thucydides.core.annotations.Step
    public void MuestraMensajeDeExito() {
        myPage.ValidarMensajeDeExito();
    }
    @net.thucydides.core.annotations.Step
    public void PresionoElBotonAceptar() {
        myPage.PulsarAceptar();
    }
    @net.thucydides.core.annotations.Step
    public void LaComunicaciónCambiaAEstadoPendiente() {
        myPage.ValidarCambioDeEstado();
    }
}
