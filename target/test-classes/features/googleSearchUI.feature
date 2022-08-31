@test
Feature: search on google
  Scenario: search coffee-machine on google.com
    Given user is on "https://www.google.com/"
    Then user enters "купить кофемашину bork c804" in the search-field
    Then user should see more than 10 results
    And result contains "mvideo.ru"