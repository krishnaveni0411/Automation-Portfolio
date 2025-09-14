# 🧪 Selenium Automation Project Suite

A comprehensive automation suite built using **Selenium WebDriver**, **Java**, **TestNG**, and **Maven**, demonstrating real-world automation challenges and best practices. This project captures day-by-day progress through assignments, covering foundational concepts to advanced user interaction and dynamic synchronization techniques.

---

## 📌 Project Highlights

* ✅ End-to-End Automation: Login flows, dropdowns, calendar handling, alert popups  
* ✅ Real-Time Scenarios: E-commerce cart handling, product validation  
* ✅ Wait Strategies: Implicit, Explicit, and Fluent Waits  
* ✅ UI Element Interactions: Mouse hover, keyboard control, context click

---

## 🛠️ Tech Stack

* **Selenium WebDriver**  
* **Java**  
* **TestNG**  
* **Maven**

---

## Concepts
* **JavaScriptExecutor**
* **Actions Class**
* **iFrames**
* **Alerts**
* **Streams**
* **XPath**

---

## 🧭 How to Run

1. Clone the repository  
2. Import into your Java IDE (Eclipse/IntelliJ)  
3. Use TestNG to run test suites in `With TESTNG/`  
4. Directly run `.java` files in `without TESTNG FreamWork/` for basic execution  

---

## 📚 Learning Journey & Assignments

### Day 1: Basic Locators & Login Flow

* Practiced element locators and page navigation  
* Logged in using credentials extracted from UI text

### Day 2: Static Dropdown

* Automated dropdown with `<select>` tag using the `Select` class

### Day 3: Dynamic Dropdown

* Handled dependent dropdowns with dynamic options using XPath

### Day 4: Suggestive Dropdown

* Captured autocomplete suggestions using `findElements()` and loops

### Day 5: Custom Dropdown

* Handled passenger count updates using loops and assertions

### Day 6: Checkbox Testing

* Verified selection state and counted total checkboxes

### Assignment 1: Checkbox Exercise

* Validated default state, toggled selection, and printed checkbox states

### Day 7: Calendar & UI Element Validation

* Automated SpiceJet calendar and validated disabled state with CSS properties

### Assignment 2: UI Form Automation

* Automated input fields, checkboxes, radio buttons, and dropdowns  
* Captured alert and radio label confirmation

### 🔁 SpiceJet End-to-End Automation

* Full scenario covering flight booking logic, including dynamic validations

### Day 8: Alert Handling

* Handled JavaScript alerts and confirmation popups

### 📦 Amazon Cart Challenge

* Selected multiple items from dynamic product list using smart loops and XPath

### Day 9: Implicit & Explicit Waits

* Applied global and conditional waits for dynamic loading and alerts

### Day 10: Fluent Wait

* Practiced `FluentWait` on delayed loading content using polling strategy

### Assignment: Synchronization Strategy

* Combined implicit and explicit waits for login and cart functionality

### Day 11: Selenium Actions Class

* Used Actions class for:
  * Uppercase input  
  * Double click  
  * Mouse hover  
  * Right-click

### Day 12: Window Handling  
* Switched to a child window to extract an email ID  
* Switched back to parent window and entered it into the username field using TestNG lifecycle methods

### Assignment 4 – Window Handling
- Handles multiple windows using getWindowHandles() and switchTo().window().
- Extracts and prints text from parent and child windows.

Why: Crucial for automating multi-window workflows like pop-ups and redirects.

### Day 13 – Frames & Drag-Drop (Actions Class)
Switches to iframe, performs drag-and-drop using Actions.

Why: Real apps often embed content in frames requiring gesture simulation.

### Assignment 5 – Nested Frames
Navigates and extracts data from deeply nested frames.

Why: Ensures robust interaction with complex UIs using frame hierarchies.

### Day 14 – Footer Link Handling (Interview Simulation)
- Counts links on page, footer, and its column.
- Opens each link in new tabs, prints page titles.

Why: Practices scoped DOM traversal, multi-tab handling, and link validation.

### Assignment 6 – Checkbox, Dropdown, and Alert
Selects checkbox value → dropdown → textbox → alert → validation.

Why: Simulates end-to-end dynamic form interaction & JavaScript alert handling.

### Day 15 – Date Picker Automation
- Selects dynamic date (13-June-2024) using React calendar.
- Asserts selected date using getDomAttribute("value").

Why: Advanced date pickers are common in UIs; XPath mastery is key.

### Day 16 – Scrolling with JavaScriptExecutor
Scrolls browser window and within scrollable <div> table.

Why: Essential for interacting with off-screen or nested content.

### Day 17 – Scrollable Table Grid
Extracts column values, computes total, validates against UI value.

Why: Teaches scrolling + data validation in dynamic tables.

### Assignment 7 – Web Table Data Extraction
- Fetches table row/column count, specific row data, and Price column.
- Uses dynamic XPath, for-each loops, and parsing.

Why: Great for scraping, validating tabular data for QA.

### Assignment 8 – Autocomplete Dropdown
- Selects "United Arab Emirates" from autocomplete suggestions.
- Uses JavaScriptExecutor to get value, validates with TestNG.

Why: Real-time suggestion lists often fail traditional locators.

### Smart Cart Automation (Java Streams)
- Matches & adds products using Java Stream API.
- Validates added items against expected list.

Why: Boosts efficiency with functional programming.

### Day 19 – Screenshot Automation (Nykaa)
Searches with Actions, scrolls, captures screenshot.

Why: Useful for debugging and visual validations.

### Day 20 – Web Table Sorting
- Validates sorting on "Product Name" column.
- Uses Java Streams + TestNG assertions.

Why: Common UI feature in apps; critical for regression tests.

### Day 21 – Fetching Item Price from Table
Opens new tab, sorts table, finds "Banana" price using sibling XPath.

Why: Combines tab handling, dynamic table parsing, and XPath traversal.

### Day 22 – Pagination Handling
This script automates the process of finding a specific item ("Tomato") across multiple pages in a web table using Selenium WebDriver and TestNG.  

It demonstrates handling pagination, sorting, and data extraction to validate real-world e-commerce scenarios efficiently.

### Day 23: Web Table Filtering with TestNG
This project automates a filtering operation on a web table using Selenium WebDriver, Java Stream API, and TestNG.  

It helps validate that UI search functionality works correctly using backend logic verification.

---

## 📁 Folder Structure
```
├── without TESTNG FreamWork/
│   └── Basic Java-based Selenium scripts
├── With TESTNG/
│   └── TestNG-based organized test cases
├── Exercise/
│   └── Ecercise Selenium scripts
├── Real World Practice Project
│   └── Real World Project Selenium scripts
```
---

## Project 2 – E-Commerce Automation using POM

## Description
This project automates an end-to-end workflow on an e-commerce website using **Selenium WebDriver**, **Java**, **TestNG**, and the **Page Object Model (POM)**. It covers login, product selection, cart verification, checkout, and order confirmation with structured, reusable, and maintainable code.

## Key Features
- Login with valid credentials  
- Select and validate products in the cart  
- Complete checkout by selecting a country  
- Verify order confirmation message  

## What I Learned
- Implemented POM for better code organization  
- Applied waits and handled dynamic elements  
- Used TestNG assertions for validation  
- Managed test data using property files

## Tech Stack
- Selenium WebDriver  
- Java  
- TestNG  
- Maven  
- Page Object Model (POM)

## How to Run
1. Clone the repository  
2. Open in your IDE (IntelliJ, Eclipse, etc.)  
3. Set the browser in `GlobalData.properties`  
4. Run with `mvn clean test`
---

## 📁 Folder Structure
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── BaseClass/
│   │   │   │   └── Base setup and utility classes
│   │   │   ├── BaseTest/
│   │   │   │   └── Common test configurations and setup methods
│   │   │   ├── POMClass/
│   │   │   │   └── Page Object Model classes for different pages
│   │   │   └── Resources/
│   │   │       └── GlobalData.properties – Configuration for test data and browser settings
│   └── test/
│       └── java/
│           └── SubmitOrder/
│               └── Test classes for executing end-to-end scenarios
├── pom.xml
│   └── Maven build and dependency management file
└── README.md
    └── Project documentation
