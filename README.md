# Appium-Cucumber-POM

# Environment
1. Emulator API 27 from android studio
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
