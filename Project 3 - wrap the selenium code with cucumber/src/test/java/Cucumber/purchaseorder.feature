@tag
Feature: Purchase the order from Ecommerce Website

  Background:
    Given I landed on Ecommerce page

  @Regression
  Scenario Outline: Positive test for submitting the order
    Given Logged in with username <username> and password <password>
    When add the product <productName> to the cart
    And checkout "<productName>" and submit the order
    Then "Thankyou for the order." message is displayed on confirmation page.

  Examples:
    | username                | password   | productName   |
    | krishanveni123@krish.com | Qazwsx@123 | ADIDAS ORIGINAL |

