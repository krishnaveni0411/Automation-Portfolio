## 📌 Project Overview – Selenium Test Automation Suite

This automation suite demonstrates hands-on experience with **Selenium WebDriver**, **Java**, **TestNG**, and **Maven**, focused on mastering UI automation through a series of real-world scenarios and exercises.

The project covers end-to-end test cases including login workflows, dropdown interactions, checkbox validations, calendar handling, alert popups, and a dynamic product cart challenge modeled on real-world e-commerce behavior.

All test cases are structured in two formats:

* **Without TestNG** – Basic script executions.
* **With TestNG** – Organized test cases with assertions and annotations for test lifecycle management.

---

## 🔧 Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Testing Framework:** TestNG
* **Build Tool:** Maven
* **IDE:** Eclipse / IntelliJ IDEA

---

## 🚀 How to Run the Tests

1. **Clone this repository**
2. **Open the project in your IDE**
3. **Run tests using either approach:**

   * **Without TestNG**
     Navigate to `without TESTNG FreamWork/<filename>.java` and run the file directly.
   * **With TestNG**
     Navigate to `With TESTNG/<filename>.java` and run using the TestNG suite or annotations.

---

## 📅 Project Timeline and Learning Highlights

### 🔹 Day 1 – Login Automation & Basic Locators

* Performed login with invalid data, retrieved temporary password, re-logged in.
* **Learned:** Basic locators, navigation flows, TestNG setup.

### 🔹 Day 2 – Static Dropdown

* Handled `<select>` tag elements using `Select` class.
* **Learned:** Fixed options, value selection.

### 🔹 Day 3 – Dynamic Dropdown

* Handled dependent dropdowns (e.g., city selection).
* **Learned:** XPath strategies, synchronization.

### 🔹 Day 4 – Suggestive Dropdown

* Automated autocomplete suggestions.
* **Learned:** `sendKeys()`, `findElements()`, dynamic list selection.

### 🔹 Day 5 – Custom Dropdown

* Handled dropdowns using increment/decrement buttons.
* **Learned:** Loops, assertions, UI state validation.

### 🔹 Day 6 – Checkbox Validation

* Validated checkbox behavior with `isSelected()` and assertions.
* **Learned:** CSS selectors, multiple checkbox handling.

### 🔹 Day 7 – Calendar UI & Element Validation

* Automated a calendar UI and validated disabled/enabled states.
* **Learned:** DOM attribute checks, UI styling validation, CSS value inspection.

---

## ✅ Assignments & Mini Projects

### 🧪 Checkbox Automation (Assignment 1)

* Validated selection states, counted all checkboxes, and verified state transitions.

### 🧾 UI Form Automation (Assignment 2)

* Input fields, gender dropdown, checkboxes, and radio buttons with validation and confirmation alert handling.

---

## ✈️ End-to-End Automation: SpiceJet Flight Booking

* Automated a real-time scenario on the SpiceJet site:
  Selecting origin/destination, departure date, passenger count, fare category, and initiating flight search.

---

## ⚠️ Alert & Confirmation Popup Handling

* Handled JavaScript alerts and confirmation boxes.
* Validated alert messages and captured user input.

---

## 🛒 Amazon Interview Challenge – Dynamic Cart Automation

* Automated adding specific products to the cart despite dynamic UI changes.
* **Key Strategies:**

  * Used `String[]` for item names
  * Handled extra label text using `split()` and `trim()`
  * Converted arrays to `List`
  * Handled dynamic buttons with parent-child XPath
  * Controlled loop with counter and early exit

---

## 📂 Folder Structure

```
├── without TESTNG FreamWork/       → Basic Java test files
├── With TESTNG/                    → TestNG-based test classes
├── Exercise/checkbox.java          → Assignment exercises
```

---

## 🎯 Key Takeaways

* Built a strong foundation in Selenium automation.
* Learned robust XPath techniques and UI element handling.
* Practiced scalable test automation design.
* Improved debugging, validation, and assertion logic.

---

