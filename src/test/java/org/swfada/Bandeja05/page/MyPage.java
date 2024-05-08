package org.swfada.Bandeja05.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;


public class MyPage extends PageObject {

    @FindBy(xpath = "//table[@id='resultadoComunicacionesRecibidas']/tbody/tr/td/div[@class='estado' and text()='PENDIENTE']")
    private List<WebElementFacade> filas;

    private By filaLocator = By.xpath("//table[@id='resultadoComunicacionesRecibidas']/tbody/tr/td/div[@class='estado' and text()='PENDIENTE']");

    @FindBy (id="b_aceptar")
    private WebElementFacade btnAceptar;

    private String codigoSeleccionado;


    WebElement filaSeleccionada;

    public void usuarioSeleccionaComunicacion() {

        WebDriverWait wait = new WebDriverWait (getDriver(), 10);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(filaLocator,0));
        int cantReg = filas.size();

        if (cantReg > 0){

            String codigo;

            Random valorAleatorio = new Random();
            int filaSeleccionadaIndex = valorAleatorio.nextInt(cantReg);
            //Seleccionamos la fila seleccionada
            filaSeleccionada = filas.get(filaSeleccionadaIndex);

            // Obtenemos el XPath de la fila seleccionada
            String xpathCompleto = filaSeleccionada.toString();

            WebElement columnsCodigo = filaSeleccionada.findElement(By.xpath("//table[@id='resultadoComunicacionesRecibidas']/tbody/tr/td[5]"));
            codigo = columnsCodigo.getText();
            codigoSeleccionado = codigo;
            filaSeleccionada.click();
        }
    }

    public void usuarioPresionaIconoAsignar() {

        WebDriverWait wait = new WebDriverWait (getDriver(), 8);
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

    public void usuarioVerificaCambioEstado() {

        int cantReg = filas.size();
        boolean codigoEncontrado = false;

        if (cantReg > 0) {
            for (WebElement fila : filas) {
                WebElement columnsCodigo = fila.findElement(By.xpath("//table[@id='resultadoComunicacionesRecibidas']/tbody/tr/td[5]"));
                String codigo = columnsCodigo.getText();

                if (codigo.equals(codigoSeleccionado)) {
                    codigoEncontrado = true;

                    WebElement columnsEstado = fila.findElement(By.xpath("//table[@id='resultadoComunicacionesRecibidas']/tbody/tr/td[10]"));
                    String estado = columnsEstado.getText();

                    if (estado.equals("ASIGNADO")) {
                        System.out.println("El cambio de estado es exitoso");
                    } else {
                        System.out.println("El cambio de estado no se ha realizado");
                    }
                    break;
                }
            }

            if (!codigoEncontrado) {
                System.out.println("El código no coincide");
            }
        } else {
            System.out.println("No hay filas para verificar.");
        }
    }
}
