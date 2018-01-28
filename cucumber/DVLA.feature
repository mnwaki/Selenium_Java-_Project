Feature: Launch DVLA website and check the vehicle registration details

  Scenario Outline: Check the vehicle details
    Given An URL to launch the DVLA web application
    When User enters the registration number
    Then Vehicle details are verified
