#!/bin/bash

# Navega para o diretório especificado
cd /path/to/AutomationTesting/src/test/resources

# Gera o relatório Allure, limpando os relatórios antigos
allure generate results -o allure-report --clean

# Abre o relatório Allure
allure open allure-report
