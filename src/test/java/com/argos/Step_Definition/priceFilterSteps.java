package com.argos.Step_Definition;

import com.argos.page.DescriptionPage;
import com.argos.page.HeaderPage;
import com.argos.page.SearchResultPage;
import com.argos.page.TrolleyPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class priceFilterSteps {
    private HeaderPage headerPage = new HeaderPage();
    private SearchResultPage searchResultPage = new SearchResultPage();
    private DescriptionPage descriptionPage = new DescriptionPage();
    private TrolleyPage trolleyPage = new TrolleyPage();

    @When("^I search for product \"([^\"]*)\"$")
    public void i_search_for_product(String searchTerm) {
        headerPage.search(searchTerm);
    }

    @And("^I filter the price \"([^\"]*)\"$")
    public void i_filter_the_price(String choice) {
        searchResultPage.selectPrice(choice);
    }

    @And("^select a product$")
    public void select_a_product() {
        searchResultPage.selectAProduct();
    }

    @Then("^I should be able to see products between minPrice, maxPrice$")
    public void i_should_be_able_to_see_products_between_minPrice_maxPrice() {
    List<Double> actual= searchResultPage.getAllPriceFilter();
        assertThat(actual, Matchers.<List<Double>>is((List<Double>) greaterThanOrEqualTo(5.00)));
        assertThat(actual, Matchers.<List<Double>>is((List<Double>) lessThanOrEqualTo(10.00)));
    }

}
