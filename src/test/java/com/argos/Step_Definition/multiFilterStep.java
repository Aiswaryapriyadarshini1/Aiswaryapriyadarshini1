package com.argos.Step_Definition;

import com.argos.page.SearchResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class multiFilterStep {

    private SearchResultPage searchResultPage = new SearchResultPage();

        @And("^I filter the ratings \"([^\"]*)\"$")
        public void iFilterTheRatings(String choices) {
            searchResultPage.selectRating(String.valueOf(1.0));
        }

    @Then("^I should be able to see products between minPrice, maxPrice and rating choice$")
    public void iShouldBeAbleToSeeProductsBetweenMinPriceMaxPriceAndRatingChoice() {
        List<Double> actual = searchResultPage.getAllProductRatings();
        assertThat(actual, everyItem(greaterThanOrEqualTo(1.0)));
    }
}
