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
* Singleton Design Pattern
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
* Page Object Model is a design pattern popularly used in test automation that creates Object Repository for web UI elements. We represent each web page in the website by Class in our automation framework

