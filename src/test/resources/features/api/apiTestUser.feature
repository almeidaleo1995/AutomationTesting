Feature: API Testing users for JsonPlaceholder

  Scenario: Create a new user with POST request
    Given I set POST user service endpoint
    When I send a POST HTTP request
    Then I should receive user api status code 201
    And I should receive a valid user ID in response

  Scenario: Update a user with PUT request
    Given I set PUT user service endpoint for user with id 5
    When I update email, latitude and longitude of the user
    Then I should receive user api status code 200
    And I should see the updated email, latitude and longitude
