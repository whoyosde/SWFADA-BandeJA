package org.swfada.Bandeja07.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Bandeja07.page.MyPage;


public class MyStep extends ScenarioSteps {

    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void seleccionoUnaComunicación() {
        myPage.usuarioSeleccionaUnaComunicacion();
    }

    @net.thucydides.core.annotations.Step
    public void presionoElIconoReenviar() {
        myPage.usuarioPresionaIconoReenviar();
    }

    @net.thucydides.core.annotations.Step
    public void elSistemaMuestraLaVentanaReenvioDeLaComunicación() {
        myPage.elSistemaMuestraLaVentanaReenvioDeLaComunicación();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionoElDestinoDeLaComunicación(String destinoCo) {
        myPage.usuarioSeleccionaDestinoComunicacion(destinoCo);
    }

    @net.thucydides.core.annotations.Step
    public void presionoElBotónReenviar() {
        myPage.presionoElBotónReenviar();
    }

    @net.thucydides.core.annotations.Step
    public void verificoQueElMensajeSeaElCorrecto() {
        myPage.usuarioVerificaMensajeSeaCorrecto();
    }
}
