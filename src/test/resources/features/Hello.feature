Feature: Hello

  As a user
  I want to get hello
  So that I can get api hello endpoints

  Scenario: GET - Get Say Hello with valid endpoint
    Given I set GET api endpoints hello
    When I send GET HTTP request hello
    Then I receive valid HTTP response code 200 hello

  Scenario: GET - Get Say Hello with invalid endpoint
    Given I set GET api endpoints hello2
    When I send GET HTTP request hello2
    Then I receive valid HTTP response code 404 hello

