@tag
Feature: open student login and upload certificates in symposiums field
  

 @tag1
  Scenario: login student page
  
    Given enter userid "4RECSC0603" and phonenumber "9092323050"
 
    Given user click the Co-curriculam field and symposium field 
    Then user fill all the details in the symposiums field and submit
  
    | Title | Event | contactedBy | dateAndYear | level | award | uploadcertificate | 
    | t1 | International | Aadiv | 2022 | International | Metal | c1 | 
    | t2 | National | Harsiv | 2022 | National | Certificate | c2 |
    | t3 | State | Aniruth | 2022 | State | Cash award | c3 |
  
 
 And click the logout button
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 