package com.example;

public class SeniorManager extends Manager {
    void terminate( String emp_id){
        System.out.println("Terminating employee with emp_id"+ emp_id);
    }
    SeniorManager(){};

    SeniorManager(String name, String position, String[] team, String emp_id, String supervisor_id, int band, String[] subordinates){
        super(name,position,team,emp_id,supervisor_id,band,subordinates);
    }


    @Override
    void printCompleteInfo() {
        System.out.println("############Calling Senior Manager Class Method##################");
        System.out.println("Name: "+this.name);
        System.out.println("Position: "+this.position);
        System.out.println("############################################################");
    }

}
