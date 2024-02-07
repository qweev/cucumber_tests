package wojtek.com;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/wojtek/com/stories"},
        glue = {"wojtek.com"},
        plugin = {"pretty", "html:target/site/cucumber-pretty.html","summary" }
)
public class RunnerTest {
    // you can run tests also from resources folders in IDE
}
