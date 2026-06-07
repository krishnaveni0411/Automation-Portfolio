# Project 3 – Warp the Selenium Code with Cucumber

## Overview  
This project demonstrates a Behavior-Driven Development (BDD) test automation framework using **Selenium WebDriver** and **Cucumber**. The goal is to “wrap” existing Selenium automation in Cucumber’s Gherkin syntax to make test scenarios more readable, maintainable, and aligned with business requirements.

---

## Tech Stack  
- **Java** – for writing test code  
- **Selenium WebDriver** – for browser automation  
- **Cucumber** – for BDD, writing Gherkin feature files  
- **Maven** – for dependency management and build  
- (Optional) **TestNG / JUnit** – as test runner for executing Cucumber tests  
- (Optional) **WebDriverManager** – to manage browser driver binaries  
- (Optional) **Reporting Library** (Allure / Extent / Cucumber HTML) – to generate test reports  

---

## Getting Started

### Prerequisites  
Make sure the following are installed on your machine:  
- Java (version compatible with your project)  
- Maven  
- A compatible browser (Chrome, Firefox, etc.)  
- Browser driver (if not using WebDriverManager)  

### Setup  
1. Clone the repository:  
   ```bash
   git clone https://github.com/krishnaveni0411/Automation-Portfolio.git
   
2. Navigate to the project folder:
cd "Automation-Portfolio/Project 3 - warp the selenium code with cucumber"

3. Install dependencies:
mvn clean install

4. Running Tests
- You can run the tests using Maven commands. For example:
mvn test
- If you want to run a specific feature file, you can use:
mvn test -Dcucumber.options="--plugin html:target/cucumber-html-report --glue src/test/java path/to/your.feature"

---

## Writing New Tests

### Feature Files
- Create .feature files under src/test/resources/features.
- Use Gherkin syntax: Feature, Scenario, Given/When/Then, Scenario Outline, etc.
- Keep scenarios readable and business-focused.

### Step Definitions
- Implement step definitions in Java classes under src/test/java/stepdefinitions.
- Use Cucumber annotations (@Given, @When, @Then) to bind steps to methods.
- Reuse step definitions to reduce duplication.

### Reporting
- Generate readable test reports (e.g., HTML, JSON) using Cucumber plugins.
- Optionally integrate with a reporting tool like Allure or Extent Reports for enhanced visual reports.

---
## Best Practices
- Use Page Object Model (POM) to structure page-related code cleanly.
- Use Hooks (@Before, @After) to set up and tear down WebDriver.
- Parameterize tests using Scenario Outlines and Examples in feature files.
- Keep step definitions DRY — reuse steps wherever possible.
- Manage timeouts and waits smartly (explicit waits, not Thread.sleep).
- Use WebDriverManager (or similar) to manage driver binaries easily.
- Store configuration (like base URL, browser) in a separate config file or properties.

---
