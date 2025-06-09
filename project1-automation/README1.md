# Project 1 – Automation

## Description
This project automates the login functionality, forgot password flow, retrieving a sample password, re-login, and logout from the **Rahul Shetty Academy Locators Practice** website.

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

## ✅ Checkbox Automation Exercise

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

> 📂 **Project Folder Structure**  
- `without TESTNG FreamWork/` → Test files without TestNG  
- `With TESTNG/` → Test files with TestNG  
- `Exercise/checkbox.java` → Additional exercises  
