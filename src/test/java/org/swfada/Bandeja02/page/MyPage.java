package org.swfada.Bandeja02.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MyPage extends PageObject {

    @FindBy(xpath = "//a/span/img[@title=\"Nueva comunicacion\"]")
    private WebElementFacade NuevaComunicacion;

    public void clickNuevaComunicacion() {
        NuevaComunicacion.click();
    }

    public void VisualizarVentana() {
    }
}
