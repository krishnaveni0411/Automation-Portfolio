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

## Project – SpiceJet End-to-End Automation Test

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

## Day 8 – Alert Handling with Selenium and TestNG

This project demonstrates how to handle JavaScript alerts and confirmation popups using **Selenium WebDriver** with **TestNG** in Java.

##  What It Does

Automates the alert box interaction on [Rahul Shetty's Practice Page](https://rahulshettyacademy.com/AutomationPractice/):

- Enters a user-defined name in the input field
- Clicks the "Alert" button and verifies that the alert message contains the entered name
- Accepts the alert box
- Clicks the "Confirm" button
- Dismisses the confirmation popup

---

## Amazon Interview Challenge - Selenium Automation

This project is a solution to a common e-commerce QA automation challenge inspired by an **Amazon interview question**. The requirement was to add selected products to the cart, even as **new products are added dynamically** to the online store.

##  Problem Statement

> **"New products are added daily to the Amazon marketplace. Automate the process of adding specific items to the cart regardless of how the product list changes."**

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

##  Day 9 – Synchronization in Selenium using Implicit and Explicit Waits

When automating modern web applications, timing issues are one of the trickiest challenges.

Elements don’t always load instantly — some appear in milliseconds, while others take seconds due to dynamic content. That’s where synchronization comes in, and Selenium offers powerful wait mechanisms to handle it: Implicit Wait and Explicit Wait.

Today, I implemented both in a real-time scenario. Here’s what I learned 👇

 Implicit Wait
- Applied globally across all elements.
- Tells WebDriver to wait for a certain duration when trying to find an element if it's not immediately available.

 Pros:
 - Easy to implement
 - Useful for stable, consistently loading elements
 - Reduces code repetition
 
 Cons:
 - Not ideal for elements with varying load times
 - Applies to all elements — may slow down test execution unnecessarily
 - Can’t wait for specific conditions (e.g., text change, alert present)

 Explicit Wait
- More powerful and flexible.
- Used to wait for a specific condition or element to occur before continuing the script.

 Pros:
 - Targeted & condition-based
 - Prevents flakiness in dynamic scenarios
 - Can wait for element state changes, visibility, clicks, etc.
 
 Cons:
 - More code to write for each dynamic element
 - Misuse can lead to longer waits or timeout exceptions
 - Needs clear understanding of element behavior

 Real Scenario I Automated:
 - Selected a list of grocery items dynamically from the UI
 - Verified cart functionality and price updates
 - Applied promo code & waited for the success message with Explicit Wait


 Key Takeaways
 - Use Implicit Wait as a default, but don’t rely on it for slow elements
 - Use Explicit Wait for dynamic, conditional elements (like popups, loaders, alerts)
 - Always observe app behavior and apply the right wait for optimal stability

 Website Used: https://rahulshettyacademy.com/seleniumPractise/#/

 ## Test Case Overview
 Steps Covered
- Open browser and navigate to the site
- Select items: Brocolli, Tomato, Pumpkin, Mango, Pomegranate, Almonds, Cashews
- Click Cart and Proceed to Checkout
- Apply promo code: rahulshettyacademy
- Wait for success message using Explicit Wait
- Print the promo confirmation message
- Close the browser

---

# Day 10 – Fluent Wait in Selenium with TestNG

This project demonstrates the use of **Fluent Wait** in Selenium WebDriver using Java and TestNG. It handles a real-time scenario where elements take time to become visible on a dynamically loaded page.

##  Scenario

Website Tested: [Dynamic Loading Page](https://the-internet.herokuapp.com/dynamic_loading/1)

- After clicking the **Start** button, the content takes a few seconds to appear.
- The element is already in the DOM but not immediately visible.
- We use Fluent Wait to wait until the element becomes **visible** before proceeding.

##  Code Highlights

- `FluentWait` is configured to:
  - Wait up to 30 seconds
  - Poll every 3 seconds
  - Ignore `NoSuchElementException`
- Conditional logic inside the `apply()` method waits until the element becomes visible.

What I Learned
- Fluent Wait allows more flexibility for handling dynamic elements.
- Polling helps reduce test flakiness.
- You can apply conditional logic inside until() to wait until an element meets a specific condition.
---

## Selenium Automation Assignment – Handling Synchronization with Waits

This project demonstrates how to handle **dynamic web elements** using **Implicit Wait** and **Explicit Wait** in Selenium WebDriver with Java. The script automates a complete login-to-cart user flow on the practice site provided by Rahul Shetty Academy.

## Project Overview

The script covers:

- Extracting login credentials from UI text
- Performing login using dynamic values
- Selecting a role from a dropdown
- Handling alerts and pop-ups
- Adding multiple products to cart
- Navigating from login ➡️ product listing ➡️ cart

## Key Concepts Practiced

- Synchronization using waits
- Dynamic element handling
- XPath and CSS selector usage
- Form handling
- List of web elements and loop-based actions

Website Tested: https://rahulshettyacademy.com/loginpagePractise/

---

## Day 11 – Selenium Automation – Exploring Actions Class with TestNG

This project demonstrates how to use the **Selenium Actions Class** to perform advanced user interactions like mouse hover, right-click, and typing uppercase input using keyboard control. The automation is performed on the **Nykaa** e-commerce website.


## Project Overview

This script showcases:

- Typing text in uppercase using `keyDown(Keys.SHIFT)`
- Performing a **double-click** action on an input field
- Executing a **mouse hover** on a navigation tab
- Performing a **right-click (context click)** on a web element
- Using **TestNG** for test structuring

Website Tested: https://www.nykaa.com/

---

##  Day 12 – Selenium TestNG Window Handling

This project demonstrates how to handle multiple browser windows using **Selenium WebDriver** and **TestNG**. The script automates a login workflow where an email ID is extracted from a child window and used in the parent window.

## Scenario

- Navigate to [Rahul Shetty Academy Login Page](https://rahulshettyacademy.com/loginpagePractise/)
- Click on a link that opens a new browser window
- Switch to the child window and extract an email ID from the displayed message
- Switch back to the parent window
- Enter the extracted email ID into the username field

---

#  Selenium Assignment 4 – Window Handling with WebDriver

This assignment demonstrates how to **handle multiple browser windows** (parent and child) using **Selenium WebDriver**. It uses Java and ChromeDriver to automate opening a new window, switching between them, and retrieving text from each.

##  Why it matters:
In real-world web applications, actions like clicking a link or a button often open **new browser tabs or windows**.  
Handling these **window switches** is essential to verify data across different contexts of the application and ensure your test scripts don’t break during multi-window workflows.


##  What this script covers:
- Launching a browser and navigating to a test URL
- Opening a new browser window via user interaction
- Capturing all window handles using `getWindowHandles()`
- Switching between parent and child windows
- Extracting and printing text from both windows
- Managing browser focus with `switchTo().window()`

---

#  Day 13 – Selenium Learning: Mastering Frames and Drag & Drop with Actions Class

This test script demonstrates the use of **Selenium WebDriver** with **TestNG** to handle iframes and simulate user interactions like drag-and-drop using the **Actions** class.

##  Why it matters:
Many real-world applications use **iframes** and **dynamic content**.  
Mastering **frame handling** and gesture simulation like **drag-and-drop** is crucial for automating modern UIs.  
It ensures your automation scripts **mimic real-user behavior accurately** and handle **nested elements confidently**.

##  What this script covers:
- Switching to an iframe using `driver.switchTo().frame()`
- Locating draggable and droppable elements
- Performing drag-and-drop actions using the `Actions` class
- Switching back to the main page with `driver.switchTo().defaultContent()`

---

## Assignment 5: Handling Nested Frames

This project demonstrates the handling of **nested frames** using Selenium WebDriver with Java. It focuses on navigating through multiple frame levels and retrieving data from a deeply nested frame.

##  Overview

This automation script performs the following:

- Launches a web browser using Selenium WebDriver
- Opens the test site: [The Internet - Nested Frames](https://the-internet.herokuapp.com/nested_frames)
- Navigates through nested frames (`frame-top` → `frame-middle`)
- Extracts and prints the text from the middle frame
- Returns to the main page context and closes the browser

Why it Matters
- Many real-world applications use iframes and dynamic content. Mastering frame handling is crucial for automating modern UIs. This skill ensures your test scripts can:
  1. Confidently interact with nested elements
  2. Simulate real-user behavior accurately
  3. Avoid stale element and visibility issues common in frame-based UIs

---

## Day 14 – Selenium Interview Challenge: Handling Links, Footers & Window Switching

This automation challenge simulates a real-world scenario inspired by an actual HCL interview question. The task is focused on DOM traversal, footer scoping, multi-tab handling, and dynamic link title verification using **Selenium WebDriver with Java and TestNG**.

##  Problem Statement

- Count the total number of links on the webpage
- Scope into the **footer** section and count its links
- Further scope into the **first column of the footer** and count links
- Open each link from that column in a **new tab**
- Switch to each tab and **fetch the title** of the page
##  What I Practiced

✅ DOM Scoping using WebElement  
✅ Sub-driver strategy for efficient element location  
✅ Opening links in new tabs using `Keys.chord(Keys.CONTROL, Keys.ENTER)`  
✅ Managing multiple browser tabs with `getWindowHandles()`  
✅ Retrieving and printing page titles of opened tabs  

##  Why This Matters

Modern websites often use dynamic and nested layouts. Automation engineers must:
- Understand how to navigate scoped DOM regions
- Handle multi-tab scenarios
- Optimize navigation without hardcoding paths

This exercise enhances practical skills required for real-world QA automation and interview readiness.

---

## Assignment 6 – Selenium Automation: Checkbox, Dropdown & Alert Handling

This assignment demonstrates interaction with checkbox elements, dropdowns, and JavaScript alert popups using Selenium WebDriver in Java.

##  What the Script Does

- Navigates to the [Automation Practice Page](https://rahulshettyacademy.com/AutomationPractice/)
- Selects the first checkbox on the page and retrieves its `value`
- Selects the same value from a dropdown menu
- Enters the value into a textbox
- Triggers an alert and validates whether the alert text contains the entered value

##  Why It Matters

Many real-world applications involve interacting with dynamic forms. Mastering elements like checkboxes, dropdowns, and alert handling is fundamental in building robust automation scripts.

This script helps reinforce:
- Dynamic element handling
- Efficient use of locators (`cssSelector`, `By.id`)
- Switching context to alerts
- Validating runtime feedback from web elements

## Output Behavior
The script prints:

✅ "Alert message successfully has your send value" if alert text matches the input

❌ "Alert message doesn't has your send value and something is wrong with your execution" if validation fails

---

##  Day 15 – Selenium Automation: Handling Date Picker with Month & Year Selector

In this assignment, I automated a real-world calendar widget using Selenium WebDriver. The goal was to dynamically select a specific date from a **React-based date picker** that allows users to navigate through year and month views.

##  What I Did

- Opened the Rahul Shetty Academy **Offers Page**  
  `https://rahulshettyacademy.com/seleniumPractise/#/offers`
- Triggered the **date picker widget**
- Navigated to the **year view**, then selected the required **year and month**
- Clicked on the target **date (13-June-2024)**
- Retrieved the selected date from input fields
- Asserted actual vs expected values using **TestNG**

## Key Concepts Practiced

- Handling dynamic and layered calendar components
- XPath and CSS Selector mastery for nested UI elements
- Extracting input field values using `getDomAttribute("value")`
- Using TestNG for validation/assertions

##  Why It Matters

Modern web apps frequently use advanced UI components like React date pickers. Automating these interactions is essential for effective UI test coverage and to simulate real-user behavior.

## Output & Assertion

- Retrieved each segment of the selected date (Month, Date, Year)
- Validated it using assertions:
  1. Assert.assertEquals(actualList.get(i).getDomAttribute("value"), expectedList[i]);

---

##  Day 16 – Scrolling with JavaScriptExecutor in Selenium

This project demonstrates how to use `JavaScriptExecutor` in Selenium WebDriver to perform scroll actions—both on the main window and within a scrollable table element.

##  What’s Covered

- Scrolling the browser window by pixel offset
- Scrolling inside a scrollable container using JavaScript
- Usage of `JavascriptExecutor` interface in Selenium

## Why It Matters
Standard Selenium methods sometimes fall short when interacting with off-screen elements or deeply nested scrollable components. Using JavaScriptExecutor gives you direct access to DOM manipulation, making it a valuable tool in your automation toolbox.

## Output Example
- The browser scrolls down by 500 pixels.
- The scrollable table scrolls internally to simulate reading content.

---

## Day 17 – Handle Scrollable Table Grid with Selenium

This project demonstrates how to handle a **scrollable table grid** using **Selenium WebDriver** and **Java**, and how to **validate the sum of a column** against a displayed total on the webpage.

##  Scenario
The automation script performs the following:
1. Launches the browser and navigates to [rahulshettyacademy.com/AutomationPractice](https://rahulshettyacademy.com/AutomationPractice/).
2. Scrolls down the page using JavaScript.
3. Scrolls inside a scrollable `<div>` containing a table.
4. Extracts values from the 4th column of the table.
5. Calculates the total of the extracted values.
6. Validates the calculated total with the total displayed on the UI.

## What I Learned
- How to use JavascriptExecutor to scroll both the window and inside elements.
- How to handle dynamic tables with CSS Selectors.
- How to use TestNG assertions for validation.

---

##  Assignment 7 – Selenium Web Automation Challenge

## 📄 Overview

This project demonstrates how to interact with and extract data from an HTML table using **Selenium WebDriver** in **Java**. The assignment focuses on DOM traversal, table data validation, and dynamic XPath usage, all while practicing clean and efficient coding techniques.

##  Features Implemented

- Scrolled the page using `JavaScriptExecutor` to reach the table
- Retrieved:
  - Total number of **rows** (including header)
  - Total number of **columns**
  - **Specific row data** (row 3 in this case)
  - All values from the **Price** column (3rd column)
- Parsed string data to integers using `Integer.parseInt()`
- Practiced advanced XPath and `findElements()` usage
- Used enhanced for-loop to iterate through row cells

##  What I Learned

- How to dynamically retrieve data from a specific row by:
  - Storing the row index in a variable
  - Building a dynamic XPath with that index
  - Creating a sub-driver to fetch all `<td>` elements
  - Using an enhanced for-loop to print each cell's content
- How to extract column data for validation purposes

##  Use Case

Extracting **tabular data** (like pricing, product names, etc.) is vital for many test automation and scraping scenarios. This technique is particularly useful when:
- Validating individual records based on conditions
- Performing **data-driven testing**
- Handling dynamic tables in web applications

---

##  Assignment 8 – Autocomplete Dropdown Automation using Selenium WebDriver (Java)

This project demonstrates how to automate an **autocomplete suggestion box** using **Selenium WebDriver** in Java, and how to verify the selected value using **TestNG assertions**.

##  Objective

- Enter a partial country name in the **autocomplete textbox**.
- Select **"United Arab Emirates"** from the dropdown list.
- Retrieve the selected value from the input field.
- Validate the selection using a **TestNG assertion**.

##  Key Concepts Covered

- Handling dynamic dropdowns/autocomplete suggestions.
- DOM analysis and workarounds when `getDomAttribute("value")` fails.
- JavaScriptExecutor for retrieving input values.
- Validating outcomes using assertions.

##  What I Learned

- Dynamic suggestion lists don't always update the `value` attribute directly in the DOM.
- Even with waits, `getDomAttribute("value")` may return `null` if the field doesn't use that attribute.
- JavaScriptExecutor provides a reliable workaround to fetch the **visible input** value.
- Adding assertions improves the reliability and usefulness of automation tests.

##  Personal Experience

I initially tried using:

country_Textbox.getDomAttribute("value");

But it always returned null. After inspecting the HTML, I found that the value was not being stored as an attribute. I even tried applying explicit waits, but no luck.

Finally, I used JavaScriptExecutor to directly access the live value from the field:

JavascriptExecutor js = (JavascriptExecutor) driver;
String selectedValue = (String) js.executeScript("return document.getElementById('autocomplete').value;");

This worked successfully! I then validated the result with a simple assertion using Assert.assertEquals().

---

> 📂 **Project Folder Structure**  
- `without TESTNG FreamWork/` → Test files without TestNG  
- `With TESTNG/` → Test files with TestNG  
- `Exercise/checkbox.java` → Additional exercises  
