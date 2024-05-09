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

    public void elSistemaMuestraLaVentanaInformaciónDetallada() {
        myPage.usuarioVisualizaVentanaInformacionDetallada();
    }

    public void resionoElIconoDescargarDccumentos()throws AWTException {
        myPage.usuarioPresionaDescargarDocumentos();
    }

    public void validoElDocumentoDescargado() {
        myPage.usuarioValidoDocumentoDescargado();
    }


}
