# Project 2 – Automation – E-Commerce Automation using Page Object Model

## Description
This automation suite demonstrates how to structure Selenium WebDriver tests using Java, TestNG, and the Page Object Model (POM) design pattern. The project automates an end-to-end scenario on an e-commerce website where a user logs in, selects a product, adds it to the cart, completes checkout, and verifies order confirmation.

This structured approach improves code maintainability, readability, and reusability. The project covers:
- Login workflows with valid credentials
- Product selection from a dynamic list
- Cart verification
- Checkout with country selection
- Order confirmation validation

It’s a practical implementation for anyone looking to master Selenium automation with proper design patterns.

## Tech Stack
- Selenium WebDriver  
- Java  
- TestNG  
- Maven  
- Page Object Model (POM)

## How to Run
1. Clone the repository  
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse)  
3. Update `GlobalData.properties` file with the desired browser (`chrome`, `firefox`, `edge`)  
4. Run the test file:  
   ```bash
   mvn clean test

## Key Features
✔ Login Workflow
* Enter email and password
* Handle error messages
* Navigate to the product catalog
  
✔ Product Selection
* Fetch product list dynamically
* Add a specific product to the cart
* Validate presence in the cart
  
✔ Checkout Process
* Proceed from cart to checkout
* Select country from suggestions
* Submit the order

✔ Order Confirmation
* Validate confirmation message
* Ensure the order is successfully placed

## What I Learned

✅ Page Object Model
* Organized UI elements and methods in separate classes
* Enhanced readability and maintenance

✅ Synchronization
* Used implicit waits and custom wait methods
* Handled dynamic elements like spinners and toast messages

✅ Assertions with TestNG
* Verified UI behavior using assertions
* Ensured test reliability and correctness

✅ Data-Driven Testing
* Managed test data like email, password, and product names through properties files

---
# TestNG Grouping
Implemented TestNG Groups (AddProduct, CartPage, placeAnOrder) with alwaysRun in @BeforeTest & @AfterTest to improve automation flow reliability.


##  What I learned
- Groups let you run only the tests you need instead of the full suite.
- alwaysRun ensures setup & teardown always execute, even if tests fail.
- Combining both gives cleaner, faster, and more controlled test execution.


## Key Highlights
- Selective execution with AddProduct + CartPage groups
- Stable environment with guaranteed login & teardown
- POM structure for maintainable, reusable code

Takeaway: TestNG’s grouping + alwaysRun makes automation frameworks scalable, reliable, and efficient.

---

# TestNG DataProviders – Three Approaches

This project demonstrates three ways to use TestNG @DataProvider for driving tests with multiple data sets in Selenium automation.

## Type 1: Direct Object[][]

Description: Pass test data directly in a 2D object array.

What I Learned

- Quick setup with inline data
- Useful for small-scale test cases
- Not ideal for large or dynamic data sets

# Key Highlights
- Data provided as { {"email", "password", "productName"} }
- Second dataset intentionally has wrong credentials to show test failure
- Easy but not scalable

## Type 2: Using HashMap

Description: Store data in a HashMap<String, String> for better readability.

# What I Learned
- Clean structure with key-value mapping
- Makes accessing parameters intuitive (input.get("email"))
- Still needs hardcoding inside the test class

# Key Highlights
- Two datasets stored as HashMaps
- Easy access to fields like email, password, and productName
- Improves clarity compared to raw arrays

## Type 3: Reading from JSON File

Description: Externalize test data in a JSON file and parse it into HashMap objects.

# What I Learned
- Separation of test logic and test data
- Scalable for larger projects
- Practical for CI/CD pipelines

# Key Highlights
- Test data stored in TestData.json
- Used Jackson Databind to parse JSON into List of HashMaps
- Supports multiple test data sets without changing test code

## Takeaway

Type 1 → Good for quick demos
Type 2 → Cleaner & more maintainable
Type 3 → Best for real-world projects (scalable & reusable)

## Oveerall Key Highlights

- Explored multiple DataProvider strategies in TestNG
- Compared array-based, HashMap-based, and JSON-based approaches
- Identified JSON as the most scalable solution for large test suites

---

