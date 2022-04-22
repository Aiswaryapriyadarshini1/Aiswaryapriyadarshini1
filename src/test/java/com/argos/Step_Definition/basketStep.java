package com.argos.Step_Definition;

import com.argos.page.DescriptionPage;
import com.argos.page.HeaderPage;
import com.argos.page.SearchResultPage;
import com.argos.page.TrolleyPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class basketStep {

    private HeaderPage headerPage = new HeaderPage();
    private SearchResultPage searchResultPage = new SearchResultPage();
    private DescriptionPage descriptionPage = new DescriptionPage();
    private TrolleyPage trolleyPage = new TrolleyPage();

    @Given("^Im on homepage to search$")
    public void im_on_homepage_to_search() {
        String actual = headerPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/")));
    }

    @When("^I search for product nike$")
    public void i_search_for_product_nike() {
        headerPage.search("nike");
        searchResultPage.selectAProduct();
    }

    @And("^add the product to trolley$")
    public void add_the_product_to_trolley() {
        descriptionPage.addToTrolley();
    }

    @And("^go to trolley$")
    public void go_to_trolley() {
        descriptionPage.goToTrolley();
    }

    @Then("^I should be able to see nike products$")
    public void i_should_be_able_to_see_nike_products() {
        List<String> actualList = trolleyPage.getProductsInTrolley();
        assertThat(actualList, hasItem("Nike"));
    }

}
