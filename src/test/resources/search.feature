Feature: Search
  As a customer
  I Want to search
  So that I can view or buy respective products

  Scenario: Search for a valid product
    Given Im on homepage
    When I search for product "adidas"
    Then I should be able to see respective products


