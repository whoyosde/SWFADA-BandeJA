package org.swfada.Bandeja04.stepdefinition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja04.step.MyStep;

import io.cucumber.java.en.And;

import java.awt.*;

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

    @And("presiono el icono Descargar Dccumentos")
    public void presionoElIconoDescargarDccumentos()throws AWTException {
        myStep.resionoElIconoDescargarDccumentos();
    }

    @Then("valido el documento descargado")
    public void validoElDocumentoDescargado() {
        myStep.validoElDocumentoDescargado();
    }
}
