package org.swfada.Login.step;

import org.swfada.Login.page.MyPage;

public class MyStep {
    private MyPage myPage;
    @net.thucydides.core.annotations.Step
    public void queElUsuarioIngresaALaPlataformaBandeja() {
        myPage.open();
    }

    public void seIniciaSesiónMedianteUsuarioYContraseña(String dni, String contraseña) {
    }
}
