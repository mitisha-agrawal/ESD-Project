package com.example.esdprojectnew.utils;

import com.example.esdprojectnew.bean.*;
import com.example.esdprojectnew.service.*;


public class DatabaseSetup {
    public void add() {
        EmployeeService empService = new EmployeeService();

        Employee emp = new Employee(1, "mitisha", "agrawal", "mitisha@iiitb.org", "Outreach");
        empService.addEmployee(emp);
        Employee emp1 = new Employee(2, "john", "matrin", "jmartin@iiitb.org", "Outreach");
        empService.addEmployee(emp1);
        Employee emp2 = new Employee(3, "abc", "", "abc@iiitb.org", "Accounts");
        empService.addEmployee(emp2);

        Employee emp3 = new Employee(4, "it", "services", "itservices@iiitb.org", "IT Services");
        empService.addEmployee(emp3);
    }
    public void addPlac()
    {
        PlacementService placementService = new PlacementService();

        Placement p1 = new Placement(1, "Microsoft", "SDE", "software development engineer", 10, 2.8 );
        placementService.addPlacement(p1);
        Placement p2 = new Placement(2, "Microsoft", "CSA", "Computer System Analyst", 5, 3.2 );
        placementService.addPlacement(p2);
        Placement p3 = new Placement(3, "Flipkart", "se", "software engineer", 8, null );
        placementService.addPlacement(p3);
        Placement p4 = new Placement(4, "Google", "RS", "Research Scientist", 2,  3.2);
        placementService.addPlacement(p4);
        Placement p5 = new Placement(5, "Google", "CE", "Cloud Engineer", 10, null );
        placementService.addPlacement(p5);
        Placement p6 = new Placement(6, "Amazon", "DQE", "Data Quality Engineer", 10, 2.8 );
        placementService.addPlacement(p6);
    }
}