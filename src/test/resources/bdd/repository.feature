Feature: To be able to store, delete and find clients form a repository

  Scenario: Save a new client in the repository
    Given a client with name "Omar MEBARKI"
    When I save it in the repository
    Then It should have been assigned an id 1
    And saved

  Scenario: Delete a client from the repository
    Given a client with id 1
    When I delete it
    Then he is no longer in the repository