package org.swfada.Login.page;

import lombok.Builder;
import net.bytebuddy.implementation.bind.annotation.Default;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

@DefaultUrl("/bandejapru/inicio/indicarInstalacion.action")

public class MyPage extends PageObject {

    @FindBy(id ="dni")
    private WebElementFacade campoDNI;

    @FindBy(id ="pw")
    private WebElementFacade campoContraseña;

    @FindBy(xpath = "//button[contains(text(),'Entrar')]")
    private WebElementFacade btnEntrar;

    @FindBy(xpath = "//button[contains(text(),'Aceptar')]")
    private WebElementFacade btnAceptarObligaciones;

    @FindBy(id="usuarioSeleccionado")
    private WebElementFacade listaPuestos;

    @FindBy(xpath = "//button[contains(text(),'Acceder')]")
    private WebElementFacade btnAcceder;


    public void IngresarCredenciales(String dni, String contraseña) {
        campoDNI.sendKeys(dni);
        campoContraseña.sendKeys(contraseña);
    }

    public void PulsarEntrar() {
        btnEntrar.click();
    }

   public void PulsarAceptarObligaciones() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Obligaciones para el uso del Sistema')]")));
        btnAceptarObligaciones.click();
    }

    public void SeleccionarPuestoDeTrabajo(String puesto) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contenido-nuevo-inicio")));
        listaPuestos.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + puesto + "')]"));
        clickOn(selectOptions);
    }

    public void PulsarAcceder() {
        btnAcceder.click();
    }

    public void ValidarPlataformaBandeja() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoBandeja")));
        WebElement bandeja = getDriver().findElement(By.id("logoBandeja"));
        assertTrue(bandeja.isDisplayed());
    }
}
