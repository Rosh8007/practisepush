package rUnner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src//test//resources//features//login.feature"},glue = {"stepdef"},tags = {"@RRR1,@RRR2,@RRR3"},
format = {"pretty","html:target/destination"})
	
public class runner {
	
	

}
