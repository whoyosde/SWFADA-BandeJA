package org.swfada.Login1.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.swfada.Login1.step.LoginStep;
import org.swfada.Login1.step.validaions.ValidationLoginStep;
import org.swfada.Utilities.WebSite.WebSite;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class LoginDef {
    @Steps(shared = true)
    WebSite url;
    @Steps (shared = true)
    LoginStep Login;
    @Steps(shared = true)
    ValidationLoginStep validate;

    @Given("el usuario navega al sitio web")

    public void usuarioNavegarAlSitio (){
        url.navegarAlSitio("/bandejapru/inicio/indicarInstalacion.action");
    }

    @When("ingresa credenciales validas")
    public void ingresarCredencialesValidas (){
        Login.ingresarDNI ("30268264B");
        Login.ingresarPasswoord("30268264B");
        Login.clickBtnLogin();
    }

    @Then("el sistema muestra la pantalla obligaciones para el uso del sistema")
    public void sistemaMuestraTituloObligacionesUsoSistema (){
        Assert.assertTrue(validate.VisibiliadadTituloObligacionesUsoSistema());
    }
}
