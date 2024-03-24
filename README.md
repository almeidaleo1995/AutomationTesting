# AutomationTesting Project

This project is set up to run automated tests with Maven and generate Allure Reports. You can view the results either locally after running the tests or on GitHub Pages following each GitHub Actions build.

## Running Tests Locally

### Prerequisites

- Java JDK 17
- Maven
- Firefox and [Geckodriver](https://github.com/mozilla/geckodriver/releases) (or another browser with its corresponding driver)
- [Allure Commandline](https://docs.qameta.io/allure/#_installing_a_commandline) (for generating and serving reports locally)

### Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/almeidaleo1995/AutomationTesting.git
   cd AutomationTesting
Execute the tests with Maven:
bash
Copy code
mvn clean test
Generate the Allure report:
bash
Copy code
mvn allure:report
Serve the Allure report locally:
bash
Copy code
allure serve target/allure-results
Running Tests with GitHub Actions
The tests are automatically triggered on GitHub Actions with each push or pull request to the master branch.
The results are published to GitHub Pages and can be viewed at: AutomationTesting Report.
Project Structure
src: Contains the test source code.
pom.xml: Maven configuration file.
.github/workflows: Contains the GitHub Actions YAML configuration file.
target: Directory where Maven stores the build output, including Allure report files.
GitHub Actions Workflow
The GitHub Actions configuration is located in .github/workflows/maven.yml and is responsible for:

Setting up the environment with JDK 17.
Running tests using Maven.
Generating Allure reports.
Publishing the reports to GitHub Pages.
Viewing the Report on GitHub Pages
To access the generated report on GitHub Pages, visit AutomationTesting Report.
