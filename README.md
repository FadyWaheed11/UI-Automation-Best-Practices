# UI-Automation-Best-Practices
## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Concepts](#concepts)
* [Project Structure](#project-structure)
* [Test Scenario](#test-scenario)
## General info
This project is a simple maven project applying some important concepts in the field of **UI Automation Testing.**
## Technologies
Project is created with:
* Java version: JDK-18
* Selenium-java version: 4.6.0
* Selenium-support version: 4.6.0
* Testng version: 7.6.1
* Json-simple version: 1.1.1
## Concepts
* [Page-Object-Model Pattern **POM**](#pom)
* [Singleton Design Pattern](#singleton-design-pattern)
* Method Chaining Concept
* Static Factory Method
* Data Driven techniques
* Read & Write from **JSON** File
* Dynamic Locators
## Project Structure
* **Consists of two part**
  - Main part which contains our framework
  - Test part which contains our test scenarios
  - ![Screenshot 2022-11-29 201354](https://user-images.githubusercontent.com/41761100/204613691-451500e4-b709-4ad9-ba8d-4afddb4a5843.png)
## Test Scenario
* Our test scenario is to go to https://magento.softwaretestingboard.com/
* Create a new account
  - Use different email for each run by using the machine date as a part of the email
* Fill new address form
* Go to men section
* Go to hoodies and sweatshirts section
* Add random hoodies and sweatshirts to the cart, I mean by random is:
  - Random colour from the available ones
  - Random size
* Validation on the cart section:
  - Validate on the total price
  - Validate on the count of added hoodies
## POM
* Page Object Model (POM) is a design pattern, popularly used in test automation that creates Object Repository for web UI elements.
* The advantage of the model is that it reduces code duplication and improves test maintenance.
* We separate the framework (coding part) from the testing part
 - ![204613691-451500e4-b709-4ad9-ba8d-4afddb4a5843](https://user-images.githubusercontent.com/41761100/204801549-c8ba26dd-ff3c-497f-a444-e5353a1bf59c.png)
* We represent each webpage in our website by Class in the framework like this page
 - ![Screenshot 2022-11-30 145605](https://user-images.githubusercontent.com/41761100/204803096-b00e883b-2902-44d6-8281-0243c968a603.jpg) ![Screenshot 2022-11-30 145737](https://user-images.githubusercontent.com/41761100/204803641-1d285ff6-85e8-4cd9-a92f-9547d3cf4f74.png)
* You can read more about POM structure on:
 - https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html
 - https://www.geeksforgeeks.org/page-object-model-pom/
 - https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/
 - https://www.browserstack.com/guide/page-object-model-in-selenium
