package co.com.google.prueba.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/googletraslate.feature",
        glue = "co.com.google.prueba.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class GoogleTranslate {
}
