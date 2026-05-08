NinjaShop Selenium Java Automation Framework

1.Project Overview:

NinjaShop is a Selenium Java automation framework developed to automate the testing of a live demo e-commerce web application. The main objective of this project is to build a clean, reusable, and maintainable automation framework using real-world automation testing practices.The framework is designed using the Page Object Model (POM) architecture along with TestNG, reusable utility classes, reporting integration, screenshot capturing, and centralized configuration management.

Application Under Test (AUT):
https://tutorialsninja.com/demo


2.Hackathon Objective:

- Selenium WebDriver automation
- Page Object Model (POM) implementation
- TestNG framework integration
- Explicit wait handling
- Screenshot capture on test failure
- ExtentReports integration
- Data-driven testing
- Reusable and maintainable framework design


3. Technologies Used:

- Java was used as the main programming language for developing the automation framework.
- Selenium WebDriver was used to automate browser actions and interact with web elements.
- TestNG was used for test execution, annotations, DataProviders, and test management.
- Maven was used to manage project dependencies and build configuration.
- WebDriverManager was used to automatically handle browser driver setup.
- ExtentReports was integrated to generate detailed HTML execution reports.
- Git and GitHub were used for version control and project management.


4.Framework Architecture:

Execution Flow:

1. Test classes start the execution
2. Page classes handle all UI interactions
3. BasePage contains common reusable methods
4. ConfigReader loads values from config.properties
5. Listeners capture screenshots on failures
6. ExtentReports generates execution reports


5.Features Implemented:

a.Authentication Module:

- User registration with valid data
- Login using valid credentials
- Invalid login validation
- Logout functionality verification

b.Product Module:

- Product search using keywords
- Category navigation testing
- Product detail page verification
- Invalid product search validation

c.Shopping Cart Module:

- Add products to cart
- Update product quantity
- Remove products from cart
- Verify cart item count

d.Checkout Module:

- Complete checkout workflow
- Delivery address validation
- Order confirmation verification
- Checkout access validation for non-logged-in users

e.Form Validation Module:

- Empty field validation
- Invalid email format validation
- Delivery address field validation


6.Page Object Model (POM)

a.Example Page Classes:

- LoginPage.java
- RegisterPage.java
- ProductPage.java
- CartPage.java
- CheckoutPage.java

b.Responsibilities of Page Classes:

- Store web element locators
- Perform user actions on web elements
- Provide reusable page methods for test classes


7.Configuration Management:

All configurable values are maintained inside the `config.properties` file to avoid hardcoding.

a.Example Configuration:

```properties
browser=chrome
baseUrl=https://tutorialsninja.com/demo
timeout=10
headless=false
```

b.Advantages:

- Easy browser switching
- Centralized configuration management
- No hardcoded URLs or values
- Better framework flexibility


8.Wait Strategy

The framework completely avoids using `Thread.sleep()`.

Instead, synchronization is handled using:

- WebDriverWait
- ExpectedConditions
- FluentWait (optional enhancement)

a.Benefits

- More stable automation scripts
- Faster execution
- Better handling of dynamic web elements


9.Screenshot Capture on Failure

The framework uses `ITestListener` to automatically capture screenshots whenever a test fails.

a.Features:

- Screenshots are saved with timestamps
- Images are stored inside the `/screenshots` folder
- Screenshots are attached to ExtentReports


10.Reporting:

ExtentReports is integrated to generate detailed HTML execution reports after every test run.

a.Report Includes:

- Test name
- Pass/Fail status
- Failure reason
- Screenshot evidence
- Execution details

b.Generated reports are stored inside:

```text
/reports/
```

11.Data-Driven Testing

The framework uses TestNG DataProvider for executing tests with multiple sets of data.

a.Examples:

- Valid login credentials
- Invalid login credentials


12.Browser Support:

a.The framework currently supports:

- Google Chrome
- Mozilla Firefox

The browser can be changed easily through the `config.properties` file.

b.Example

```properties
browser=chrome
```


13.Maven Dependencies

Main dependencies used in this project:

- selenium-java
- testng
- webdrivermanager
- extentreports


14.How to Run the Project:

a.Clone the Repository:

```bash
git clone <your-github-repository-url>
```

b.Install Dependencies:

```bash
mvn clean install
```

c.Run the Test Suite:

```bash
mvn test
```


15.TestNG Suite Execution:

All test cases are managed and executed through:

```text
testng.xml
```


16.Sample Test Coverage:

The framework covers multiple real-time test scenarios across different modules of the application.

a.Authentication Module:

- Verify successful login with valid credentials
- Verify login failure with invalid credentials
- Verify user logout functionality
- Verify new user registration

b.Product Module

- Search products using keywords
- Verify product details and pricing
- Validate category navigation
- Verify no-results message for invalid searches

c.Shopping Cart Module

- Add products to cart
- Update product quantity in cart
- Remove products from cart
- Verify cart item count updates correctly

d.Checkout Module

- Complete checkout process successfully
- Verify delivery details validation
- Confirm order placement functionality
- Verify login is required before checkout

e.Form Validation Module

- Validate empty field error messages
- Verify invalid email validation
- Validate mandatory checkout fields


17.Conclusion

The NinjaShop Selenium Java Automation Framework successfully automates the major functionalities of a demo e-commerce application using industry-standard automation practices.The framework is designed to be scalable, reusable, and easy to maintain by following the Page Object Model architecture, proper configuration management, reporting integration, and reusable utility implementation.
