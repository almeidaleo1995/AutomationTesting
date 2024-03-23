Feature: Navigation and data validation on JsonPlaceholder

  Scenario: Access /albums/1/photos and validate data
    Given I am on the JsonPlaceholder guide page
    When I navigate to the link and open it
    Then I validate the data for the object with id = 6
