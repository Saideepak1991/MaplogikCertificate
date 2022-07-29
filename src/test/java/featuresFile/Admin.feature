  
 Feature: Login to admin page approve certificate, decline certificate and pending certification  of the student

@approve
Scenario: login to admin page approve certificate
Given admin login with emailId "admin@gmail.com" and password "Admin@123"
When click on co-curricular field from admin page and click symposium field
Then click on pending button and search with studentId "4RECSC0603"
When select certificate "t1" and click approve button
Then click logout button

@decline
Scenario: login to admin page decline certificate
Given admin login with emailId "admin@gmail.com" and password "Admin@123"
When click on co-curricular field from admin page and click symposium field
Then click on pending button and search with studentId "4RECSC0603"
When select certificate "t2" and click decline button
Then click logout button

@verifypending
Scenario: login to admin page and verify pending certificate
Given admin login with emailId "admin@gmail.com" and password "Admin@123"
When click on co-curricular field from admin page and click symposium field
Then click pending button and search for a student with "4RECSC0603"
And verify the pending certificate title "t3"
Then click logout button 





