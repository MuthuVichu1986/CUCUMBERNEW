Feature: Shopping cart


  @regression
  Scenario: Add item to cart
    Given I am on the product page
    When I add the item to cart
    Then the item should be added successfully
   
  @regression
  Scenario: Remove item to cart
    Given I have items in the cart page
    When I have remove the item from cart
    Then the item should be removed successfully
    
   @smoke
  Scenario: View cart
    Given I have items in the cart page
    When I view the cart
    Then I should see the items in the cart
