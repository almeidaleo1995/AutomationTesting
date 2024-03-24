# AutomationTesting Project

This project is designed to run automated tests using Maven and generate Allure reports. The reports can be viewed locally after running the tests or on GitHub Pages following each GitHub Actions build.

## Running Tests Locally

### Prerequisites

- Java JDK 17
- Maven
- Firefox and Geckodriver (or another browser with its corresponding driver)
- Allure Commandline

### Instructions

#!/bin/bash

echo "Cloning the repository..."
git clone https://github.com/almeidaleo1995/AutomationTesting.git
cd AutomationTesting

echo "Running E2e test"
mvn -Dtest=E2ETestRunner test

echo "Running Api test"
mvn -Dtest=ApiTestRunner tes

echo "Generating Allure report windows"
./openAllure.bat

echo "Generating Allure report Mac OS linux"
./generate-report.sh

