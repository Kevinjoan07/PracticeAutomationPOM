package co.com.google.prueba.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TraductorPage {
    WebDriver driver;

    By txt_palabra_sp=By.className("er8xn");
    By btn_area_texto = By.className("QFw9Te");


    public TraductorPage(WebDriver driver){
        this.driver= driver;
    }

    public void traducirPalabra(){
        driver.findElement(txt_palabra_sp).sendKeys("Cheese");
        driver.findElement(txt_palabra_sp).sendKeys(Keys.ENTER);



    }




}
