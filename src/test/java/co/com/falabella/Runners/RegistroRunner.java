package co.com.falabella.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registro.feature",
        glue = "co.com.falabella.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RegistroRunner {
}
