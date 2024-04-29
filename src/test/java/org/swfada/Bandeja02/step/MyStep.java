package org.swfada.Bandeja02.step;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Bandeja02.page.MyPage;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step

    public void queMeEncuentroUbicadoEnBandeja() {
        myPage.ValidarBandeja();
    }

    @net.thucydides.core.annotations.Step
    public void presionoEnNuevaComunicación() {
        myPage.usuarioPresionaEnNuevaComunicacion();
    }

    @net.thucydides.core.annotations.Step
    public void seMuestraLaVentanaAltaDeComunicación() {
        myPage.sistemaMuesraVentanaAltaComunicacin();
    }
}
