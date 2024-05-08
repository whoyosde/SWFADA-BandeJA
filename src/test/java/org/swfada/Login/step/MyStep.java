package org.swfada.Login.step;

import org.swfada.Login.page.MyPage;

public class MyStep {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void queElUsuarioIngresaALaPlataformaBandeja() {
        myPage.open();
    }

    @net.thucydides.core.annotations.Step
    public void SeIniciaSesiónMedianteUsuarioYContraseña(String dni, String contraseña) {
        myPage.IngresarCredenciales(dni, contraseña);
    }

    @net.thucydides.core.annotations.Step
    public void presionoElBotonEntrar() {
        myPage.PulsarEntrar();
    }

    @net.thucydides.core.annotations.Step
    public void presionoElBotonAceptarObligaciones() {
        myPage.PulsarAceptarObligaciones();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionoElPuestoDeTrabajo(String puesto) {
        myPage.SeleccionarPuestoDeTrabajo(puesto);
    }

    @net.thucydides.core.annotations.Step
    public void presionoElBotonAcceder() {
        myPage.PulsarAcceder();
    }

    public void ValidoQueMeEncuentroEnLaPlataformaBandeja() {
        myPage.ValidarPlataformaBandeja();
    }
}
