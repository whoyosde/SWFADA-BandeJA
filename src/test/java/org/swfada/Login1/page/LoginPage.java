package org.swfada.Login1.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{
    @FindBy(xpath = "//input[@id='dni']")
    protected WebElementFacade txt_dni;

    @FindBy (xpath = "//input[@id='pw']")
    protected WebElementFacade txt_password;

    @FindBy (xpath = "//button[@class='btn botonLogin']")
    protected WebElementFacade btnLogin;
}






