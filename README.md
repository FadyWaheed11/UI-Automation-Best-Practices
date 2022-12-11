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
* [Method Chaining Concept](#method-chaining-concept)
* [Static Factory Method](#static-factory-method)
* Data Driven techniques
* Read & Write from **JSON** File
* Dynamic Locators
## Project Structure
* **Consists of two part**
  - Main part which contains our framework
  - Test part which contains our test scenarios
  - ![Screenshot 2022-11-29 201354](https://user-images.githubusercontent.com/41761100/204613691-451500e4-b709-4ad9-ba8d-4afddb4a5843.png)
## Test Scenario
* Our test scenario is to go to [Ecommerce-Website](https://magento.softwaretestingboard.com/)
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
  - [Guru99](https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html)
  - [GeeksForGeeks](https://www.geeksforgeeks.org/page-object-model-pom/)
  - [Official Selenium](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/)
  - [BrowserStack](https://www.browserstack.com/guide/page-object-model-in-selenium)
## Singleton Design Pattern
* Singleton design pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the jvm
* So in our case we want to ensure that we have only one instance of WebDriver
 - ![Singleton](https://user-images.githubusercontent.com/41761100/204817225-65b88168-8f0b-4517-ad74-bd3e706eded7.svg)
* You can read more about singleton design pattern on:
  - [TutorialsPoint](https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm)
  - [GeeksForGeeks](https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/)
  - [Medium](https://medium.com/geekculture/introduction-to-design-patterns-understanding-singleton-design-pattern-5a4d49960444#:~:text=The%20Singleton%20Design%20Pattern%20is,%3B%20in%20case%20of%20Java)
## Method Chaining Concept
* Method Chaining is the practice of calling different methods in a single line instead of calling other methods with the same object reference separately. Under this procedure, we have to write the object reference once and then call the methods by separating them with a (dot.).
* Syntax -> obj.method1().method2().method3();
* So in our case we made those methods return this which refers to the current object
  - ![Method Chaining](https://user-images.githubusercontent.com/41761100/205443702-54c7c867-9a72-4019-8d68-b6936b4354f8.svg)
* So in our Test part instead of calling methods like this:
  - ![carbon (2)](https://user-images.githubusercontent.com/41761100/205444424-d7de2a0f-ffe2-4139-9242-3a47d4bc7f79.svg)
* We do this:
  - ![carbon (1)](https://user-images.githubusercontent.com/41761100/205444382-52e54122-38ce-44b2-bbf8-480807be2814.svg)
## Static Factory Method
* The most widely used technique to allow other parts of our Java programs, to get objects of a certain type, is to create public constructors.
* There is also another technique which is that provides various advantages and it would be highly recommendable for every programmer to know. Classes can provide static factory methods. This methods are another way of returning instances.
* #### Advantages of static factory method
  - svsvffvs
