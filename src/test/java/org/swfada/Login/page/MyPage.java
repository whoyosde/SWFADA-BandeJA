package org.swfada.Login.page;

import lombok.Builder;
import net.bytebuddy.implementation.bind.annotation.Default;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("/bandejapru/inicio/indicarInstalacion.action")
public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@id='boton_certificado']")
    private WebElementFacade CertificadoElectronico;


}
