package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/br/com/newtours/testePraticoWeb/teste", //
glue = { "br.com.newtours.testePraticoWeb", "br.com.newtours.testePraticoWeb.config"},//
plugin = {"pretty"}, //
snippets = SnippetType.CAMELCASE, //
tags = "@scenario01")

public class runner {}

