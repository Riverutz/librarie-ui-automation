# librarie-ui-automation

Automated UI testing framework for [librarie.net](https://www.librarie.net), a Romanian e-commerce bookstore.

## 🛠️ Tech Stack

- **Java 17**
- **Selenium WebDriver**
- **TestNG**
- **Jackson** - JSON test data management
- **Lombok** - Boilerplate code reduction
- **WebDriverManager** - Automatic browser driver management
- **Maven** - Build and dependency management

## 📁 Project Structure

```
src/test/
├── java/
│   ├── base/              # BaseTest and BasePage classes
│   ├── helperMethods/     # Reusable Selenium helper methods
│   ├── objectdata/        # Jackson POJO classes for test data
│   ├── pages/             # Page Object Model classes
│   └── tests/
│       ├── clientaccount/ # Login, logout, address tests
│       ├── search/        # Search tests
│       └── product/       # Product page tests
└── resources/
    └── testdata/          # JSON test data files
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

## ▶️ How to Run

1. Clone the repository git clone https://github.com/Riverutz/librarie-ui-automation.git
2. Open in IntelliJ IDEA
3. Run all tests via `testng.xml`

## 📋 Design Patterns

- **Page Object Model (POM)** - separates test logic from page structure
- **Data Driven Testing** - test data managed via JSON files
- **Base classes** - reusable setup and teardown logic