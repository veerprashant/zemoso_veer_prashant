Feature:Amazon Assignment without LogIn page


 Scenario Outline: Test where login is not Required
   Given User Launch  the browser
   When User Open a URl "<URL>"
    Then Click on Today's deals
    And Click on Third item
#    And Select first item
    When Click on AddToCart button
    Then Go to Cart
    And Verify Minimum Quantity
     When Search for Mobiles
     And Scroll to bottom
     Then Get last item details
     And Navigate back to main



   Examples:
   |URL|
   |https://www.amazon.in/deals?ref_=nav_cs_gb|