package com.ruichen.managementSystem.model;

public enum DpStatus {
    PREPARING(0, "preparing", "Preparing"),
    OPERATING(1, "operating", "Operating"),
    DISMISSED(2, "dismissed", "Dismissed");

    private Integer value;
    private String dpStatus1;
    private String dpStatus2;

    private DpStatus(Integer value, String dpStatus1, String dpStatus2){
        this.value = value;
        this.dpStatus1 = dpStatus1;
        this.dpStatus2 = dpStatus2;
    }
}
