package hitoriaDeUsuario.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumberHtmlReport",
                "json:target/userstory-report.json"
        },
        glue = {"hitoriaDeUsuario/steps"},
        features = "src/test/java/hitoriaDeUsuario/feature/Ebay.feature"
        ,tags = {"@test_Prueba_web"}
)
public class TestRunner {
}
