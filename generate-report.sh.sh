#!/bin/bash

if ! command -v allure &> /dev/null
then
    echo "Allure command could not be found"
    exit 1
fi


allure generate --clean

git checkout gh-pages || git checkout --orphan gh-pages
git reset --hard
git pull origin gh-pages --allow-unrelated-histories --strategy-option=theirs || echo "No history yet"
cp -r allure-report/* .
git add .
git commit -m "Publish Allure Report"
git push origin gh-pages
