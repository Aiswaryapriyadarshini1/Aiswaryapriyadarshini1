Feature: basket
  As a customer
  I Want to search and add products to trolley
  So that I can view products

  @Smoke
  Scenario: Add product to basket
    Given Im on homepage to search
    When I search for product "nike"
    And add the product to trolley
    And go to trolley
    Then I should be able to see nike products