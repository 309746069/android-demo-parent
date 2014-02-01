package com.apiumtech.demo.presenter;


public class DemoModel implements IDemoModel {

    private String lastName;

    public DemoModel(String lastName) {
        this.lastName=lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
