package org.swfada.Bandeja05.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Random;


public class MyPage extends PageObject {

    @FindBy(xpath = "//table[@id='resultadoComunicacionesRecibidas']/tbody/tr/td/div[@class='estado' and text()='PENDIENTE']")
    private List<WebElementFacade> filas;
    private By filaLocator = By.xpath("//table[@id='resultadoComunicacionesRecibidas']/tbody/tr/td/div[@class='estado' and text()='PENDIENTE']");


    @FindBy (id="b_aceptar")
    private WebElementFacade btnAceptar;

    WebElement filaSeleccionada;

    public void usuarioSeleccionaComunicacion() {

        WebDriverWait wait = new WebDriverWait (getDriver(), 10);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(filaLocator,0));
        int cantReg = filas.size();

        if (cantReg > 0){
            Random valorAleatorio = new Random();
            int filaSeleccionadaIndex = valorAleatorio.nextInt(cantReg);
            //fila=filaSeleccionadaIndex;
            //Seleccionamos la fila seleccionada
            filaSeleccionada = filas.get(filaSeleccionadaIndex);
            filaSeleccionada.click();
        }
    }
    public void usuarioPresionaIconoAsignar() {

        WebDriverWait wait = new WebDriverWait (getDriver(), 2);
        WebElement iconoAsignar = getDriver().findElement(By.xpath("//*[@title='Asignar']"));
        wait.until(ExpectedConditions.elementToBeClickable(iconoAsignar));

        iconoAsignar.click();
        WebDriverWait wait2 = new WebDriverWait (getDriver(), 2);
    }


    public void usuarioPresionaBtnAceptar() {

        WebDriverWait wait1 = new WebDriverWait (getDriver(), 30);
        wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("DIV_ESPERA")));
        btnAceptar.click();
        WebDriverWait wait2 = new WebDriverWait(getDriver(), 4);

    }
}
