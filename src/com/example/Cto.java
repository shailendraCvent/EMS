package com.example;

public class Cto extends SeniorManager {
    void dissolveTeam(){
        System.out.println("Dissolving team");
    }
    Cto(){};
    Cto(String name, String position, String[] team, String emp_id, String supervisor_id, int band, String[] subordinates){
        super(name,position,team,emp_id,supervisor_id,band,subordinates);
    }

    @Override
    void printCompleteInfo() {
        System.out.println("############Calling CTO Class Method##################");
        System.out.println("Name: "+this.name);
        System.out.println("Position: "+this.position);
        System.out.println("############################################################");
    }
}
