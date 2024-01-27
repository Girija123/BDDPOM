Feature: Login
  As a user
  I should login

  @login
  Scenario: Verify valid login

    Given I am on Home Page "https://www.saucedemo.com"
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click login button
    Then I should land on products page after successful login