package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/AmazoneTest.feature",
                  glue="stepdef",
                  tags=" not @AmazonepayPage "
                  )


public class AmazoneTestRunner {

}
