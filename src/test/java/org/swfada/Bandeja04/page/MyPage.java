package org.swfada.Bandeja04.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MyPage extends PageObject {
    @FindBy (xpath = "//table[@id='resultadoComunicacionesRecibidas']/tbody/tr")
    private List<WebElementFacade> filas;

    WebElement filaSeleccionada;

    public void usuarioSeleccionaComunicacionLista() {

        int cantReg = filas.size();

        if (cantReg > 0) {
            Random valorAleatorio = new Random();
            int filaSelccionadaIndex = valorAleatorio.nextInt(cantReg);

            //Seleccionar la fila seleccionada
            filaSeleccionada = filas.get(filaSelccionadaIndex);
            filaSeleccionada.click();
        }
    }

    public void usuarioPresionaIconoInformacionDetallada() {

        WebElement iconoInformacionDetallada = filaSeleccionada.findElement(By.xpath(".//img[@alt='informacion']"));
        WebDriverWait wait1 = new WebDriverWait (getDriver(), 6);
        iconoInformacionDetallada.click();
        WebDriverWait wait2 = new WebDriverWait (getDriver(), 10);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='modal-title' and contains(text(), 'Información detallada')]")));
        WebElement tituloInformacionDetallada = getDriver().findElement(By.xpath("//h4[@class='modal-title' and contains(text(), 'Información detallada')"));
        assertTrue(tituloInformacionDetallada.isDisplayed());
    }

    public void usuarioVisualizaVentanaInformacionDetallada() {

        WebElement tituloInformacionDetallada = getDriver().findElement(By.cssSelector("#modal > div > div > div.modal-header > h4"));
        assertTrue(tituloInformacionDetallada.getText().contains("Información detallada"));
    }
}
