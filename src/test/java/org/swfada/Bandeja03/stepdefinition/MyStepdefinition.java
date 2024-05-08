package org.swfada.Bandeja03.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja03.step.MyStep;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;


    @Dado("que presiono el ícono finalizar de una comunicación en estado Pendiente")
    public void QuePresionoElÍconoFinalizarDeUnaComunicaciónEnEstadoPendiente() {
        myStep.QuePresionoElÍconoFinalizarDeUnaComunicaciónEnEstadoPendiente();
    }

    @Y("presiono el boton Finalizar")
    public void presionoElBotonFinalizar() {
        myStep.presionoElBotonFinalizar();
    }

    @Entonces("se muestra mensaje de exito")
    public void SeMuestraMensajeDeExito() {
        myStep.SeMuestraMensajeDeExito();
    }

    @Y("valido que no se muestre en comunicaciones recibidas")
    public void ValidoQueNoSeMuestreEnComunicacionesRecibidas() {
        myStep.ValidoQueNoSeMuestreEnComunicacionesRecibidas();
    }
}
