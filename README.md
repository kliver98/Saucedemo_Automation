# Saucedemo_Automation
## Task description
Launch URL: https://www.saucedemo.com/

### **UC-1** Test Login form with empty credentials:
- Type any credentials into "Username" and "Password" fields.
- Clear the inputs.
- Hit the "Login" button.
- Check the error messages: "Username is required".

### **UC-2** Test Login form with credentials by passing Username:
- Type any credentials in username.
- Enter password.
- Clear the "Password" input.
- Hit the "Login" button.
- Check the error messages: "Password is required".

### **UC-3** Test Login form with credentials by passing Username & Password:
- Type credentials in username which are under Accepted username sections.
- Enter password as secret sauce.
- Click on Login and validate the title "Swag Labs" in the dashboard.

> Provide parallel execution, add logging for tests, and use Data Provider to parametrize tests.
Make sure that all tasks are supported by these 3 conditions: UC-1, UC-2, UC-3.

## Additional Instructions
Please, add the task description as README.md into your solution!

**To perform the task use the following additional options:**
- Test Automation tool: Selenium WebDriver
- Project Builder: Maven
- Browsers:
  1. Firefox
  2. Edge
- Locators: XPath
- Test Runner: JUnit
### [Optional]
- Patterns:
  1. Singleton
  2. Factory method
  3. Abstract Factory
- Test automation approach: BDD
- Assertions: AssertJ
- Loggers: SLF4J

---

# Instructions to run:

### You need:
- Java 17
- Maven 3.9.9
### Run tests:
The following command will clean target folder then generate again all the files compiled for then run the tests and finally create and open the report.
You can use multiple browser, just change 'firefox' for 'edge' or 'chrome' for example (You need to have these browsers/drivers installed).
> mvn clean verify -Dbrowser=firefox allure:serve