@test

Feature: Login to www.yandex.ru

  Scenario: Positive - Login with valid credentials
    Given user is on Index page "https://www.yandex.ru"
    Then user clicks on login button
    Then user login with valid credentials

  Scenario: Negative - Login without password
    Given user is on Index page "https://www.yandex.ru"
    Then user clicks on login button
    Then user login without password

    Scenario: Negative - Login with invalid credentials
      Given user is on Index page "https://www.yandex.ru"
      Then user clicks on login button
      Then user login with invalid credentials
