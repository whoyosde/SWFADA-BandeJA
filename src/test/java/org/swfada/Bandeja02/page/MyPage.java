package org.swfada.Bandeja02.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.File;

public class MyPage extends PageObject {

    @FindBy (xpath = "//a/span/img[@title='Nueva comunicacion']")
    private WebElementFacade NuevaComunicacion;

    @FindBy (xpath = "//input[@id='descripcionAltaComunicacion']")
    private WebElementFacade txt_asunto;

    @FindBy (xpath = "(//li/input[@class=\"select2-search__field\"])[1]")
    private WebElementFacade selecProcedimiento;

    public void ValidarBandeja() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoBandeja")));
        WebElement bandeja = getDriver().findElement(By.id("logoBandeja"));
        assertTrue(bandeja.isDisplayed());
    }

    public void usuarioPresionaEnNuevaComunicacion() {
        WebDriverWait wait = new WebDriverWait (getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultadoComunicacionesRecibidas_wrapper")));
        NuevaComunicacion.waitUntilClickable();
        NuevaComunicacion.click();
    }

    public void sistemaMuesraVentanaAltaComunicacin() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 180);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']")));
        WebElement titulo = getDriver().findElement(By.tagName("h4"));
        assertEquals("Alta de comunicación", titulo.getText());
    }
    public void usuarioRegistraAsunto(String asunto) {
        txt_asunto.sendKeys(asunto);
    }
    public void usuarioSeleccionaProcedimientoServicio(String procedimiento) {
        selecProcedimiento.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//optgroup/option[contains(text(),'" + procedimiento + "')]"));
        clickOn(selectOptions);
    }

}
