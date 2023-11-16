# Author: your.email@your.domain.com
# Keywords Summary :
# Feature: List of scenarios.
# Scenario: Business rule through a list of steps with arguments.
# Given: Some precondition step
# When: Some key actions
# Then: To observe outcomes or validation
# And, But: To enumerate more Given, When, Then steps
# Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
# Examples: Container for a table
# Background: List of steps run before each of the scenarios
# """ (Doc Strings)
# | (Data Tables)
# @ (Tags/Labels): To group Scenarios
# <> (placeholder)
# "" (Comments)
# Sample Feature Definition Template

Feature: Order Pizza from Swiggy
  Scenario: User can order pizza successfully
    Given Navigate to the landing page of Swiggy "https://www.swiggy.com/"
    When Enter location as "<city>"
    Then Select the first location from the suggested locations in the suggestion-box
    # When Redirect to the ItemPage
    # When Hover over the search icon
    # When Enter Item as "Pizza"
    # When Select the first suggested Item in the pizza category
    # When Search for a restaurant and select the first restaurant
    # When Redirect to the orderPage
    # When Add the first item to the cart
    # When Click on the checkout button
    Then Order a pizza successfully

  Examples:
    | city    |
    | Mumbai  |
    # | Chennai | (Commented out for now)
