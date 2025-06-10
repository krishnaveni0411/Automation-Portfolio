# Project 1 – Automation

## Description
This automation suite demonstrates hands-on experience with Selenium WebDriver, Java, TestNG, and Maven, focused on mastering UI automation through a series of real-world scenarios and exercises.
The project covers end-to-end test cases including login workflows, dropdown interactions, checkbox validations, calendar handling, alert popups, and a dynamic product cart challenge modeled on real-world e-commerce behavior.

All test cases are structured in two formats:
- Without TestNG – Basic script executions.
- With TestNG – Organized test cases with assertions and annotations for test lifecycle management.

## Tech Stack
- Selenium WebDriver  
- Java  
- TestNG  
- Maven  

## How to Run
1. Clone the repo  
2. Open the project in your IDE (e.g., Eclipse)  
3. Run the test file (without TestNG framework):  
   `'without TESTNG FreamWork/<filename>.java'`  
4. Run the test file (with TestNG framework):  
   `'With TESTNG/<filename>.java'`  

---

## Day 1 – Basic Locators & Login Flow

- Used basic element locators to launch the page and tested login functionality with invalid data.  
- Then navigated to the forgot password page, fetched a temporary password, and successfully logged in.  

### What I Learned
- Setting up Selenium with Java  
- Basic element locators  
- Writing and running TestNG tests  

---

## Day 2 – Static Dropdown

- Learned to handle **static dropdowns** using the `Select` tag in the DOM.  

### What I Learned
1. Static dropdowns use the `<select>` tag.  
2. Options are fixed and do not change dynamically.  
3. Order of values remains the same.  

---

## Day 3 – Dynamic Dropdown

- Dynamic dropdowns load options based on other selections (e.g., "From" and "To" cities).  

### What I Learned
1. Options load **only after** selecting a value in the "From" dropdown.  
2. Used **parent-child XPaths** and **index-based XPaths**.  

---

## Day 4 – Suggestive Dropdown

- Handled **suggestive/autocomplete dropdowns** where suggestions appear as you type.

### What I Learned
1. Used `sendKeys()` to trigger suggestions.  
2. Captured suggestion list using `findElements()`.  
3. Selected desired value using a loop.  

---

## Day 5 – Custom Dropdown

- Automated dropdowns that use increment/decrement controls (not `<select>` tags).

### What I Learned
1. Used **loops (while and for)** to change the passenger count.  
2. Validated values using `getText()`.  
3. Applied assertions using TestNG.  

### Key Highlights
- Opened passenger selection panel  
- Increased adults with `while` loop  
- Decreased adults with `for` loop  
- Used assertions to validate expected count  

---

## Day 6 – Checkbox

### What I Learned
1. Automated checkbox selection/deselection.  
2. Verified selection state with `isSelected()`.  
3. Counted total checkboxes on the page.  
4. Used `CSS Selector` with `id*='friendsandfamily'`.

### Key Highlights
- Asserted checkbox is **not selected** initially.  
- Selected checkbox and asserted it **is selected**.  
- Counted all checkboxes with `findElements().size()`.  

---

## Assignment 1 - Checkbox Automation Exercise

### Objective
To automate and validate checkbox behavior using Selenium + Java.

### Code Flow
1. Launch browser  
2. Validate default checkbox state  
3. Select, validate selection  
4. Deselect, validate again  
5. Print checkbox state  
6. Count total checkboxes  

### Key Concepts Practiced
- `isSelected()`  
- `Assert.assertTrue()` / `Assert.assertFalse()`  
- Counting with `findElements()`  
- Using `CSS Selectors` for efficiency  

---

## Day 7 – Calendar & UI Element Validation

This project validates calendar behavior using **Selenium WebDriver** and **TestNG**, on [SpiceJet](https://www.spicejet.com).

### Features Covered
- Launch browser & navigate to homepage  
- Select cities using dynamic dropdowns  
- Click calendar and validate **return date** is disabled  
- Check **CSS style changes** in the DOM  
- Use assertions for UI validation  

---

## Assignment 2 – UI Form Automation

This project automates a user form submission on the [Rahul Shetty Academy Angular Practice Site](https://rahulshettyacademy.com/angularpractice/) using Selenium WebDriver and Java.

##  Features Automated

- Inputting text fields: Name, Email, Password, Date of Birth
- Handling:
  - Checkboxes
  - Radio buttons
  - Dropdown selection (Gender)
- Capturing and printing alert confirmation message
- Extracting and printing selected employment status label

---

# Project – SpiceJet End-to-End Automation Test

##  Description
This project automates a real-time **end-to-end flight booking scenario** on the [SpiceJet website](https://www.spicejet.com/) using **Selenium WebDriver and TestNG**.

It includes:
- Selecting origin and destination
- Choosing the current date in the departure calendar
- Validating whether the return date calendar is enabled
- Selecting number of adult passengers
- Selecting a travel fare category
- Initiating a flight search

---

#  Alert Handling with Selenium and TestNG

This project demonstrates how to handle JavaScript alerts and confirmation popups using **Selenium WebDriver** with **TestNG** in Java.

##  What It Does

Automates the alert box interaction on [Rahul Shetty's Practice Page](https://rahulshettyacademy.com/AutomationPractice/):

- Enters a user-defined name in the input field
- Clicks the "Alert" button and verifies that the alert message contains the entered name
- Accepts the alert box
- Clicks the "Confirm" button
- Dismisses the confirmation popup

---

# Amazon Interview Challenge - Selenium Automation

This project is a solution to a common e-commerce QA automation challenge inspired by an **Amazon interview question**. The requirement was to add selected products to the cart, even as **new products are added dynamically** to the online store.

##  Problem Statement

> **"New products are added daily to the Amazon marketplace. Automate the process of adding specific items to the cart regardless of how the product list changes."**

## Technologies Used

- **Java**
- **Selenium WebDriver**
- **ChromeDriver**

## Solution Strategy

I faced several key challenges while working on this and here’s how I tackled them:

###  Problem 1: Hardcoded Product Names
- **Issue**: Couldn’t check individual items one by one.
- **Solution**: Created a **generic array** (`String[] itemNeeded`) and matched it dynamically.

###  Problem 2: Mismatched Product Names
- **Issue**: The UI displayed product names with additional data (e.g., "Tomato - 1 Kg").
- **Solution**: Used `split("-")` and `trim()` to extract clean product names.

###  Problem 3: Array Iteration Limitations
- **Issue**: Arrays are less flexible for dynamic operations.
- **Solution**: Converted the array to a **List** using `Arrays.asList()`.

###  Problem 4: Button Click Failing After First Click
- **Issue**: XPath based on static text failed as button text changed after clicking.
- **Solution**: Switched to a **parent-child XPath strategy**:  
  ```java
  //div[@class='product-action']/button
###  Problem 5: Loop Continuation After All Items Are Added
Issue: The loop kept running even after all products were added.

Solution: Used a counter j and a break once all required items were added.

## Key Learnings
- How to make automation code resilient to UI changes.
- Improved use of XPath strategies and DOM traversal.
- Practiced writing scalable and reusable code in real-world-like scenarios.
---


> 📂 **Project Folder Structure**  
- `without TESTNG FreamWork/` → Test files without TestNG  
- `With TESTNG/` → Test files with TestNG  
- `Exercise/checkbox.java` → Additional exercises  
