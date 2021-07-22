package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner(System.in);


    public static HashMap<String, Employee> emp_register= new HashMap<>();
    public static HashMap<String, ArrayList<String> > team_register= new HashMap<>();


    public static void addEmployeeToTeam(String team, String emp_id){
        ArrayList emp_list=team_register.get(team);
        if(emp_list == null) {
            emp_list = new ArrayList<String>();
        }
        emp_list.add(emp_id);
        team_register.put(team,emp_list);
        return;

    }
    public static void addEmployeeToRegister(String id, Employee emp){ emp_register.put(id,emp); return; }
    public  static Employee getEmployeeById(String id){
        return emp_register.get(id);
    }

    public static String getEmployeeName(String id) {
        return getEmployeeById(id).name;
    }
    public static String getEmployeePosition(String id) {
        return getEmployeeById(id).position;
    }
    public static int getEmployeeBand(String id){
        return getEmployeeById(id).band;
    }
    public  static String[] getEmployeeTeam(String id){
        return getEmployeeById(id).team;
    }
    public static String getEmployeeSupervisorID(String id){
        return getEmployeeById(id).supervisor_id;
    }
    public static String getEmployeeSupervisorName(String id){
        return getEmployeeName(getEmployeeSupervisorID(id));
    }
    public static boolean isSuperior(String id1, String id2){ return getEmployeeById(id1).band> getEmployeeById(id2).band;}

//    public static Engineer createEngineer(){
//        Engineer eng=new Engineer();
//        System.out.print("Enter Name: "); eng.name=sc.nextLine();
//        System.out.print("Enter Position: "); eng.position=sc.nextLine();
//        System.out.print("Enter Emp ID: "); eng.emp_id=sc.nextLine();
//        System.out.print("Enter Team: "); eng.team=sc.nextLine().split(" ");
//        System.out.print("Enter Supervisior ID: "); eng.supervisor_id=sc.nextLine();
//        System.out.print("Enter Band: "); eng.band=sc.nextInt();
//        addEmployeeToRegister(eng.emp_id,eng);
//        for(int i=0;i<eng.team.length;i++){
//            addEmployeeToTeam(eng.team[i],eng.emp_id);
//        }
//        return eng;
//    }
    public static void assignEmployeeToTeam(String team, String emp_id){
        ArrayList emp_list=team_register.get(team);
        if(emp_list == null) {
            emp_list = new ArrayList<String>();
        }
        emp_list.add(emp_id);
        team_register.put(team,emp_list);
        System.out.println("Employee with id: "+emp_id+" assigned wth team : "+team);
        return;
    }
    public static void assignTeamToEmployee(String emp_id, String team){
        int len=emp_register.get(emp_id).team.length;
        emp_register.get(emp_id).team[len+1]=emp_id;
    }
    public static void deAssignEmployeeFromTeam(String team, String emp_id) {
        team_register.get(team).remove(emp_id);
    }
    public static void deAssignTeamFromEmployee(String emp_id, String team_name) {
       String [] old= emp_register.get(emp_id).team;
       String[] updated = new String[old.length-1];
       for(int i=0,j=0;i<old.length;i++){
           if(old[i]==team_name) continue;
           updated[j++]=old[i];
       }

    }



    public static void populateEMS(){
        ///creating 8 Engineer

        Engineer eng1=new Engineer("Shailendra","SE1",new String[]{"Sputnik"},"E1000","M2000",1);
        Engineer eng2=new Engineer("Sapta","SE2", new String[]{"Sputnik"},"E1001","M2000",2);
        Engineer eng3=new Engineer("saurabh","SE3",new String[]{"Sputnik"},"E1002","M2000",3);
        Engineer eng4=new Engineer("Akansha","LSE",new String[]{"Sputnik"},"E1003","M2000",4);
        Engineer eng5=new Engineer("TBD","PSE",new String[]{"Sputnik"},"E1004","M2000",5);
        Engineer eng6=new Engineer("Ritik","SE1",new String[]{"Kraken"},"E1005","M2000",1);
        Engineer eng7=new Engineer("Lakshya","SE1",new String[]{"Poisedon"},"E1006","M2000",1);
        Engineer eng8=new Engineer("Ravi","SE1",new String[]{"AbraKaDabra"},"E1007","M2001",1);

        /// create 2 manager

        Manager m1=new Manager("Aman","Manager",new String[]{"Sputnik" ,"Kraken","Poisedon"},"M2000","SM3001",6,
                new String[]{"E1000","E1001","E1003","E1004","E1005","E1006"} );
        Manager m2=new Manager("Aman2","Manager",new String[]{"AbraKadabra"},"M2001","SM3001",6,
                new String[]{"E1007"} );

        ///create 1 SM
        SeniorManager sm1=new SeniorManager("Puneet","Senior Manager",new String[]{"Sputnik","Kraken","Poisedon","AbraKadabra"},"SM3001","CTO001",7,
                new String[]{"M2000","M2001"} );

        ///create 1 CTO
        Cto cto1=new Cto("Reggie","CTO",new String[]{"Sputnik" ,"Kraken","Poisedon","AbraKadabra"},"CTO001","AAAAA",8,
                new String[]{"SM3001"} );


    }


















}
