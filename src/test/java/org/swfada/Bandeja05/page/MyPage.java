package org.swfada.Bandeja05.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;


public class MyPage extends PageObject {

    @FindBy(xpath = "//table[@id='resultadoComunicacionesRecibidas']/tbody/tr/td/div[@class='estado' and text()='PENDIENTE']")
    private List<WebElementFacade> filas;
    WebElement filaSeleccionada;
    public void usuarioSeleccionaComunicacion() {

        int cantReg = filas.size();

        if (cantReg > 0){
            Random valorAleatorio = new Random();
            int filaSeleccionadaIndex = valorAleatorio.nextInt(cantReg);

            //Seleccionamos la fila seleccionada
            filaSeleccionada = filas.get(filaSeleccionadaIndex);
            filaSeleccionada.click();
        }


    }
    public void usuarioPresionaIconoAsignar() {

        WebElement iconoAsignar = filaSeleccionada.findElement(By.xpath("//img[@alt='reasignar']"));
        WebDriverWait wait1 = new WebDriverWait (getDriver(), 6);
        iconoAsignar.click();
        WebDriverWait wait2 = new WebDriverWait (getDriver(), 10);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='modal-title' and text()='Asignación de la comunicación']")));
        WebElement tituloAsignacionComunicacion = getDriver().findElement(By.xpath("//h4[@class='modal-title' and text()='Asignación de la comunicación']"));
        assertTrue(tituloAsignacionComunicacion.isDisplayed());
    }
}
