package com.techelevator;

public class Department {

    private int departmentId;
    private String name;

    public Department (int departmentId, String name){
        this.departmentId = departmentId;
        this.name = name;
    }

    public int getDepartmentId(){
        return departmentId;
    }
    public String getNam(){
        return name;
    }
}
