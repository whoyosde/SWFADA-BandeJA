package org.swfada.Bandeja02.page.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import javax.xml.xpath.XPath;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//h4[@class='modal-title' and text()='Alta de comunicación']")
    protected WebElementFacade tituloVentanaAltaNuevaComunicacion;

}
