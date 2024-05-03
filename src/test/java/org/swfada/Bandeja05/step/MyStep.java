package org.swfada.Bandeja05.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Bandeja05.page.MyPage;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void seleccionoComunicación() {
        myPage.usuarioSeleccionaComunicacion();
    }

    @net.thucydides.core.annotations.Step
    public void presionoElIconoAsignar() {
        myPage.usuarioPresionaIconoAsignar();
    }
}
