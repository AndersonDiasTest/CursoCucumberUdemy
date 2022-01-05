package br.com.udemy.core;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/",
//		tags = "not @ignore",
		glue = "br.com.udemy.steps",
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = true,
		publish = false
//		strict = false
		)
public class RunnerContas {

	
}
