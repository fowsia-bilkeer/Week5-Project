# Week5-Project
Coverage: 34%
Fundamental project specification: Inventroy Management system (IMS)

Introduction 
The aim of this project is to create a fully functioning application using supporting tools such as agile & project management, databases & cloud fundamentals, programming & testing fundamentals and continous integration & build tools.


Getting Started

The instructions given will allow you to access the project and have it up and running on your local machine for the development and testing purposes. 
https://github.com/fowsia-bilkeer/Week5-Project

Prerequisites
The things needed to install the software and how you can install them.
- Java 16 JDK
- Maven
- Git
- Eclipse 
- JUnit 


Installing

Clone the project
Install it on to your computer 
Open it with Eclipse

When the project has been opened, we can start the application and start inputting our data. Creat your tables for orders, items and order items. Start to write your code in Eclipse. Run JUnit testing if it is up to par. Check the coverage of the test you have carried out.

 Running the tests

The testing for this project can be run manually by right clicking and clicking on the JUnit Test button. 

 Unit Tests 

Unit testing is a software development process in which the smallest testable parts of an application called units.
The premise of unit testing is to see if each method created within customer, item and order was sufficiently working. 

 Integration Tests 

integration testing was used throughout the project, the application of our choosing was Mockito. It is used to bring forth the method by testing the method itself which allows more complicated methods to be tested. 

Explaination


public void testReadAll() {
		List<Order> items = new ArrayList<>();
		items.addAll((Collection<? extends Order>) new Item(1L, "chewits", "1.80"));
		
		List<org.apache.logging.log4j.core.config.Order> orders = null;
		Mockito.when(dao.readAll()).thenReturn(orders);
		
		assertEquals(items, controller.readAll());
		
		Mockito.verify(dao, Mockito.times(1)).readAll();

This returned a list of items when we executed the readAll method in the Item class.


Built With

* [Maven](https://maven.apache.org/) - Dependency Management

 Versioning

We use [SemVer](http://semver.org/) for versioning.

Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
