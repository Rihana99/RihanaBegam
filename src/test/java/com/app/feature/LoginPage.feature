Feature: LoginPage Validation

  Scenario: Validate the valid username and password
    Given Login to application
    When Enter the username "Aiite"
    And Enter the password "Airttb345"
    And Enter the login Button
    Then Validate the HomePage
