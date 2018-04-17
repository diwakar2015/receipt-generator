### Requirements:
JDK 8.X
Maven 3.x and above

note: If Java 8.X is not present, change in POM.xml and change to 1.7.

### Steps to compile and run.

1. Import the project as Existing maven project
2. run command : `mvn clean install`

### To run the application:

Execute :  com.salesapp.application.MainApp main method

To run test cases:

Run :  `mvn clean test`


### Code Quality and Code coverage:

By default code coverage is enabled through maven test.
To disable the code coverage, remove the build tag from the pom.xml and run the build again
As of now, this code has 100% code coverage.

Pre-generated reports are under {base_dir}/receipt-generator/code-coverage/jacoco-ut/index.html

Steps to generate code-coverage reports:
From Eclipse, run `maven test` from Run As option. 

It will generate the reports at {project_dir}/target/jacoco-ut location which is defined under pom.xml.
