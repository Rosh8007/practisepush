Feature:Demo blaze testing

@RRR1
Scenario:Register on demoBlaze
Given user navigate to demoBlaze
And user click on register button
And user enters on firstname 
And user enters on lastname
And user clicks on regButton
And user accept alert1

@RRR2
Scenario:Login on demobalaze
Given user clicks on login button
And user enters loginname
And user  loginpassword
And user clicks on logbotton
And user accept alert2

@RRR3
Scenario: buying book
Given user clicks on mobile to buy
And user select mobile
And user clicks on addtocart 
And user accept alert3
And user click on cart button
And user clicks on place order
And user enters firstnmae
And user enters country
And user enters city
And user enters creditcard
And user enters month
And user enters years
And user clicks on purchase



