package com.example;

public class Employee {
    String name;
    String position;
    String emp_id;
    String supervisor_id;
    int band=0;
    int team_cnt=0;
    String []team;
    String []subordinates;


    Employee(String name, String position, String[] team, String emp_id, String supervisor_id, int band){
        this.name=name;
        this.position=position;
        this.team=team;
        this.emp_id=emp_id;
        this.supervisor_id=supervisor_id;
        this.band=band;

        Utils.addEmployeeToRegister(emp_id,this);
        System.out.println("Created an employee:");
        System.out.println("Name:"+name);
        System.out.println("ID:"+emp_id);
        System.out.println("Team:"+team);
        System.out.println("Position:"+position);
        System.out.println();

        for(int i=0;i<team.length;i++) Utils.assignEmployeeToTeam(team[i],emp_id);
    }

    Employee(){
        System.out.println("Calling Base Employee Constructor");
    }

    void printCompleteInfo() {
        System.out.println("Calling Base Class PrintInfo Method");
    }

}
