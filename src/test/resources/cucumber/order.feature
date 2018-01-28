Feature: order
 Scenario Outline: Order TShirt & Verify item exist in Order History
    Given A page to login and order
    When User orders tshirt
    Then item exists in order history 

    Examples: 
      | URL |
      |url.com|
