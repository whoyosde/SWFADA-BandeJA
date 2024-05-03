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

    @FindBy(xpath = "//table[@id='resultadoListadoUsuarios']/tbody/tr")
    private List<WebElementFacade> filaUsuario;

    @FindBy (id = "b_aceptar")
    private WebElementFacade btnAceptar;

    WebElement filaSeleccionada;

    WebElement filaSeleccionadaUsuario;
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

    public void usuarioVisualizaVentanaAsignacionComunicacion() {
        WebElement tituloAsignacionComunicacion = getDriver().findElement(By.cssSelector("#modal > div > div > div.modal-header > h4"));
        assertEquals("Asignación de la comunicación", tituloAsignacionComunicacion.getText());
    }

    public void usuarioSeleccionaNombrePersonaAsignar() {

        int cantReg = filaUsuario.size();

        if (cantReg > 0) {
            Random valorAleatorio = new Random();
            int filaSeleccionadaIndex = valorAleatorio.nextInt(cantReg);

            //Seleccionamos la fila seleccionada
            filaSeleccionadaUsuario = filaUsuario.get(filaSeleccionadaIndex);
            filaSeleccionadaUsuario.isSelected();
        }
    }

    public void usuarioPresionaIconoAsignacion() {

        WebElement iconoAsignarUsuario = filaSeleccionadaUsuario.findElement(By.xpath("//img[@alt='Asignar']"));
        WebDriverWait wait1 = new WebDriverWait (getDriver(), 6);
        iconoAsignarUsuario.click();
        WebDriverWait wait2 = new WebDriverWait (getDriver(), 10);

        WebElement estado = filaSeleccionadaUsuario.findElement(By.xpath("//span[@class='asignado' and text()='Asignado']"));
        wait2.until(ExpectedConditions.textToBePresentInElement(estado, "Asignado"));
    }

    public void usuarioPresionaBtnAceptar() {

        btnAceptar.click();
        WebDriverWait wait = new WebDriverWait (getDriver(), 6);

        WebElement nuevoEstado = filaSeleccionada.findElement(By.xpath("//td[@class='estado' and text()='ASIGNADO']"));
        assertEquals("ASIGNADO", nuevoEstado.getText());
    }
}
