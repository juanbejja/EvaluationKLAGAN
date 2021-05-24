Feature: Search Flight
  As a user I want to make a hotel reservation

  Background: 
    Given I am logged in phptravels

  Scenario: Search for a one-way flight from Buenos Aires to Madrid
    Given User is on the home screen
    When Enter the search for a one-way flight from Argentina to Madrid
    Then You will be redirected to the flight search screen
