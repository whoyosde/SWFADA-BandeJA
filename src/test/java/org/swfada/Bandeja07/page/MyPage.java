package org.swfada.Bandeja07.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.lang.Thread;

public class MyPage extends PageObject {

    //Encontrar todos los tr dentro de la tabla
   @FindBy (xpath = "//table[@id='resultadoComunicacionesRecibidas']/tbody/tr")
   private List<WebElementFacade> filas;

   @FindBy (xpath = "//img[@data-original-title='Reenviar\"]")
   private WebElementFacade iconoReenviar;

   @FindBy (id ="destinoComunicacion")
   private WebElementFacade destinoComunicaion;

   @FindBy (id = "botonReenvio")
   private WebElementFacade btnReenviar;

    WebElement filaSeleccionada;

    public void usuarioSeleccionaUnaComunicacion() {

        int cantReg = filas.size();

        if (cantReg > 0) {
            Random valorAleatorio = new Random();
            int filaSelccionadaIndex = valorAleatorio.nextInt(cantReg);

            //Seleccionar la fila seleccionada
            filaSeleccionada = filas.get(filaSelccionadaIndex);
            filaSeleccionada.click();
        }
    }

    public void usuarioPresionaIconoReenviar() {

        WebElement iconoReenviar = filaSeleccionada.findElement(By.xpath(".//img[@alt='reenviar']"));
        WebDriverWait wait1 = new WebDriverWait (getDriver(), 6);
        iconoReenviar.click();
        WebDriverWait wait2 = new WebDriverWait (getDriver(), 10);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='modal-title' and text()='Reenvío de la comunicación']")));
        WebElement tituloReenvioComunicacion = getDriver().findElement(By.xpath("//h4[@class='modal-title' and text()='Reenvío de la comunicación']"));
        assertTrue(tituloReenvioComunicacion.isDisplayed());
    }

    public void elSistemaMuestraLaVentanaReenvioDeLaComunicación() {
        WebElement tituloReenvioComunicacion = getDriver().findElement(By.cssSelector("#modal > div > div > div.modal-header > h4"));
        assertEquals("Reenvío de la comunicación", tituloReenvioComunicacion.getText());
    }

    public void usuarioSeleccionaDestinoComunicacion(String destinoCo) {
        destinoComunicaion.sendKeys(destinoCo);
        WebElement Destino = getDriver().findElement(By.xpath("//span[contains(text(),'" + destinoCo + "')]"));
        Destino.click();
    }

    public void presionoElBotónReenviar() {
        btnReenviar.click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait1 = new WebDriverWait (getDriver(), 6);
        try {
            wait1.wait();
        }catch (Exception ex){

        }
        WebElement mensajeAleta = null;
        int contador=0;
        do{
            try {
                mensajeAleta = getDriver().findElement(By.xpath("//[@id='toast-container']"));
            }catch (Exception ex) {

            }
            WebDriverWait wait2 = new WebDriverWait (getDriver(), 1);
            //Thread.sleep(1000);
            contador ++;
        }
        while (mensajeAleta != null && contador <60);
        if(mensajeAleta!=null){
            if(mensajeAleta.getText().equals("Comunicación reenviada correctamente.")){
                System.out.println("Exito");
            }else {
                System.out.println("Error: "+mensajeAleta.getText());
            }
        }else{
            System.out.println("Error: No se muestra el toast");
        }

    }

    public void usuarioVisualizaMensajeConfirmacionReenvio() {
    }
}
