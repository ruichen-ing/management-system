package com.ruichen.managementSystem.model;

public enum Status {
    ACTIVATED(0, "activated", "Activated"),
    LOCKED(1, "locked", "Locked"),
    DELETE(2, "deleted", "Deleted");

    private Integer value;
    private String status1;
    private String status2;

    private Status(Integer value, String status1, String status2){
        this.value = value;
        this.status1 = status1;
        this.status2 = status2;
    }

}
