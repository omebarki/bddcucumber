package omar.mebarki.repo;

/**
 * Created by Omar MEBARKI on 25/06/2015.
 * https://www.coveros.com/exploring-glue-code-with-cucumber-jvm/
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber"},
        features = "classpath:bdd/repository.feature",
        glue = "omar.mebarki.repo.impl"
)
public class RunRepositoryTest {
}
