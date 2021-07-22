package com.example;

public class Manager extends Engineer {

    void putEmployeeInTeam(String emp_id, String team){
        Utils.assignEmployeeToTeam(team,emp_id);
        Utils.assignTeamToEmployee(emp_id,team);
    }
    void removeEmployeFromTeam(String emp_id, String team){
        Utils.deAssignEmployeeFromTeam(team,emp_id);
        Utils.deAssignTeamFromEmployee(emp_id,team);
    }

    Manager(){};

    Manager(String name, String position, String[] team, String emp_id, String supervisor_id, int band, String[] subordinates){

        super(name,position,team,emp_id,supervisor_id,band);
        this.subordinates=subordinates;
        System.out.println("Added subordinates to "+name);
        System.out.println("---------------XXXXX---------------\n");
    }


    @Override
    void printCompleteInfo() {
        System.out.println("############Calling Manager Class Method##################");
        System.out.println("Name: "+this.name);
        System.out.println("Position: "+this.position);
        System.out.println("############################################################");
    }

}
