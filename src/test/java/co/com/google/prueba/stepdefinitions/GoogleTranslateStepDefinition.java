package co.com.google.prueba.stepdefinitions;


import co.com.google.prueba.pages.GoogleBuscadorPage;
import co.com.google.prueba.pages.GoogleHomePage;
import co.com.google.prueba.pages.TraductorPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleTranslateStepDefinition {


    WebDriver driver;
    GoogleHomePage home;
    GoogleBuscadorPage buscador;
    TraductorPage Luego;

    @Before
    public void setup(){
        System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
        driver =  new ChromeDriver();
        home = new GoogleHomePage(driver);
        buscador = new GoogleBuscadorPage(driver);
        Luego = new TraductorPage(driver);


    }


    @Given("^ingreso al traductor de google$")
    public void ingresoAlTraductorDeGoogle() {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize() ;
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;


    }

    @When("^traduzco la palabra Queso a ingles$")
    public void traduzcoLaPalabraQuesoAIngles() throws InterruptedException {
        home.ingresaTraductor();
        buscador.on();
        Thread.sleep(5000);
        Luego.traducirPalabra();
        Thread.sleep(5000);

    }

    @Then("^verifico la palabra Cheese$")
    public void verificoLaPalabraCheese() {
        String palabra = "Queso";
        String xpath = driver.findElement(By.className("Q4iAWc")).getText();
        Assert.assertThat(xpath, Matchers.is(palabra));
        driver.close();


    }
}
