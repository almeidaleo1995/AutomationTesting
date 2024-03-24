# AutomationTesting Project

This project is designed to run automated tests using Maven and generate Allure reports. The reports can be viewed locally after running the tests or on GitHub Pages following each GitHub Actions build.

## Running Tests Locally

### Prerequisites

- Java JDK 17
- Maven
- Firefox and Geckodriver (or another browser with its corresponding driver)
- Allure Commandline

### Instructions

# Step 1: Clone the Repository
echo "Step 1: Cloning the repository..."
git clone https://github.com/almeidaleo1995/AutomationTesting.git
cd AutomationTesting
echo "Repository cloned successfully."

# Step 2: Run End-to-End Tests
echo "Step 2: Running E2E tests..."
mvn -Dtest=E2ETestRunner test
echo "E2E tests completed."

# Step 3: Run API Tests
echo "Step 3: Running API tests..."
mvn -Dtest=ApiTestRunner test
echo "API tests completed."

# Step 4: Generate Allure Reports (Windows)
echo "Step 4: Generating Allure report for Windows..."
# Replace with actual command if necessary
./openAllure.bat
echo "Allure report generated for Windows."

# Step 4 Alternative: Generate Allure Reports (macOS/Linux)
echo "Step 4 Alternative: Generating Allure report for macOS/Linux..."
# Replace with actual command if necessary
./generate-report.sh
echo "Allure report generated for macOS/Linux."

# End of script
echo "All steps completed successfully."


### Running Tests with GitHub Actions
The tests are automatically triggered on GitHub Actions with each push or pull request to the master branch. The results are published to GitHub Pages and can be viewed at:

[AutomationTesting Report](https://almeidaleo1995.github.io/AutomationTesting/)


### Project Structure
-src: Contains the test source code.
-pom.xml: Maven configuration file.
-.github/workflows: Contains the GitHub Actions YAML configuration file.
-target: Directory where Maven stores the build output, including Allure report files.
