package org.swfada.Bandeja02.step.validations;

import net.thucydides.core.annotations.Step;
import org.swfada.Bandeja02.page.validations.ValidationPage;

public class ValidationStep extends ValidationPage {

    @Step ("Validar visualización de la ventana del alta de nueva comuicación")

    public Boolean visibilidadTituloAltaComunicacion(){
        return tituloVentanaAltaNuevaComunicacion.isDisplayed();
    }
}
