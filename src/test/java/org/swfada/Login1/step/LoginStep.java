package org.swfada.Login1.step;

import org.swfada.Login1.page.LoginPage;

public class LoginStep extends LoginPage {

    public void ingresarDNI (String numeroDni){
        txt_dni.sendKeys(numeroDni);
    }

    public void ingresarPasswoord (String password){
        txt_password.sendKeys(password);
    }

    public void clickBtnLogin (){
        btnLogin.click();
    }

}
