package org.swfada.Login1.page.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationLoginPage extends PageObject {

    @FindBy (xpath = "//h4[@class='modal-title error-title' and text()='Obligaciones para el uso del Sistema']")
    protected WebElementFacade tituloObligacionesUsoSistema;

}
