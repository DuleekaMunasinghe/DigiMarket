Feature: Swiggy Order Placement and Tracking

  Scenario: User places an order on Swiggy
    Given the user is on the Swiggy homepage
    When the user searches for a restaurant
    And selects a food item from the menu
    And adds the item to the cart
    And proceeds to checkout
    Then the user should see the order summary
    And confirms the order

  Scenario: User tracks the Swiggy order
    Given the user has placed an order on Swiggy
    When the user goes to the order tracking page
    Then the user should see the current status of the order
