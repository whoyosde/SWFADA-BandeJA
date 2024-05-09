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

    @When("ingreso a la información detallada de una comunicación")
    public void ingresoALaInformaciónDetalladaDeUnaComunicación() {
        myStep.ingresoALaInformaciónDetalladaDeUnaComunicación();
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
