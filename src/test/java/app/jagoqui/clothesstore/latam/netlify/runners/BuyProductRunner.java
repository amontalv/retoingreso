package app.jagoqui.clothesstore.latam.netlify.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\app.jagoqui.clothesstore.latam.netlify.feature\\buyproduct.feature",
        glue = "app.jagoqui.clothesstore.latam.netlify.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class BuyProductRunner {
}
