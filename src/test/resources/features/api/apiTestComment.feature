Feature: API Testing comments for JsonPlaceholder

  Scenario: Get a comment by name
    Given I set GET comments service endpoint
    When I search a comment by the name "alias odio sit"
    Then I should receive status code 200
    And I should see the email associated with the name
