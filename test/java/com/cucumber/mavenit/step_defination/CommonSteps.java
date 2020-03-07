package com.cucumber.mavenit.step_defination;

import com.cucumber.mavenit.page_Object.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.MatcherAssert.assertThat;

public class CommonSteps {
    private Homepage homepage=new Homepage();
    @Given("^I am at homepage$")
    public void i_am_at_homepage()
    {
        String actual =homepage.getCurrentUrl();
        assertThat(actual,endsWith("co.uk/"));
    }
    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String item)
    {
        homepage.doSearch(item);
    }
}
