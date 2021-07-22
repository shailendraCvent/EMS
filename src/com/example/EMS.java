package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class EMS {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utils.populateEMS();


        ArrayList<String> emp_list_sptk= Utils.team_register.get("Sputnik");
        System.out.println("Employees in Sputnik are: "+emp_list_sptk);
        ArrayList<String> emp_list_poi= Utils.team_register.get("Poisedon");
        System.out.println("Employees in Poisedon are: "+emp_list_poi);
        ArrayList<String> emp_list_abk= Utils.team_register.get("AbraKadabra");
        System.out.println("Employees in AbraKadabra are: "+emp_list_abk);

        String input;
        Employee User=new Employee();
        System.out.println();
        System.out.println("-----------Welcome to EMS----------\n");
        System.out.print("Enter your ID: ");
        User=Utils.getEmployeeById(sc.nextLine());
        System.out.println("Welcome "+User.name+" ...");
        do{

            if(User==null) {
                System.out.println("Invalid ID.. Try again...");
            }

            if(User.band>=8) AccessibleMethod.AccessibleMethodByCTO();
            else if(User.band>=7) AccessibleMethod.AccessibleMethodBySeniorManager();
            else if(User.band>=6) AccessibleMethod.AccessibleMethodByManager();
            else AccessibleMethod.AccessibleMethodByEngineer();
            input=sc.nextLine();
            if(input.equals("EXIT")) return;
            if(input.equals("LOGOUT")){
                System.out.println("Logged Out...");
                System.out.println("Enter Your ID to Login Again");
                System.out.println("Type EXIT to exit");
                input=sc.nextLine();
                if(input.equals("EXIT")) return;
                else {
                    User=Utils.getEmployeeById(input);
                    System.out.println("Welcome "+User.name+" ...");
                    continue;
                }
            }
            if( Integer.parseInt(input)==1) System.out.println(Utils.getEmployeeSupervisorName(User.emp_id)) ;
            else if( Integer.parseInt(input)==2) System.out.println(Utils.getEmployeeBand(User.emp_id));
            else if( Integer.parseInt(input)==3) User.printCompleteInfo();
            else System.out.println("Hang On... Working on it...");

        }while(!input.equals("EXIT"));





    }
}
