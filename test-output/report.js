$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionalTests/Patient.feature");
formatter.feature({
  "name": "DaVita Application Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Davita Patient Home Page Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.PatientStepDef.user_opens_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user in on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PatientStepDef.user_in_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs into app",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PatientStepDef.user_logs_into_app()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat pageObjects.LoginPageObj.loginPatient(LoginPageObj.java:62)\r\n\tat stepDefinitions.PatientStepDef.user_logs_into_app(PatientStepDef.java:33)\r\n\tat ✽.user logs into app(file:///C:/Users/naushad.alam/eclipse-workspace/DaVitaCucumberFramework/src/test/resources/functionalTests/Patient.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Patient home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PatientStepDef.patient_home_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate patient home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PatientStepDef.validate_patient_home_page_title()"
});
formatter.result({
  "status": "skipped"
});
});