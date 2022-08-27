@tag
Feature: open student login and upload certificates in symposiums field
  
@studentLogin

Scenario: login student page
  
Given login student username and password
Given user click the Co-curriculam field and symposium field 
Then user fill all the details in the symposiums field and submit
And click the logout button 
   
@approve @admin

Scenario: login to admin page approve certificate

Given admin login with emailId and password 
When click on co-curricular field from admin page and click symposium field
Then click on pending button and search with studentId 
When select certificate and click approve button
Then click logout button

@decline @admin

Scenario: login to admin page decline certificate
Given admin login with emailId and password 
When click on co-curricular field from admin page and click symposium field
Then click on pending button and search with studentId
When select certificate  and click decline button
Then click logout button
  
@verifypending @admin

Scenario: to check pending certificate in admin page
Given admin login with emailId and password
When click on co-curricular field from admin page and click symposium field
Then click on pending button and search with studentId
And verify the pending certificate title 
Then click logout button

@verifyapprove @admin

Scenario: to check approve certificate in admin page
Given admin login with emailId and password
When click on co-curricular field from admin page and click symposium field
Then click on pending button and search with studentId
And verify the approve certificate title 
Then click logout button

@verifydecline @admin
Scenario: to check decline certificate in admin page
Given admin login with emailId and password
When click on co-curricular field from admin page and click symposium field
Then click on pending button and search with studentId
And verify the decline certificate title 
Then click logout button
 
 
 
 
 
 
 
 
 
 