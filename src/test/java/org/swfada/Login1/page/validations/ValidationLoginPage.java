package org.swfada.Login1.page.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationLoginPage extends PageObject {

    @FindBy(xpath ="//img[@id='logoBandeja']")
    protected WebElementFacade tituloPlataformaBnadeja;
}
