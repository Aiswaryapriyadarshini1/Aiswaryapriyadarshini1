package com.argos.Step_Definition;

import com.argos.page.HeaderPage;
import com.argos.page.SearchResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchStep {

    private HeaderPage headerPage = new HeaderPage();
    private SearchResultPage searchResultPage = new SearchResultPage();

    @Given("^Im on homepage$")
    public void im_on_homepage() {
String actual = headerPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/")));
    }


    @Then("^I should be able to see respective products$")
    public void i_should_be_able_to_see_respective_products() {
      String actual =  searchResultPage.getProductTitle();
        assertThat("nike", is(equalTo(actual)));
    }

}