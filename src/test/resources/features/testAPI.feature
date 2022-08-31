@test
  Feature: test API
    Scenario: test API - get single user
      Given get single user info
      Then check status code as 200 and first name as "Janet"