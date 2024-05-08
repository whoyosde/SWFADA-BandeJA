package org.swfada.Bandeja08.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja08.step.MyStep;


public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Dado("que selecciono el filtro Finalizado")
    public void QueSeleccionoElFiltroFinalizado() {
        myStep.QueSeleccionoElFiltroFinalizado();
    }

    @Cuando("presiono el boton Filtrar")
    public void PresionoElBotonFiltrar() {
        myStep.PresionoElBotonFiltrar();
    }

    @Y("se muestran las comunicaciones finalizadas")
    public void SeMuestranLasComunicacionesFinalizadas() {
        myStep.SeMuestranLasComunicacionesFinalizadas();
    }

    @Y("presiono el icono Deshacer finalizar de una comunicacion")
    public void PresionoElIconoDeshacerFinalizarDeUnaComunicacion() {
        myStep.PresionoElIconoDeshacerFinalizarDeUnaComunicacion();
    }

    @Y("presiono el boton Deshacer")
    public void PresionoElBotonDeshacer() {
        myStep.PresionoElBotonDeshacer();
    }

    @Y("se muestra mensaje satisfactorio")
    public void SeMuestraMensajeSatisfactorio() {

        myStep.SeMuestraMensajeSatisfactorio();
    }

    @Entonces("la comunicacion se elimina del grupo de finalizadas")
    public void LaComunicacionSeEliminaDelGrupoDeFinalizadas() {
        myStep.LaComunicacionSeEliminaDelGrupoDeFinalizadas();
    }

}
