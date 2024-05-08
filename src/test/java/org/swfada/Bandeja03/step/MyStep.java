package org.swfada.Bandeja03.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Bandeja03.page.MyPage;

public class MyStep extends ScenarioSteps {

    private MyPage myPage;


    @net.thucydides.core.annotations.Step
    public void QuePresionoElÍconoFinalizarDeUnaComunicaciónEnEstadoPendiente() {

        myPage.FinalizarComunicacion();
    }
    @net.thucydides.core.annotations.Step
    public void presionoElBotonFinalizar() {
        myPage.PulsarBotonFinalizar();
    }

    @net.thucydides.core.annotations.Step
    public void SeMuestraMensajeDeExito() {
        myPage.ValidarMensajeExito();
    }

    public void ValidoQueNoSeMuestreEnComunicacionesRecibidas() {
        myPage.ValidarFinalizacionComunicacion();
    }

}
