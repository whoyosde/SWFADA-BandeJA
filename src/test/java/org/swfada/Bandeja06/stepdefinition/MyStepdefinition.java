package org.swfada.Bandeja06.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja06.step.MyStep;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Dado("que presiono el ícono reasignar de una comunicacion en estado Asignado")
    public void QuePresionoElÍconoReasignarDeUnaComunicacionEnEstadoAsignado() {
      myStep.QuePresionoElÍconoReasignarDeUnaComunicacionEnEstadoAsignado();
    }

    @Cuando("presiono Eliminar asignacion")
    public void PresionoEliminarAsignacion() {
        myStep.PresionoEliminarAsignacion();
    }

    @Y("muestra mensaje de exito")
    public void MuestraMensajeDeExito() {
        myStep.MuestraMensajeDeExito();
    }

    @Y("presiono el boton Aceptar")
    public void PresionoElBotonAceptar() {
        myStep.PresionoElBotonAceptar();
    }

    @Entonces("la comunicación cambia a estado Pendiente")
    public void LaComunicaciónCambiaAEstadoPendiente() {
        myStep.LaComunicaciónCambiaAEstadoPendiente();
    }
}
