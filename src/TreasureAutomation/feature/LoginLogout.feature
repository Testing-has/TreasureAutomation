Feature: Treasure Application Homepage Login and Logout

  Scenario: Login and Logout
    Given the user is on Treasure landing page
    When the user logs into application using username and password
    And user clicks on Sign in button
  Then treasure homepage is displayed and user clicks on logout button