--- Project: Liferay Challenge (Calculation of values ​​and fees) ---

* The Project was created with Maven to manage the JUnit dependency located in the "pom.xml" file.

* In the main project package (net.local.liferay.desafio), we created the class (DesafioLiferay.java) of "implementation" of the program, creating objects already proposed in the challenge.

* The package classes (net.local.liferay.desafio.domain), carry the logic of the project's calculation behavior,
  implementing the Tax interface (Centralizing the signature of the main calculation method) using the pattern of Project Strategy.

* In the package (net.local.liferay.desafio.model), I centralized the Model classes and ENUN with the definition of the categories of the items.

* The package classes (net.local.liferay.desafio.util) are responsible for creating the in-memory data model, used for persistence and formatting rules.


-- Architecture:

* JAVA 1.8 - Language
* ECLIPSE - Development IDE and VS Code.
* JUnit - Unit tests.
* MAVEN - Dependency management.
* DESIGN PATTERN -
	Singleton - Ensuring that a class has only one instance of itself and that it provides a global point of access to it.
	Strategy - Behavioral design pattern that transforms a set of behaviors into objects.

*  DATA PERSISTENCE - List of data in memory.# challenger-liferay
 
