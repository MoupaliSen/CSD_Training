Feature: User Login

Scenario: Successful login
       Given the user open the application
       And the user is on the login page
       When the user enters valid credentials(username: "abc@gamil.com" ,password: "abc@123")
       When the user clicked on submit buttton
       Then the user should see my acco
			 And the user should see a welcome message
			 

       


