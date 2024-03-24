# AutomationTesting Project

This project is designed to run automated tests using Maven and generate Allure reports. The reports can be viewed locally after running the tests or on GitHub Pages following each GitHub Actions build.

## Running Tests Locally

### Prerequisites

- Java JDK 17
- Maven
- Firefox and Geckodriver (or another browser with its corresponding driver)
- Allure Commandline

### Instructions

```bash
#!/bin/bash

# Cloning the repository
echo "Cloning the repository..."
git clone https://github.com/almeidaleo1995/AutomationTesting.git
cd AutomationTesting

# Running E2E tests
echo "Running E2E tests..."
mvn -Dtest=E2ETestRunner test

# Running API tests
echo "Running API tests..."
mvn -Dtest=ApiTestRunner test

# Generating Allure report for Windows users
echo "Generating Allure report for Windows..."
./openAllure.bat

# Generating Allure report for macOS/Linux users
echo "Generating Allure report for macOS/Linux..."
./generate-report.sh

echo "Process completed!"
