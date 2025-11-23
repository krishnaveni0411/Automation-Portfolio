@tag
Feature: Error Validation

  @ErrorValidation
  Scenario Outline: Error Validation
    Given I landed on Ecommerce page
    When Logged in with username <username> and password <password>
    Then "Incorrect email or password." message is displayed

  Examples:
    | username                  | password   |
    | krishanveni1234@krish.com | Qazwsx@123 |

