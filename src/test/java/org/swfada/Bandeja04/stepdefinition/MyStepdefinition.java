package org.swfada.Bandeja04.stepdefinition;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja04.step.MyStep;

import io.cucumber.java.en.And;

public class MyStepdefinition {

    @Steps
    MyStep myStep;

    @And("selecciono una comunicación de la lista")
    public void seleccionoUnaComunicaciónDeLaLista() {
        myStep.seleccionoUnaComunicaciónDeLaLista();
    }

    @When("presiono el icono Información Detallada")
    public void presionoElIconoInformaciónDetallada() {
        myStep.presionoElIconoInformaciónDetallada();
    }

    @And("el sistema muestra la ventana Información Detallada")
    public void elSistemaMuestraLaVentanaInformaciónDetallada() {
        myStep.elSistemaMuestraLaVentanaInformaciónDetallada();
    }
}
