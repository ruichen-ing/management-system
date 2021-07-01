package com.ruichen.managementSystem.model;

public enum Gender {
    MALE(0, "male", "Male"),
    FEMALE(1, "female", "Female");

    private Integer value;
    private String gender1;
    private String gender2;

    private Gender(Integer value, String gender1, String gender2){
        this.value = value;
        this.gender1 = gender1;
        this.gender2 = gender2;
    }
}
