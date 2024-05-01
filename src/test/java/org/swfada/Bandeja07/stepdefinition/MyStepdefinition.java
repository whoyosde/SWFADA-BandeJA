package org.swfada.Bandeja07.stepdefinition;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja07.step.MyStep;

public class MyStepdefinition {

    @Steps
    MyStep myStep;

    @And("selecciono una comunicación")
    public void seleccionoUnaComunicación() {
    }
}
