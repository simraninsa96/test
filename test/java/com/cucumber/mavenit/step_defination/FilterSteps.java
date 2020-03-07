package com.cucumber.mavenit.step_defination;

import com.cucumber.mavenit.page_Object.ResultsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class FilterSteps {

    private ResultsPage resultsPage=new ResultsPage();

    @When("^I apply filter  review \"([^\"]*)\"$")
    public void i_apply_filter_review(String filter)
    {
      resultsPage.selectFilter(filter);
    }
    @Then("^I should be able to see refined results review \"([^\"]*)\"$")
    public void i_should_be_able_to_see_refined_results_review(Double expected)
    {
       List<Double> actual= resultsPage.getProductRating();
       assertThat(actual, everyItem(is(greaterThanOrEqualTo(expected))));
    }
}
