package org.swfada.Login1.step.validaions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.swfada.Login1.page.validations.ValidationLoginPage;

public class ValidationLoginStep extends ValidationLoginPage {

    @Step ("Visualizar el título de la pantalla de obligaciones para el uso del sistema")
    public boolean VisibiliadadTituloObligacionesUsoSistema (){
        return (tituloObligacionesUsoSistema.isDisplayed());
    }
}
