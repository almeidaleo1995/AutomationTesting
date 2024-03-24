# AutomationTesting Project

This project is designed to run automated tests using Maven and generate Allure Reports. The reports can be viewed locally after running the tests or on GitHub Pages following each GitHub Actions build.

## Running Tests Locally

### Prerequisites

- Java JDK 17
- Maven
- Firefox and Geckodriver (or another browser with its corresponding driver)
- Allure Commandline

### Instructions

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/almeidaleo1995/ApiTestsPytest.git

2. Navigate to the project directory:

   ```bash
   cd AutomationTesting

3. Running E2E tests:
    ```bash
     mvn -Dtest=E2ETestRunner test

4. Run API Tests:
    ```bash
    mvn -Dtest=ApiTestRunner test
    
5. Generate Allure Reports:
   
   On Windows:
       
         .\openAllure.bat

   On Linux/Mac:
       
         chmod +x /path/to/generate-report.sh
        ./generate-report.sh

## Running Tests with GitHub Actions
The tests are automatically triggered on GitHub Actions with each push or pull request to the master branch. The results are published to GitHub Pages and can be viewed at:
  ###Viewing the Report on GitHub Pages
  [AutomationTesting Report](https://almeidaleo1995.github.io/AutomationTesting/)


## Project Structure
-src: Contains the test source code.

-pom.xml: Maven configuration file.

-.github/workflows: Contains the GitHub Actions YAML configuration file.

-target: Directory where Maven stores the build output, including Allure report files

## Contributing     
If you would like to contribute to this project, please follow the standard GitHub workflow:

1.Fork the repository.

2.Create a new branch for your feature or bug fix.

3.Make your changes and commit them.

4.Push your changes to your fork.

5.Create a pull request to the main repository.
