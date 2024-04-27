package org.swfada.Login.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.Login.step.MyStep;
import org.swfada.Login1.step.LoginStep;


public class MyStepdefinition {

 @Steps (shared = true)
 MyStep Login;
@Steps
   private MyStep myStep;
    @Dado("que el usuario ingresa a la plataforma Bandeja")
    public void queElUsuarioIngresaALaPlataformaBandeja() {
        myStep.queElUsuarioIngresaALaPlataformaBandeja();
    }

    @Cuando("se inicia sesión mediante usuario {string} y contraseña {string}")
    public void seIniciaSesiónMedianteUsuarioYContraseña(String DNI, String contraseña) {
    }

    @Y("presiono el boton entrar")
    public void presionoElBotonEntrar() {
    }

    @Entonces("se carga las comunicaciones")
    public void seCargaLasComunicaciones() {
    }
}
