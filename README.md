# librarie-ui-automation

Automated UI testing framework for [librarie.net](https://www.librarie.net), a Romanian e-commerce bookstore.

## 🛠️ Tech Stack

- **Java 17**
- **Selenium WebDriver**
- **TestNG**
- **Jackson** - JSON test data management
- **Log4j2** - Logging
- **Lombok** - Boilerplate code reduction
- **WebDriverManager** - Automatic browser driver management
- **Maven** - Build and dependency management
- **Allure** - Test reporting with screenshots on failure

## 📁 Project Structure

```
src/test/
├── java/
│   ├── base/              # BaseTest and BasePage classes
│   ├── helperMethods/     # Reusable Selenium helper methods
│   ├── objectdata/        # Jackson POJO classes for test data
│   ├── pages/             # Page Object Model classes
│   ├── utils/             # LoggerUtility, ScreenshotUtility, TestListener
│   └── tests/
│       ├── clientaccount/ # Login, logout, address tests
│       ├── cart/          # Cart tests
│       ├── search/        # Search tests
│       └── product/       # Product page tests
└── resources/
├── testdata/          # JSON test data files
└── allure.properties  # Allure configuration
```

## ✅ Test Scenarios

### Client Account
- Login with valid credentials
- Logout
- Add new address
- Edit existing address
- Delete address

### Search
- Search for multiple books using data driven testing

### Product Page
- Verify book title, author, price, stock status and add to cart button are displayed

### Cart
- Add item to cart
- Remove item from cart
- Update item quantity

## ▶️ How to Run

1. Clone the repository git clone https://github.com/Riverutz/librarie-ui-automation.git
2. Open in IntelliJ IDEA
3. Run all tests via `testng.xml`
4. Generate Allure report: `allure serve target/allure-results`

## 🔄 CI/CD
Tests run automatically on every push and pull request via GitHub Actions.

## 📋 Design Patterns

- **Page Object Model (POM)** - separates test logic from page structure
- **Data Driven Testing** - test data managed via JSON files
- **Base classes** - reusable setup and teardown logic
- **Parallel Execution** - tests run in parallel at class level via TestNG
- **Listener Pattern** - TestListener captures screenshots on failure