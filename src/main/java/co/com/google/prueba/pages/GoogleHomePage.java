package co.com.google.prueba.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

   By txt_buscador  = By.name("q");



    WebDriver driver;


    public GoogleHomePage(WebDriver driver){
        this.driver = driver;
    }


    public void ingresaTraductor() {
        driver.findElement(txt_buscador).sendKeys("Traductor");
        driver.findElement(txt_buscador).sendKeys(Keys.ENTER);

    }
}
