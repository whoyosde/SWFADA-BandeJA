package org.swfada.Utilities.WebSite;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class WebSite {
    @Steps(shared = true)
    PageObject bandeja;

    @Step("Navegar al sitio web")
    public void navegarAlSitio (String url){
        bandeja.setDefaultBaseUrl(url);
        bandeja.open();
    }

    private WebDriver driver;
    public void cerrarSesion(){
    if (driver != null) {
          driver.quit();
        }
    }


}
