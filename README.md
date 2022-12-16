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
* [Data Driven Techniques](#data-driven-techniques)
* [Read & Write from **JSON** File](#read-write-from-json-file)
## Project Structure
* **Consists of two part**
  - Main part which contains our framework
  - Test part which contains our test scenarios
  - ![Screenshot 2022-11-29 201354](https://user-images.githubusercontent.com/41761100/204613691-451500e4-b709-4ad9-ba8d-4afddb4a5843.png)
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
 - ![carbon](https://user-images.githubusercontent.com/41761100/208140616-36f392ad-121e-41fb-9efa-ab9cff2ac6be.svg)
* You can read more about singleton design pattern on:
  - [TutorialsPoint](https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm)
  - [GeeksForGeeks](https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/)
  - [Medium](https://medium.com/geekculture/introduction-to-design-patterns-understanding-singleton-design-pattern-5a4d49960444#:~:text=The%20Singleton%20Design%20Pattern%20is,%3B%20in%20case%20of%20Java)
## Method Chaining Concept
* Method Chaining is the practice of calling different methods in a single line instead of calling other methods with the same object reference separately. Under this procedure, we have to write the object reference once and then call the methods by separating them with a (dot.).
* Syntax -> obj.method1().method2().method3();
* So in our case we made those methods return this which refers to the current object
  - ![carbon (5)](https://user-images.githubusercontent.com/41761100/208139063-196b8373-4320-43fb-86fc-3ea118c2352b.svg)
* So in our Test part instead of calling methods like this:
  - ![carbon (1)](https://user-images.githubusercontent.com/41761100/208140898-94cc656e-7630-4039-9312-59d03374340b.svg)
* We do this:
  - ![carbon (2)](https://user-images.githubusercontent.com/41761100/208141113-9a7f0330-fcc1-4874-8c4b-2a0f06206c5a.svg)
## Static Factory Method
* The most widely used technique to allow other parts of our Java programs, to get objects of a certain type, is to create public constructors.
* There is also another technique which is that provides various advantages and it would be highly recommendable for every programmer to know. Classes can provide static factory methods. This methods are another way of returning instances.
* #### Advantages of static factory method
  - The static factory method can have a meaningful name 
  - Static factory methods can return the same type that implements the method, a subtype, and also primitives.
  - Inside static factory method other than initialization if we want to perform any activity for every object creation like increasing count value for every object creation we can do this in the static factory method.
  - Encapsulate the construction logic.
* So How we will benefit from this in our framework ?
  - If we are testing the UI of website , we might have 50 pages or more 
  - And we had 50 test classes , we would have this new home page called 50 times:
    ![carbon (3)](https://user-images.githubusercontent.com/41761100/208141493-c433c114-494c-417e-85b6-27704ba028ce.svg)
  - Imagine if we decide to change the constructor of this class , we will have to change it in 50 different places 
  - But with this, it's only one place:
  - ![carbon (6)](https://user-images.githubusercontent.com/41761100/208143356-c33d4806-438d-46f2-bd7a-83155cda9110.svg)
* You can read more about Static Factory Method on:
  - [Medium](https://medium.com/javarevisited/static-factory-methods-an-alternative-to-public-constructors-73cbe8b9fda)
  - [GeeksForGeeks](https://www.geeksforgeeks.org/difference-between-constructor-and-static-factory-method-in-java/#:~:text=The%20static%20factory%20methods%20are,cached%20and%20reused%20if%20required)
  - [Baeldung](https://www.baeldung.com/java-constructors-vs-static-factory-methods)
  - [StackOverFlow](https://stackoverflow.com/questions/929021/what-are-static-factory-methods)
## Data Driven Techniques
* Data Driven Testing is a software testing method in which test data is stored in table or spreadsheet format.
* Data Driven Framework is an automation testing framework in which input values are read from data files and stored into variables in test scripts.
* Data Driven Testing is important because testers frequently have multiple data sets for a single test and creating individual tests for each data set can be time-consuming.
* In our case we will use JSON files for data driven.
#### Why JSON over Excel?
 - Most of data driven testing framework we have used Excel – Apache POI But there is other medium as well to store data into files such as csv, xml, json, text file, etc.
 - Excel is good to manage data and to use but it comes with its own limitations. Like MS Office needs to be installed on the system where the tests are being executed. 
 - As the test servers has never bound to have such dependencies.
 - If test is run on Mac, then again there is a different problem.
## Read Write From JSON File
* This function for reading JSON file:
  ![carbon (7)](https://user-images.githubusercontent.com/41761100/208143652-6b5089ba-9f8b-42d3-a5d9-37711fdcdcb4.svg)
* This function for updating specific value in JSON file:
  ![carbon (8)](https://user-images.githubusercontent.com/41761100/208144073-5f308434-c6a9-41f6-9ca7-f345b10aee4e.svg)
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
