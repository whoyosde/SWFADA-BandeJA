package org.swfada.Bandeja08.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Bandeja08.page.MyPage;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void QueSeleccionoElFiltroFinalizado() {
        myPage.EliminarFiltros();
        myPage.SeleccionarFiltroFinalizado();
    }
    @net.thucydides.core.annotations.Step
    public void PresionoElBotonFiltrar() {
        myPage.PulsarFiltrar();
    }
    @net.thucydides.core.annotations.Step
    public void SeMuestranLasComunicacionesFinalizadas() {
        myPage.ValidarComunicacionesFinalizadas();
    }
    @net.thucydides.core.annotations.Step
    public void PresionoElIconoDeshacerFinalizarDeUnaComunicacion() {
        myPage.PulsarDeshacerFinalizar();
    }
    @net.thucydides.core.annotations.Step
    public void PresionoElBotonDeshacer() {
        myPage.PulsarDeshacer();
    }

    @net.thucydides.core.annotations.Step
    public void SeMuestraMensajeSatisfactorio() {
        myPage.ValidarMensajeSatisfactorio();
    }

    @net.thucydides.core.annotations.Step
    public void LaComunicacionSeEliminaDelGrupoDeFinalizadas() {
        myPage.ValidarAnulacionDeFinalizados();
    }
}
