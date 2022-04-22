Feature: Price filter

  As a customer
  I Want to search and add products to trolley
  So that I can view products

  Scenario Outline: Price filter
    Given Im on homepage
    When I search for product "<searchTerm>"
    And I filter the price "<choice>"
    And select a product
    And add the product to trolley
    And go to trolley
    Then I should be able to see products between minPrice, maxPrice
    Examples:
    |searchTerm|choice|
    |adidas|£5 - £10|
    |puma|£5 - £10|



