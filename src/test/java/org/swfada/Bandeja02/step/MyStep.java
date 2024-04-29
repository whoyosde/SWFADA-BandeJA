package org.swfada.Bandeja02.step;

import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja02.page.MyPage;

public class MyStep {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void daClickEnNuevaComunicación() {
        myPage.clickNuevaComunicacion();
    }

    @net.thucydides.core.annotations.Step
    public void puedeVisualizarLaVentana() {
        myPage.VisualizarVentana();
    }
}
