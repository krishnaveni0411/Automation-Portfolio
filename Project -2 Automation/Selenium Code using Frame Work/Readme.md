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
