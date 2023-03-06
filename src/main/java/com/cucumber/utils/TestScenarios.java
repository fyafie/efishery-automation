package com.cucumber.utils;

public enum TestScenarios {

    T1("User enter username password invalid"),
    T2("User click button login"),
    T3("User stay in login page"),
    T4("User enter username password valid"),
    T5("User User click button login"),
    T6("User go to product page"),
    T7("User click item"),
    T8("User get item in chart"),
    T9("User click remove"),
    T10("User removed item in chart"),
    T11("User click checkout"),
    T12("User input name"),
    T13("User input last name"),
    T14("User input zip"),
    T15("User click continue"),
    T16("User click finish"),
    T17("User get success notification"),
    T18("User click menu"),
    T19("User click logout"),
    T20("User back to login page")
    ;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
