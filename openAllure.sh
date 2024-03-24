#!/bin/bash

# Navigate to the directory with test results
cd \src\test\resources || exit

# Generate the Allure report
allure generate results -o allure-report --clean

# Optionally, you can serve the report using a server
# allure serve results
