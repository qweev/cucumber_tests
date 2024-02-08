package wojtek.com;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/wojtek/com/stories"},
        glue = {"wojtek.com"},
        plugin = {"pretty", "html:target/site/cucumber-pretty.html","summary" }
//        tags = "@story1and2"
        // can be run with filtering by tags, tags are set in feature files
)
public class RunnerTest {
    // you can run tests also from resources folders in IDE
}
