package org.swfada.Bandeja05.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.swfada.Bandeja05.step.MyStep;
import net.thucydides.core.annotations.Steps;

public class MyStepdefinition {


    @Steps
    MyStep myStep;

    @And ("selecciono comunicación")
    public void seleccionoComunicación(){
        myStep.seleccionoComunicación();
    }


    @When("presiono el icono Asignar")
    public void presionoElIconoAsignar() {
        myStep.presionoElIconoAsignar();
    }


   @And("presiono el botón Aceptar")
    public void presionoElBotónAceptar() {
      myStep.presionoElBotónAceptar();
    }

    @And("se visualiza que el estado de la comunicación ha cambiado")
    public void seVisualizaQueElEstadoDeLaComunicaciónHaCambiado() {
        myStep.seVisualizaQueElEstadoDeLaComunicaciónHaCambiado();
    }
}
