/*package com.argos;

import com.argos.page.DescriptionPage;
import com.argos.page.HeaderPage;
import com.argos.page.SearchResultPage;
import com.argos.page.TrolleyPage;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SmokeTestSuite extends Hooks {



   private HeaderPage headerPage = new HeaderPage();
   private SearchResultPage searchResultPage = new SearchResultPage();
   private DescriptionPage descriptionPage = new DescriptionPage();
   private TrolleyPage trolleyPage = new TrolleyPage();

    @Test
    public void searchTest() {
        headerPage.search("nike");
        String actual = searchResultPage.getProductTitle();
        assertThat("nike", is(equalTo(actual)));
        String actualUrl = searchResultPage.getCurrentUrl();
        assertThat(actualUrl, endsWith("nike"));
    }

    @Test
    public void basketTest() {
        headerPage.search("nike");
        searchResultPage.selectAProduct();
        descriptionPage.addToTrolley();
        descriptionPage.goToTrolley();
        List<String> actualList = trolleyPage.getProductsInTrolley();
        assertThat(actualList, hasItem("nike"));
    }


    @Test
    public void quantityTest() {
        headerPage.search("nike");
        searchResultPage.selectAProduct();
        descriptionPage.addToTrolley();
        descriptionPage.goToTrolley();
        double priceForProduct = trolleyPage.getPriceForProduct();
        int quantityChange = 3;
        double expected = priceForProduct * quantityChange;
        trolleyPage.selectQuantity(quantityChange);
        double actual = trolleyPage.getPriceForProduct();
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void reviewTest() {
        headerPage.search("nike");
        searchResultPage.selectRating("1");
        List<Double> actual = searchResultPage.getAllProductRatings();
        assertThat(actual, everyItem(greaterThanOrEqualTo(1.0)));
    }

    @Test
    public void shopByTest(){
        headerPage.hoverItem("Shop");
      //  headerPage.hoverToLeftPanel("Technology");
        // headerPage.hoverToProductItem("Television").click();
    }



    @Test
    public void priceTest() {

    }

    @Test
    public void multiFilterTest() {

    }

    @Test
    public void morePriceTest(){

    }

}*/