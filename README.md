# Test Assignment 2

**Contributers:** Anders, Dmitro

---------------------------------------------------------------

The below assignment was made by Anders and Dmitro. All but the two Katas
are made in collaboration, while the two Katas are made individually and 
are placed in separate modules within the project. How to run the Katas 
are described in the [Two Katas](#2-two-katas) section.

# 1 Reflection

## 1.1 Computer Mouse

Identify the types of testing you would perform on a computer mouse, to make sure
that it is of the highest quality.

The types of tests we have identified to ensure us a mouse of the highest 
quality is listed below.

### Functional Testing

- Unit Testing
- Boundary Value Testing
- Branch Testing
- Component Testing
- Gorilla Testing
- Negative Testing

### Non-functional Testing

- Usability Testing
- Alpha Testing
- Beta Testing
- Comparison Testing
- Compatibility Testing
- Install/Uninstall Testing
- Load Testing
- Monkey Testing
- Mutation Testing
- Performance Testing
- Recovery Testing
- Stress test

## 1.2 Catastrophic Failure

Find a story where a software system defect had a bad outcome. Describe what
happened. Can you identify a test that would have prevented it?

### Story 

On June 4, 1996, an Ariane 5 rocket launched by the ESA (European Space Agency) 
exploded just forty seconds after its launch from Kourou in the French Guiana. 
The rocket was on its inaugural voyage, after a decade of development costing 
$8 billion and the result of this bug was the loss of $370 million.
The reason behind its failure was an integer Overflow, which is a widespread 
bug in computer programming. In this case, an attempt was made to set a 64-bit 
number in 16-bit space.

Source(s):
<br>https://medium.com/swlh/some-of-the-most-famous-bugs-in-software-history-bb16a2ee3f8e
<br>https://en.wikipedia.org/wiki/Ariane_5#Launch_pricing_and_market_competition

### See a video of the accident below

[![Alt text](https://i3.ytimg.com/vi/gp_D8r-2hwk/hqdefault.jpg)](https://www.youtube.com/watch?v=gp_D8r-2hwk)


### Identify a test that could have prevented it

**OBS: Explanations on the types of tests are directly copied from the 
source mentioned below.**
<br>A test that could have prevented this type of error could be 
Component Testing. Component Testing is mostly performed by 
developers after the completion of unit testing.
Component Testing involves testing of multiple functionalities as a 
single code and its objective is to identify if any defect exists after 
connecting those multiple functionalities with each other.

In order for the Component Testing to function in this case, a 
"Boundary Value Test" should be implemented as well. This type of 
testing checks the behavior of the application at boundary level.
Boundary Value Testing is performed to check if defects exist at 
boundary values. Boundary Value Testing is used for testing a 
different range of numbers. There is an upper and lower boundary for 
each range and testing is performed on these boundary values.
If testing requires a test range of numbers from 1 to 500 then 
Boundary Value Testing is performed on values at 0, 1, 2, 499, 500 
and 501.

Another type of test that may have prevented this accident could be 
Gorilla Testing. Gorilla Testing is a testing type performed by a 
tester and sometimes by the developer as well. In Gorilla Testing, 
one module or the functionality in the module is tested thoroughly 
and heavily. The objective of this testing is to check the robustness 
of the application.

Source: 
<br>https://www.softwaretestinghelp.com/types-of-software-testing/

# 2 Two Katas

Complete the following using TDD. Remember the TDD mantra.

## 2.1 String Utility

Use TDD to create a string utility with the following methods:
- Reverse string (aBc -> cBa)
- Capitalize string (aBc -> ABC)
- Lowercase string (aBc -> abc)

Don’t use any built-in string utility – create your own. Remember, the exercise here is to
use TDD, not to deliver a working utility without tests. If there are no tests in the
solution, it won’t be accepted.

### To Run

#### Anders

1. Clone this repository
2. Navigate to StringUtility tests ```StringUtilityTDDAnders/src/test/java/stringutility```
3. There are three test classes ```StringUtilityReverseTest```, ```StringUtilityCapitalizeTest```, ```StringUtilityLowercaseTest```.
4. Run each of these three classes to see the test results

> OBS: ```StringUtilityTDDAnders``` is a module.

#### Dmitro

-[ ] Write how to run your tests

### Associated Files

#### Anders

The test files are located in ```StringUtilityTDDAnders/src/test/java/stringutility``` as described in the [To run](#to-run-1) section.

The actual implementation can be found here ```StringUtilityTDDAnders/src/main/java/stringutility/StringUtility.java```


#### Dmitro

-[ ] Write which files are associated with your code (for string utility)

## 2.2 Bowling Game Kata

### To Run

#### Anders

1. Clone this repository
2. Navigate to StringUtility tests ```StringUtilityTDDAnders/src/test/java/bowlinggame```
3. Run the test class ```BowlingGameTest```

OBS: ```StringUtilityTDDAnders``` is a module.

#### Dmitro

-[ ] Write how to run your tests

### Associated Files

#### Anders

The test file is located in ```StringUtilityTDDAnders/src/test/java/bowlinggame``` as described in the [To run](#to-run-2) section.

The actual implementation can be found here ```StringUtilityTDDAnders/src/main/java/bowlinggame/BowlingGame.java```

#### Dmitro

-[ ] Write which files are associated with your code (for Bowling game)

# 3 Investigation of tools

## 3.1 JUnit 5

Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.

### ```@Tag```

>  ```@Tag ``` is a repeatable annotation that is used to declare a tag for the annotated 
> test class or test method. Tags are used to filter which tests are executed for 
> a given test plan. For example, a development team may tag tests with values 
> such as "fast", "slow", "ci-server", etc. and then supply a list of tags to be 
> used for the current test plan, potentially dependent on the current environment. <br>
> **Syntax Rules for Tags**
> - A tag must not be blank.
> - A trimmed tag must not contain whitespace.
> - A trimmed tag must not contain ISO control characters.
>
> Source: JUnit documentation → [Go to junit docs](https://junit.org/junit5/docs/5.0.2/api/org/junit/jupiter/api/Tag.html)

### ```@Disabled```

> ```@Disabled``` is used to signal that the annotated test class or test method is 
> currently disabled and should not be executed.
> When applied at the class level, all test methods within that class are 
> automatically disabled as well.
> <br><br>Source: JUnit documentation → [Go to junit docs](https://junit.org/junit5/docs/5.0.2/api/org/junit/jupiter/api/Disabled.html)
### ```@RepeatedTest```

> ````@RepeatedTest```` is used to signal that the annotated method is a test template method 
> that should be repeated a specified number of times with a configurable display name.
> Each invocation of the repeated test behaves like the execution of a regular ````@Test````
> method with full support for the same lifecycle callbacks and extensions. In 
> addition, the current repetition and total number of repetitions can be 
> accessed by having the RepetitionInfo injected. <br>
> **Syntax Rules for RepeatedTest**
> - ````@RepeatedTest```` methods must not be private or static and must return void.
> - ````@RepeatedTest```` methods may optionally declare parameters to be resolved by ParameterResolvers.
> - ````@RepeatedTest```` may also be used as a meta-annotation in order to create a custom composed annotation that inherits the semantics of ````@RepeatedTest.````
>
> Source: JUnit documentation → [Go to junit docs](https://junit.org/junit5/docs/5.0.2/api/org/junit/jupiter/api/RepeatedTest.html)

### ````@BeforeEach, @AfterEach````

> ````@BeforeEach```` is used to signal that the annotated method should be executed before each 
> ````@Test```` method in the current test class.
> <br>**Syntax Rules for BeforeEach**
> - ````@BeforeEach```` methods must have a void return type
> - Must not be private, and must not be static. 
> - They may optionally declare parameters to be resolved by ParameterResolvers.
>
> 
> Source: JUnit documentation → [Go to junit docs](https://junit.org/junit5/docs/5.0.2/api/org/junit/jupiter/api/BeforeEach.html)
> 
> ````@AfterEach```` is used to signal that the annotated method should 
> be executed after each ````@Test```` method in the current test class.
> <br>**Syntax Rules for BeforeEach**
> - ````@AfterEach```` methods must have a void return type
> - Must not be private, and must not be static.
> - They may optionally declare parameters to be resolved by ParameterResolvers.
>
> Source: JUnit documentation → [Go to junit docs](https://junit.org/junit5/docs/5.0.2/api/org/junit/jupiter/api/AfterEach.html)

### ````@BeforeAll, @AfterAll````

> ````@BeforeAll```` is used to signal that the annotated method should be executed *before* **all** 
> tests in the current test class.
> In contrast to ````@BeforeEach```` methods, ````@BeforeAll```` methods are only executed once for 
> a given test class.
> <br>**Syntax Rules for BeforeAll**
> - ````@BeforeAll```` methods must have a void return type 
> - Must not be private, and must be static by default. 
> - Consequently, ````@BeforeAll```` methods are not supported in ````@Nested```` test classes or as 
> interface default methods unless the test class is annotated with 
> ````@TestInstance(Lifecycle.PER_CLASS)````. ````@BeforeAll```` methods may optionally declare 
> parameters to be resolved by ParameterResolvers.
>
> Source: JUnit documentation → [Go to junit docs](https://junit.org/junit5/docs/5.0.2/api/org/junit/jupiter/api/BeforeAll.html)
>
> ````@AfterAll```` is used to signal that the annotated method should be executed *after* **all**
> tests in the current test class.
> In contrast to ````@AfterEach```` methods, ````@AfterAll```` methods are only executed once for
> a given test class.
> <br>**Syntax Rules for AfterAll**
> - ````@AfterAll```` methods must have a void return type
> - Must not be private, and must be static by default.
> - Consequently, ````@AfterAll```` methods are not supported in ````@Nested```` test classes or as
    > interface default methods unless the test class is annotated with
    > ````@TestInstance(Lifecycle.PER_CLASS)````. ````@AfterAll```` methods may optionally declare
    > parameters to be resolved by ParameterResolvers.
>
> Source: JUnit documentation → [Go to junit docs](https://junit.org/junit5/docs/5.0.2/api/org/junit/jupiter/api/AfterAll.html)

### ````@DisplayName````

> ````@DisplayName```` is used to declare a custom display name for the annotated test 
> class or test method.
> Display names are typically used for test reporting in IDEs and build tools 
> and may contain spaces, special characters, and even emoji.
>
> Source: JUnit documentation → [Go to junit docs](https://junit.org/junit5/docs/5.0.2/api/org/junit/jupiter/api/DisplayName.html)

### ````@Nested````

> @Nested is used to signal that the annotated class is a nested, non-static test class.
>
> Source: JUnit documentation → [Go to junit docs](https://junit.org/junit5/docs/5.0.2/api/org/junit/jupiter/api/Nested.html)
> 
> @Nested tests give the test writer more capabilities to express the relationship 
> among several groups of tests. Such nested tests make use of Java’s nested 
> classes and facilitate hierarchical thinking about the test structure.
> 
> Source: JUnit User guide → [Go to junit user guide](https://junit.org/junit5/docs/current/user-guide/#writing-tests-nested) 
> which includes extended examples on usage

### ````assumeFalse, assumeTrue````
> Assumptions is a collection of utility methods that support conditional test 
> execution based on assumptions.
> In direct contrast to failed assertions, failed assumptions do not result in a 
> test failure; rather, a failed assumption results in a test being aborted.
> 
> Assumptions are typically used whenever it does not make sense to continue 
> execution of a given test method — for example, if the test depends on 
> something that does not exist in the current runtime environment.
> 
> Source: JUnit documentation → [Go to junit docs](https://junit.org/junit5/docs/current/user-guide/#writing-tests-nested) 
> which includes a list of all Assumption methods and a small description of usage. 

## 3.2 Mocking Frameworks

Investigate mocking frameworks for your preferred language. Choose at least two
frameworks, and answer the questions. (One could be Mockito, which we saw in class.)
- What are their similarities?
- What are their differences?
- Which one would you prefer, if any, and why?

### Mockito, Easymock, JMockit
#### Similarities
All three frameworks are easily configured and uses annotations to define mocks. 
They all more or less follow the record-replay-verify pattern.

#### Differences
JMockit forces you to follow the record-replay-verify pattern which helps to 
maintain structure in the test code.
JMockit can be a bit more difficult to learn since it has a larger scope than the other frameworks.
JMockit is basically maintained by one person (has three contributors on GitHub)
JMockit can mock final classes.
JMockit's API documentation is very complete and provides detailed explanation 
for the entire mocking API.
Easymock forces you to call replay everytime you want to use a mock. 
Easymock is easy to install and provides a great install guide. 
A full API is available for browsing and understanding the framework more.
Easymock can switch between mocking modes (nice, normal, strict) which makes 
it flexible.
Easymock forces the user to define all interactions in the code, this gives 
complete control over all interactions, but can make it slower to use 
compared to the others that can handle this automatically.
Mockito has a large community support and focuses on a clean and simple API. 
Mockito has only one way to create mocks which makes it easy to use. 
Mockito enables users to easily track failed verifications in tests and 
these exceptions lead the user to the actual point of interaction in the 
code. The stack trace will always be clean and verification can be 
flexible in the order it is presented ensuring the most important 
verifications can be shown first.

> Sources:<br>
> [Mockito vs EasyMock vs JMockit](https://www.baeldung.com/mockito-vs-easymock-vs-jmockit) <br>
> [EasyMock Review](https://www.slant.co/options/825/~easymock-review) <br>
> [JMockit vs Mockito](https://www.slant.co/versus/824/826/~jmockit_vs_mockito) <br>

#### Preferred Mocking framework

##### Anders

I do not really have a favorite Mocking framework. 
This is because I have not used any mocking frameworks yet.
I've done unit testing, user testing and behavior driven testing.

But from what I've read about the above three frameworks, I think I would choose
JMockit, even though Mockito is the number one rated Mocking framework for Java. It sounds like it has a great and strict syntax and great documentation. 
Unfortunately it lacks a large community, but I would hope that the documentation 
and ease of use would be outweighing the lack in community.

# Hand-in

Make the katas individually. The other things may be done in groups. Handin on the
date given in peergrade. The hand-in should be code in a repository or zip-file, and a
README.md with the written answers.