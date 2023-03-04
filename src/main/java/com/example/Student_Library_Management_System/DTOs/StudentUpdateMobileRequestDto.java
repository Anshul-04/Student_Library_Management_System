package com.example.Student_Library_Management_System.DTOs;

public class StudentUpdateMobileRequestDto {

    private int id;
    private  String  mobileNumber;

    //DTOs depends on API being called...
    // You can add attributes as per your requirement.

    public StudentUpdateMobileRequestDto() {
    }

    public StudentUpdateMobileRequestDto(int id, String mobileNumber) {
        this.id = id;
        this.mobileNumber = mobileNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}

