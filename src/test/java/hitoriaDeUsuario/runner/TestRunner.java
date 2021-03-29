package hitoriaDeUsuario.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(RunnerPersonalizado.class)
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
public class TestRunner extends AbstractTestNGCucumberTests{
}
