package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "com/zerobank/step_definitions",
        features = "src/test/resources/features",
        dryRun =false,
        strict = false,
        tags = "@account_activity2",
        plugin = {
                "html:target/cucumber-html-report",
                "json:target/cucumber.json" ,
                "rerun:target/rerun.txt"
        }

)

public class CukesRunner {

}
