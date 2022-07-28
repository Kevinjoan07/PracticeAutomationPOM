package co.com.google.prueba.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleBuscadorPage {

    WebDriver driver;

    By btn_buscador = By.id("tw-gtlink");

    public GoogleBuscadorPage(WebDriver driver){
        this.driver = driver;
    }

    public void on(){
        driver.findElement(btn_buscador).click();
    }


}
