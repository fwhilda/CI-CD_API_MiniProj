@Order
Feature: Order

  As a user
  I want to order
  So that I can order the item  I want

  Scenario: POST - Create a new order with valid endpoint
    Given I set POST api endpoints order
    When I send POST HTTP request order
    Then I receive valid HTTP response code 401 order

  Scenario: POST - Create a new order with invalid endpoint
    Given I set POST api endpoints order2
    When I send POST HTTP request order2
    Then I receive valid HTTP response code 404 order

  Scenario: GET - Get all orders with valid endpoint
    Given I set GET api endpoints order
    When I send GET HTTP request order
    Then I receive valid HTTP response code 401 order

  Scenario: GET - Get all order with invalid endpoint
    Given I set GET api endpoints order1
    When I send GET HTTP request order2
    Then I receive valid HTTP response code 404 order


