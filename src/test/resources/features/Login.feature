Feature: Saucedemo login

  @UC-1
  Scenario: Test Login form with empty credentials
    Given I am on the Saucedemo home page
    When I fill credentials with username "standard_user" and password "secret_sauce"
    And I clear the input fields
    And I click login button
    Then I should see error message "Epic sadface: Username is required"

  @UC-2
  Scenario: Test Login form with credentials by passing Username
    Given I am on the Saucedemo home page
    When I fill credentials with username "visual_user" and password "secret_sauce"
    And I clear the password field
    And I click login button
    Then I should see error message "Epic sadface: Password is required"

  @UC-3
  Scenario: Test Login form with credentials by passing Username & Password
    Given I am on the Saucedemo home page
    When I fill credentials with username "standard_user" and password "secret_sauce"
    And I click login button
    Then I should see inventory page with "Swag Labs" header title
    And I should see inventory page with 6 items
