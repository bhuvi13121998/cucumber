Feature: Hotel Booking In Adactlin Applicaion
@FirstTest
Scenario Outline: hotel
Given User Launch The Application
When User Enter The "<uname>" In UserName Field
And User Enter The "<pword>" In Pword Field
Then User Click On Login Button And It Navigate To the Search Hotel
Examples:
|uname|pword|
|Bhuvi1312|Bb225138*|
@FirstTest
Scenario:
When User Select The Location In Location Field
And User Select The Hotel In Hotels Field
And User Select The Room Type In RoomType Field
And User Select the Number Of Rooms Field
And User Enter The Check In Date In CheckIn Field
And User Enter The Check Out Date In CheckOut Field
And User Enter The Number Adults Per Room in Adults Field
And User Enter The Number Childers Per Room In Childrens Field
Then User Click On Search Button And It Navigate To The Select Hotel
@second
Scenario:
When User Select The Hotel In Select Field
Then User Click On Continue Button And It Navigate To the Book Hotel
@second
Scenario:
When User Enters the UserName In UserName Field
And User Enters the LastName In LastName Filed
And User Enters The Address In Billing Address Field
And User Enters The Credit Card No In CreditCard Field
And User Select The Credit Card Type In CreditCard Field
And User Select The Expiry Month And Year In Expiry Field
And User Enters The CVV Number In CVV Number field
Then User Click On The Book Now Button It Navigate To The Book Confirmation
@third
Scenario:
Then User Click On The Logout Button





