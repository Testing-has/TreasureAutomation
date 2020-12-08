Feature: Download File
  Scenario: Download already uploaded file
    Given the user is on Treasure Homepage
    When the user selects the already uploaded file and Click on download link
    Then the file gets downloaded