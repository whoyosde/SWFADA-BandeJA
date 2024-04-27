package org.swfada.Login1.step.validaions;

import net.thucydides.core.annotations.Step;
import org.swfada.Login1.page.validations.ValidationLoginPage;

public class ValidationLoginStep extends ValidationLoginPage {

    @Step("Visualizar el titulo de la plataforma bandeja")
    public boolean VisibilidadTituloPlataformaBandeja (){
        return (tituloPlataformaBnadeja.isDisplayed());
    }

}
