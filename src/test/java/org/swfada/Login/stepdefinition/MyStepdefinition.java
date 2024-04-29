package org.swfada.Login.stepdefinition;

import com.ibm.icu.impl.LocaleDisplayNamesImpl;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.Login.step.MyStep;


public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Dado("que el usuario ingresa a la plataforma Bandeja")
    public void queElUsuarioIngresaALaPlataformaBandeja() {
        myStep.queElUsuarioIngresaALaPlataformaBandeja();
    }

    @Cuando("se inicia sesión mediante usuario {string} y contraseña {string}")
    public void seIniciaSesiónMedianteUsuarioYContraseña(String dni, String contraseña) {
        myStep.SeIniciaSesiónMedianteUsuarioYContraseña(dni, contraseña);
    }


    @Y("presiono el boton Entrar")
    public void presionoElBotonEntrar() {
        myStep.presionoElBotonEntrar();
    }

    @Y("presiono el boton Aceptar obligaciones")
    public void presionoElBotonAceptarObligaciones() {
        myStep.presionoElBotonAceptarObligaciones();
    }

    @Cuando("selecciono el puesto de trabajo {string}")
    public void seleccionoElPuestoDeTrabajo(String puesto) {
        myStep.seleccionoElPuestoDeTrabajo(puesto);
    }

    @Y("presiono el boton Acceder")
    public void presionoElBotonAcceder() {
        myStep.presionoElBotonAcceder();
    }

}
