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
## Anders
### 2.1 String Utility
Use TDD to create a string utility with the following methods:
- Reverse string (aBc -> cBa)
- Capitalize string (aBc -> ABC)
- Lowercase string (aBc -> abc)

Don’t use any built-in string utility – create your own. Remember, the exercise here is to
use TDD, not to deliver a working utility without tests. If there are no tests in the
solution, it won’t be accepted.

### 2.2 Bowling Game Kata


## Dima

