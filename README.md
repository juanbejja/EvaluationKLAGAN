#Automation GUI - Technical test

Pre-requisites:

JDK 8
MAVEN 3.6.3

#Technologies used

Selenium - Cucumber - ExtentReport


Use:

execute the following command in a terminal from the root of the project.

mvn -Dcucumber.options="src/test/java/features/Reservation.feature" test

This will bring up a Chrome Driver where you will be able to view the automated test "Search for a one way flight from Buenos Aires to Madrid".
once the test is finished in the test-outup folder, the report will be stored in html format with the screenshots.

