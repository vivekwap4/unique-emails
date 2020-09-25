This is a backend API that takes in a list of emails as input and returns an integer denoting the total unique emails in the list.

# Constraints and Points to Note:
An email consists of two parts: username and domain name, divided by the @ sign. 

If the email is vivekwap4@email.com, username is vivekwap4 and domain is email.com

If the username contains a '.', it's ignored. For example vivek.wap4 becomes vivekwap4.

If the username contains a'+', everything from that position is ignored. For example vivek+wap4 becomes vivek.

The API follows these rules and returns total unique emails

# An Example Problem:
Input: ["test.email@gmail.com","test+email@gmail.com", "test.email+mail@gmail.com"]
Output: 2. Because test.email@gmail.com becomes testemail@gmail.com, test+email@gmail.com becomes test@email.com, and test.email+mail@gmail.com again becomes testemail@gmail.com.
        Therefore, we have two distinct email addresses.
        
# How to run:
The API is written using Java (JAX-RS). 

1) To run it locally, clone it to your system. Please make sure that you have Java, Eclipse, and Tomcat installed. Open Eclipse -> File -> Import Maven Project and import the                         project. Right click on the project -> Run As -> 1 Run on Server. The app would open a browser window with the path to the app root. The endpoint we want to target is 
localhost:8080/unique-emails/rest/emails/unique. The API can be tested through Postman.

2) The API is also deployed on heroku and can be hit at: https://unique-emails.herokuapp.com/rest/emails/unique
