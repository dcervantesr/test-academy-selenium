Feature: Registry of the users

  Narrative:
  In order to record reservations
  As the host of the restaurant
  I want to be able to storage the customers reservations

  Scenario: Register customers reservations
    Given I'm in the reservations page
    When I register the following reservations:
      | origin   | destination | date |
      | Madrid  | Barcelona    | 2022-06-01 |
    Then I get the reservation in the reservations list
