Project 1 – Automation

Description
This project automates the login functionality, Forgot password and getting a sample password, relogin and then logout form the "rahulshetty academy locators practice" website.

Tech Stack
- Selenium WebDriver
- Java
- TESTNG 
- Maven

How to Run
1. Clone the repo
2. Open the project in your IDE (Eclipse)
3. Run the test file (code without TESTNG fream work implementation): 'without TESTNG FreamWork/"take any file you want'
4. Run the test file (code with TESTNG fream work implementation): 'With TESTNG/take any file you want'


**Day1** 
- Using Basic element locators I launched the page and try login functionalty with invalid data, then went to forgot password page and featched the password and again went to the login page and re-logined into the  account and fetched the wellcome and successfuly message.
- What I Learned
- How to set up Selenium with Java
- Basic element locators
- Writing and running TestNG tests
  
- How to Run
1. Clone the repo
2. Open the project in your IDE (Eclipse)
3. Run the test file (code without TESTNG fream work implementation): 'without TESTNG FreamWork/Login.java'
4. Run the test file (code with TESTNG fream work implementation): 'With TESTNG/Login.java'

**Day 2** 
- Now i started learing how to handel the Dropdown in this I learned **Static drop down**

- **Static Dropdown**
- What I Learned
1. Static drop down is identifed using **Select** tag in the DOM
2. The values in this dropdown are fixed.
3. The order of the value will not be changed

- How to Run
1. Clone the repo
2. Open the project in your IDE (Eclipse)
3. Run the test file (code without TESTNG fream work implementation): 'without TESTNG FreamWork/static_dropdown.java'
4. Run the test file (code with TESTNG fream work implementation): 'With TESTNG/static_dropdown.java'

**Day 3**
- **Dynamic Dropdown** (in this the drop down is loaded only after choosing the options from one of the drop down eg: first need to choose the option in **from** dropdown and then only the **to** dropdown data/options will be loaded.
- What I Learned
  1. In this the dropdown value is only loaded after selecting the option in **from** dropdown.
  2. In this i used pareent child releationship xpath and index xpath

- How to Run
1. Clone the repo
2. Open the project in your IDE (Eclipse)
3. Run the test file (code without TESTNG fream work implementation): 'without TESTNG FreamWork/dynamic_dropdown.java'
4. Run the test file (code with TESTNG fream work implementation): 'With TESTNG/dynamic_dropdown.java'

**Day 4**
- **Suggestive Dropdown**
- What I Learned
   1. Handling suggestive/autocomplete dropdowns where options appear dynamically as you type.
  2. Using sendKeys() to trigger suggestions.
  3. Capturing all suggestion elements using findElements().
  4. Selecting the desired value using an enhanced for loop.

- How to Run
1. Clone the repo
2. Open the project in your IDE (Eclipse)
3. Run the test file (code without TESTNG fream work implementation): 'without TESTNG FreamWork/sugestive_dropdown.java'
4. Run the test file (code with TESTNG fream work implementation): 'With TESTNG/sugestive_dropdown.java'

**Day 5**
- **Custom Dropdown**
- What I Learned
  i. Automating custom dropdowns that use increment/decrement controls instead of standard <select> tags.
 ii. Using loops (while and for) to control the number of passengers.
iii. Validating updated dropdown values using getText().

- Key Highlights
  1. Clicked on the dropdown to open the passenger selection panel.
  2. Increased the number of adult passengers using while loop.
  3. Decreased the number using a for loop.
  4. i used Assertion to check if we increnented/decrement the count to the expedted one.

- How to Run
  1. Clone the repo
  2. Open the project in your IDE (Eclipse)
  3. Run the test file (code without TESTNG fream work implementation): 'without TESTNG FreamWork/Custom_Dropdown.java'
  4. Run the test file (code with TESTNG fream work implementation): 'With TESTNG/Custom_Dropdown.java'


 




