# 🧪 Selenium Automation Portfolio – Complete Project Suite

# My 30-Day Transition to Automation QA 🚀
Welcome to my portfolio! This repository documents my "30-Day Do or Die" challenge where I successfully transitioned from Manual QA to an Automation QA Engineer.
Over 30 days, I learned Java, Selenium WebDriver, TestNG, and modern testing practices. 
## 🌟 My Master Project
While I built many small assignments during my learning journey, I consolidated all my knowledge into one enterprise-level framework. 
👉 **[Click here to view my main Showcase Project: E-Commerce UI Automation Framework](https://github.com/krishnaveni0411/selenium-java-testng-ecommerce-automation-framework)** 👈
**Highlights of my main framework:**
- Built entirely from scratch using Java and Selenium.
- Data-driven testing using TestNG.
- Comprehensive Extent Reports.
- Page Object Model (POM) architecture.
## 🤝 Let's Connect
Follow my continuing journey on [LinkedIn](https://www.linkedin.com/in/krishnaveni-k04/)!

---
## 🚀 About This Repository

A full-stack automation portfolio featuring **three complete real-world automation projects**, built using **Selenium WebDriver**, **Java**, **TestNG**, **Maven**, **Page Object Model (POM)**, and **Cucumber BDD**.

This repository tracks my automation learning & execution journey from fundamentals → advanced automation → real-world framework implementation → BDD adoption.

It demonstrates:  
✔ Daily practical assignments  
✔ Real e-commerce automation  
✔ Modular POM framework  
✔ BDD Cucumber integration  
✔ Data-Driven testing  
✔ Professional reporting & CI/CD readiness  

---

##  Repository Link

🔗 **GitHub – Automation Portfolio**  
[https://github.com/krishnaveni0411/Automation-Portfolio](https://github.com/krishnaveni0411/Automation-Portfolio)

---

## 📦 Projects Included

| Project No. | Project Name                               | Tech Focus                                          |
|------------:|--------------------------------------------|-----------------------------------------------------|
| **Project 1** | Selenium Core Assignments & Challenges     | Selenium Fundamentals, UI Automation, Synchronization |
| **Project 2** | E-Commerce Automation using POM            | Scalable Automation Framework, POM, TestNG, JSON Data |
| **Project 3** | Warp the Selenium Code with Cucumber (BDD) | BDD, Feature Files, Gherkin, Cucumber Runners       |

---

# 🏗️ Project 1 – Selenium Assignments & Real-Time Challenges

A beginner-to-intermediate hands-on suite containing **daily Selenium practice**, structured enhancements, and real-time automation problems.

###  Key Highlights

- End-to-End Automation Flows  
- Dropdowns (static / dynamic / custom)  
- Alerts & JavaScript popups  
- Calendar/date picker automation  
- Scroll handling with `JavascriptExecutor`  
- Synchronization: Implicit, Explicit, and Fluent Wait  
- Web table extraction, validation, and filtering  
- Pagination handling  
- Multi-window and tab handling  
- Java Streams-based automation logic  
- Real-world **Amazon-style cart logic challenge**

###  Execution Modes

- **Without TestNG** – Basic raw Selenium scripts  
- **With TestNG** – Structured & scalable test suite with assertions and annotations  

## 📁 Folder Structure – Project 1 (Selenium Core Assignments & Exercises)

```
Project 1/
├── without TESTNG FreamWork/
│   ├── Day1_BasicLocators.java
│   ├── Day2_StaticDropdown.java
│   ├── Day3_DynamicDropdown.java
│   ├── Day4_SuggestiveDropdown.java
│   ├── Day5_CustomDropdown.java
│   ├── Day6_Checkbox.java
│   ├── Day7_CalendarValidation.java
│   ├── Day8_Alerts.java
│   ├── Assignment1_CheckboxExercise.java
│   ├── Assignment2_UIFormAutomation.java
│   ├── ....(more files)
│
├── With TESTNG/
│   ├── Day9_ImplicitExplicitWait.java
│   ├── Day10_FluentWait.java
│   ├── Day11_ActionsClass.java
│   ├── Day12_WindowHandling.java
│   ├── Day13_FramesDragDrop.java
│   ├── Day14_FooterLinksChallenge.java
│   ├── Day15_DatePicker.java
│   ├── Day16_Scrolling.java
│   ├── Day17_TableGrid.java
│   ├── Day18_WebTableAssignment.java
│   ├── Day19_ScreenshotAutomation.java
│   ├── Day20_WebTableSorting.java
│   ├── Day21_GetPriceFromTable.java
│   ├── Day22_PaginationHandling.java
│   ├── Day23_WebTableFilter.java
│
├── Exercise/
│   ├── checkbox.java
│   ├── dropdown.java
│   ├── tables.java
│   └── misc_practice_files.java
│
├── Real World Practice Project/
│   ├── AmazonCartAutomation.java
│   ├── SmartCart_StreamAPI.java
│   ├── SpiceJet_E2E.java
│   └── Nykaa_Screenshot.java
│
├── pom.xml  
└── README.md
```
---

# 🛒 Project 2 – E-Commerce Automation Using Page Object Model

A production-style automation framework that automates a complete **e-commerce workflow end-to-end** using Selenium WebDriver, Java & TestNG.

---

##  Scope Covered

- Login workflow with valid credentials  
- Product selection from a dynamic product list  
- Add-to-cart validation  
- Cart summary and verification  
- Checkout with country suggestion handling  
- Order confirmation message validation  

---

##  Framework Capabilities

###  Core Architecture
- Page Object Model (POM)
- Reusable Base Test & Base Class
- Config-driven execution via `GlobalData.properties`

###  TestNG Features
- Assertions
- Grouping
- Lifecycle management

###  Data Driven Test Strategies
**JSON-based test data**  
**Excel read/write using Apache POI**  
**TestNG @DataProvider formats used:**
- Object[][]
- HashMap<String,String>
- JSON-driven

###  Advanced Features
- Custom TestNG Listener
  - Screenshot on failures
  - Centralized logging
- Extent Spark HTML reports
- Jenkins-ready CI/CD execution
- Selenium Grid documentation for distributed testing

---

##  How To Run

```bash
mvn clean test
```

---

## 📁 Folder Structure – Project 2 (E-Commerce Automation using POM)
```
Project 2/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── BaseClass/
│   │   │   │   ├── BaseTest.java
│   │   │   │   ├── DriverSetup.java
│   │   │   │
│   │   │   ├── POMClass/
│   │   │   │   ├── LandingPage.java
│   │   │   │   ├── ProductCataloguePage.java
│   │   │   │   ├── CartPage.java
│   │   │   │   ├── CheckoutPage.java
│   │   │   │   └── ConfirmationPage.java
│   │   │   │
│   │   │   ├── Utilities/
│   │   │   │   ├── TestComponents/
│   │   │   │   ├── AbstractComponents.java
│   │   │   │   └── ReusableMethods.java
│   │   │   │
│   │   │   └── Resources/
│   │   │       ├── GlobalData.properties
│   │   │       └── TestData.json
│   │   │
│   ├── test/
│   │   ├── java/
│   │   │   ├── SubmitOrder/
│   │   │   │   ├── SubmitOrderTest.java
│   │   │   │   ├── ErrorValidationTest.java
│   │   │   │
│   │   │   └── TestNGListeners/
│   │   │       └── Listeners.java
│   │   │
│   │   └── resources/
│   │       ├── Excel/
│   │       │   └── sampleExcelData.xlsx
│   │       └── Reports/
│   │           └── ExtentReports/
│   │
├── pom.xml
└── README.md
```
---

# 🌱 Project 3 – Warp The Selenium Code With Cucumber (BDD)

This project wraps existing Selenium automation in **Cucumber Gherkin**, making tests:

- Business-readable  
- Maintainable  
- Stakeholder friendly  

---

##  Why Cucumber?

- Feature files become **living documentation**
- Scenarios written as **Given / When / Then**
- Promotes collaboration between **Business + QA + Dev**
- Bridges the gap between requirements & automation

---

##  Tech Stack

- Java – Step definitions & glue code
- Selenium WebDriver
- Cucumber (Gherkin-based BDD)
- Maven

**Optional**
- TestNG / JUnit runner
- WebDriverManager
- HTML / JSON / Allure reporting

---

#  Getting Started

## Prerequisites

- Java installed  
- Maven installed  
- Chrome / Firefox / Edge  
- Driver executable OR WebDriverManager  

---

## Setup

```bash
# 1. Clone the repository
git clone https://github.com/krishnaveni0411/Automation-Portfolio.git

# 2. Navigate into Project 3
cd "Automation-Portfolio/Project 3 - warp the selenium code with cucumber"

# 3. Install dependencies
mvn clean install
```

## Running Tests
```bash
# Run all Cucumber tests
mvn test

# Run a specific feature file
mvn test -Dcucumber.options="--plugin html:target/cucumber-html-report --glue src/test/java path/to/your.feature"
```
---

##  Writing New Tests

###  Feature Files
- **Location:** `src/test/resources/features`
- **Format:** `Feature`, `Scenario`, `Scenario Outline`, `Examples`…

###  Step Definitions
- **Location:** `src/test/java/stepdefinitions`
- Uses → `@Given`, `@When`, `@Then`
- Follows **DRY principle**

###  Hooks
- `@Before` → WebDriver setup  
- `@After` → Browser quit  

###  Reporting
- HTML / JSON Cucumber plugins
- Supports Allure / Extent integration

---

#  Skills Demonstrated Across Portfolio

##  Selenium & UI Automation
- Locators (ID, CSS, XPath…)
- DOM traversal
- JavascriptExecutor
- Actions Class:
  - Mouse hover
  - Drag & drop
  - Right-click
  - Keyboard input
- IFrames / nested Frames
- Multiple windows & tabs
- Alerts & modal popups
- Complex date pickers
- Web tables:
  - Row & column counts
  - Extraction
  - Filtering
  - Sorting validation
- Pagination automation
- Java Streams for data processing

---

##  Framework & Design
- Page Object Model (POM)
- Base classes
- Centralized configuration
- Utility abstraction
- Modular maintainable architecture

---

##  Testing & Data
- TestNG Assertions
- Test lifecycle annotations
- TestNG Groups
- DataProviders
- JSON data-driven tests
- Excel based test data
- Cucumber BDD

---

##  Reporting & CI/CD
- Extent Spark HTML Reports
- Screenshot capture on failure
- Jenkins CI execution ready
- Maven CLI execution
- Selenium Grid documentation

---

#  How To Start (Repository Level)

```bash
# Clone the full portfolio
git clone https://github.com/krishnaveni0411/Automation-Portfolio.git
```
---
### Open Using

- **Eclipse**
- **IntelliJ IDEA**
- **VS Code** (Java enabled)

---

### Modify

Update the following file before execution:

`GlobalData.properties` *(inside Project 2)*

---

### Run Tests

```bash
mvn clean test
```
---
#  Learning Journey Summary

This portfolio documents my journey from:

✔ Basic Selenium scripts →  
✔ Real-world automation challenges →  
✔ Fully structured POM framework →  
✔ Mature Cucumber BDD implementation  

---

## I Learned

- How to approach automation problems step-by-step  
- How to scale automation frameworks cleanly  
- How to architect professional-level automation systems  

---

#  Purpose of this Portfolio

This repository is built to:

- Demonstrate hands-on automation experience  
- Showcase real-world automation design  
- Present strong framework engineering knowledge  
- Serve as an interview reference portfolio  

---

#  Future Roadmap

Planned Enhancements:

- Docker-based Selenium Grid  
- Parallel execution across distributed nodes  
- Unified Cucumber + Allure / Extent reporting  
- Hybrid UI + API automation  
- Advanced CI/CD pipelines  

---

## 📁 Folder Structure – Project 3 (Wrap Selenium with Cucumber BDD)

```
Project 3/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Base/
│   │   │   │   └── BaseTest.java
│   │   │   ├── POM/
│   │   │   │   └── page classes...
│   │   │   └── Utilities/
│   │   │       └── DriverFactory.java
│   │
│   ├── test/
│   │   ├── java/
│   │   │   ├── stepdefinitions/
│   │   │   │   ├── LoginSteps.java
│   │   │   │   ├── CheckoutSteps.java
│   │   │   │   └── CommonSteps.java
│   │   │   │
│   │   │   ├── hooks/
│   │   │   │   └── Hooks.java
│   │   │   │
│   │   │   └── runners/
│   │   │       └── TestRunner.java
│   │   │
│   │   └── resources/
│   │       ├── features/
│   │       │   └── e2e_checkout.feature
│   │       │
│   │       └── reports/
│   │           ├── cucumber-report.html
│   │           └── cucumber.json
│   │
├── pom.xml
└── README.md
```
---
