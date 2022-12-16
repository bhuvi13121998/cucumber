$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactlin Applicaion",
  "description": "",
  "id": "hotel-booking-in-adactlin-applicaion",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "hotel",
  "description": "",
  "id": "hotel-booking-in-adactlin-applicaion;hotel",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@FirstTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enter The \"\u003cuname\u003e\" In UserName Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"\u003cpword\u003e\" In Pword Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Click On Login Button And It Navigate To the Search Hotel",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactlin-applicaion;hotel;",
  "rows": [
    {
      "cells": [
        "uname",
        "pword"
      ],
      "line": 9,
      "id": "hotel-booking-in-adactlin-applicaion;hotel;;1"
    },
    {
      "cells": [
        "Bhuvi1312",
        "Bb225138*"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactlin-applicaion;hotel;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "hotel",
  "description": "",
  "id": "hotel-booking-in-adactlin-applicaion;hotel;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@FirstTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enter The \"Bhuvi1312\" In UserName Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"Bb225138*\" In Pword Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Click On Login Button And It Navigate To the Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Launch_The_Application()"
});
formatter.result({
  "duration": 3973877100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bhuvi1312",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_UserName_Field(String)"
});
formatter.result({
  "duration": 145867200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bb225138*",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Pword_Field(String)"
});
formatter.result({
  "duration": 101189100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Click_On_Login_Button_And_It_Navigate_To_the_Search_Hotel()"
});
formatter.result({
  "duration": 794144200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactlin-applicaion;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@FirstTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User Select The Location In Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User Select The Hotel In Hotels Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Select The Room Type In RoomType Field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Select the Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Enter The Check In Date In CheckIn Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Enter The Check Out Date In CheckOut Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User Enter The Number Adults Per Room in Adults Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Enter The Number Childers Per Room In Childrens Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Click On Search Button And It Navigate To The Select Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Select_The_Location_In_Location_Field()"
});
formatter.result({
  "duration": 277940100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Select_The_Hotel_In_Hotels_Field()"
});
formatter.result({
  "duration": 242630000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Select_The_Room_Type_In_RoomType_Field()"
});
formatter.result({
  "duration": 216629200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Select_the_Number_Of_Rooms_Field()"
});
formatter.result({
  "duration": 166234000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Enter_The_Check_In_Date_In_CheckIn_Field()"
});
formatter.result({
  "duration": 87987100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Enter_The_Check_Out_Date_In_CheckOut_Field()"
});
formatter.result({
  "duration": 100563000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Enter_The_Number_Adults_Per_Room_in_Adults_Field()"
});
formatter.result({
  "duration": 214020100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Enter_The_Number_Childers_Per_Room_In_Childrens_Field()"
});
formatter.result({
  "duration": 198564100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Click_On_Search_Button_And_It_Navigate_To_The_Select_Hotel()"
});
formatter.result({
  "duration": 739069400,
  "status": "passed"
});
});