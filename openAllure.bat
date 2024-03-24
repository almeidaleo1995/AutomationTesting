@echo off
cd C:\repos\AutomationTesting\src\test\resources
call allure generate results -o allure-report --clean
call allure open allure-report
