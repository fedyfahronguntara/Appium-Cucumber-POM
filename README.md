# Appium-Cucumber-POM

# Environment
1. Emulator API 28 from android studio
2. check deviceName and put on Setup.java
3. check udid emulator using `adb devices` and put on Setup.java

# Set Up Maven Environment Variable
1. To setup Maven, download the maven’s latest version form Apache depending upon different OS.
2. Open system properties through My Computer.
3. Navigate to ‘Advanced System Settings’.
4. Click on ‘Environment Variables’.
5. Click on the Edit button under user variables.
6. Type ‘PATH’ in the Variable name box & ‘C:\apache-Maven-3.6.1\bin’ in the Variable value box.

# Running the test Suite
run the following command to start the execution
1. Open command prompt.
2. Set MavenProject folder as working directory In command prompt.
3. run `mvn clean install` and if want to run again run `mvn test`

# Report using cluecumber-report-plugin
report results can be seen in the file target / generate-report / index.html


# Automated tests in the SDLC
1. Plan :
This plan aims to review the roadmap and manual for testcases
and select candidates for automation and define testing strategies
2. Design :
refactor manual testing to be ready for automation tests
planning data management and frameworks and libraries like POM framework
3. Develop :
do script creation according to testcases and prepare a repository for management
as well as documentation
4. Execute :
run a test script that has been created which can then be run according to the card or feature or task you want to run
For automation, it is set in the yml file for each method that will be running so that the regression testing process can be easier to do 
5. Maintain :
update required asserts and perform regression tests
