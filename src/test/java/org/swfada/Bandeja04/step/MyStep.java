package org.swfada.Bandeja04.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Bandeja04.page.MyPage;

import java.awt.*;

public class MyStep extends ScenarioSteps {

    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void ingresoALaInformaciónDetalladaDeUnaComunicación() {
        myPage.usuarioSeleccionaComunicacionLista();
    }

    @net.thucydides.core.annotations.Step
    public void elSistemaMuestraLaVentanaInformaciónDetallada() {
        myPage.usuarioVisualizaVentanaInformacionDetallada();
    }

    @net.thucydides.core.annotations.Step
    public void resionoElIconoDescargarDccumentos()throws AWTException {
        myPage.usuarioPresionaDescargarDocumentos();
    }

    @net.thucydides.core.annotations.Step
    public void validoElDocumentoDescargado() {
        myPage.usuarioValidoDocumentoDescargado();
    }


}
