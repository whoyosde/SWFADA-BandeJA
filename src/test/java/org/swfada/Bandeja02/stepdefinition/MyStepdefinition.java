package org.swfada.Bandeja02.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja02.step.MyStep;
import org.swfada.Bandeja02.step.validations.ValidationStep;

public class MyStepdefinition {

    @Steps (shared = true)
    MyStep Bandeja02Step;

    @Steps (shared = true)
    ValidationStep validate;

    @And("presione el botón Aceptar")
    public void usuarioClickBtnAceptarObligaciones(){
        Bandeja02Step.clckBotonAceptarObligaciones();
    }

    @And("seleccione el puesto de trabajo")
    public void usuarioSeleccionaPuestoTrabajo (){
        Bandeja02Step.seleccionarPuestoTrabajoLista("ANALISTA FUNCIONAL (D.G. PATRIMONIO)");
    }

    @And("presione el botón Acceder")
    public void usuarioClickBtnAcceder(){
        Bandeja02Step.clickBtnAcceder();
    }

    @When("da click en nueva comunicación")
    public void usuarioClickIconoNuevaComunicacion (){
        Bandeja02Step.clickIconoNuevaComunicacion();
    }
}
