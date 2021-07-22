package com.example;

public class Engineer extends Employee {


    Engineer(){};
    Engineer(String name, String position, String[] team, String emp_id, String supervisor_id, int band){
        super(name,position,team,emp_id,supervisor_id,band);
    }

    @Override
    void printCompleteInfo() {
        System.out.println("############Calling Engineer Class Method##################");
        System.out.println("Name: "+this.name);
        System.out.println("Position: "+this.position);
        System.out.println("############################################################");
    }







}
