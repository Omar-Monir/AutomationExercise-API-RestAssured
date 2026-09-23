# Automation Exercise API Test Framework

This is my personal API automation project for the website [Automation Exercise](https://www.automationexercise.com/).

I built this framework to practice real-world API testing using **Java, RestAssured, TestNG, and Allure Report**.

---

## Tech Stack

- Java
- RestAssured
- TestNG
- Maven
- Allure Report
- POJO + Form Parameters
- Page Object style structure (Endpoints + Payload)

---

## Project Structure
```
src/test/java/
├── base/               → BaseTest (Request & Response Spec)
├── endPoints/          → API endpoints (User, Product, Brand, Login)
├── payload/            → POJO classes (User)
├── tests/              → Test classes
└── utilities/          → TestData + TestDataHelper
```

---

## Features

- Clean and reusable endpoint methods
- No hardcoding (all data in `TestData`)
- POJO + Form Parameter support
- Positive and Negative test cases
- Allure Report integration
- TestNG Suite (`testng.xml`)
- Dynamic unique email generation

---

## Test Cases Covered (14 APIs)

| #  | Test Case                                      | Type      | Status |
|----|------------------------------------------------|-----------|--------|
| 1  | Get All Products List                          | Positive  | Done   |
| 2  | POST To All Products List                      | Negative  | Done   |
| 3  | Get All Brands List                            | Positive  | Done   |
| 4  | PUT To All Brands List                         | Negative  | Done   |
| 5  | POST To Search Product                         | Positive  | Done   |
| 6  | Search Product without parameter               | Negative  | Done   |
| 7  | Verify Login with valid details                | Positive  | Done   |
| 8  | Verify Login without email parameter           | Negative  | Done   |
| 9  | DELETE To Verify Login                         | Negative  | Done   |
| 10 | Verify Login with invalid details              | Negative  | Done   |
| 11 | Create/Register User Account                   | Positive  | Done   |
| 12 | Delete User Account                            | Positive  | Done   |
| 13 | Update User Account                            | Positive  | Done   |
| 14 | Get User Detail by Email                       | Positive  | Done   |

---

## How to Run the Project

1. Clone the repository
2. Open it in IntelliJ IDEA
3. Make sure you have Java and Maven installed
4. Run the tests using:

```
bash
mvn clean test
Or run the testng.xml file directly from IntelliJ.
```
### Generate Allure Report

After running the tests, generate the report using:

```
bash
allure serve allure-results
```
## Author

**Omar Monir**  
Aspiring Software Tester / SDET

I'm currently learning automation testing and building projects to improve my skills.

- GitHub: [Omar-Monir](https://github.com/Omar-Monir)
