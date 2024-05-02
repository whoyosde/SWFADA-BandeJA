package org.swfada.Bandeja05.stepdefinition;
import io.cucumber.java.en.And;
import org.swfada.Bandeja05.step.MyStep;
import net.thucydides.core.annotations.Steps;

public class MyStepdefinition {


    @Steps
    MyStep myStep;

    @And ("selecciono comunicación")
    public void seleccionoComunicación(){

    }


}
