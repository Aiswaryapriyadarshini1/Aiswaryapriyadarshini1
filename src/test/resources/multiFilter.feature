Feature: multi filter

  As a customer
  I Want to search and add products to trolley
  So that I can view products

  Scenario Outline: multi filter
    Given Im on homepage
    When I search for product "<searchTerm>"
    And I filter the price "<choice>"
    And I filter the ratings "<choices>"
    And select a product
    And add the product to trolley
    And go to trolley
    Then I should be able to see products between minPrice, maxPrice and rating choice
    Examples:
      |searchTerm|choice|choices|
      |adidas|£5 - £10|1.0     |
      |puma|£5 - £10|1.0       |
