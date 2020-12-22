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
        Placement p3 = new Placement(3, "Flipkart", "se", "software engineer", 8, 2.8 );
        placementService.addPlacement(p3);
        Placement p4 = new Placement(4, "Google", "RS", "Research Scientist", 2,  3.2);
        placementService.addPlacement(p4);
        Placement p5 = new Placement(5, "Google", "CE", "Cloud Engineer", 10, 2.8 );
        placementService.addPlacement(p5);
        Placement p6 = new Placement(6, "Amazon", "DQE", "Data Quality Engineer", 10, 2.8 );
        placementService.addPlacement(p6);
    }
    public void addStudentData()
    {
        StudentService studentsService = new StudentService();

        Student s1 = new Student(1, "MT2020001", "Clark", "M", "c@iiitb.org", 2.8, 2020, "MTECH2018CSE", "AIML");
        studentsService.addStudent(s1);
        Student s2 = new Student(2, "MT2020002", "Bruce", "W", "b@iiitb.org", 3.2, 2020, "MTECH2018CSE", "TSCD");
        studentsService.addStudent(s2);
        Student s3 = new Student(3, "MT2020003", "Diana", "T", "d@iiitb.org", 3.6, 2020, "MTECH2018CSE", "NC");
        studentsService.addStudent(s3);
        Student s4 = new Student(4, "MT2020004", "Jon", "P", "J@iiitb.org", 2.9, 2020, "MTECH2018CSE", "AIML");
        studentsService.addStudent(s4);
        Student s5 = new Student(5, "MT2020005", "Barry", "R", "br@iiitb.org", 3.4, 2021, "MTECH2019CSE", "TSCD");
        studentsService.addStudent(s5);

        Student s6 = new Student(6, "MT2020006", "Jerry", "T", "Jerry@iiitb.org", 3.2, 2022, "MTECH2020CSE", "TSCD");
        studentsService.addStudent(s6);
    }
    public void addPlacementFilterData()
    {
        PlacementFilterService pfs = new PlacementFilterService();
        Placement p1 = new Placement(1, "Microsoft", "SDE", "software development engineer", 10, 2.8 );
        Placement_Filter pf = new Placement_Filter(1, p1,"TSCD","MT2020CSE");
        pfs.addPlacementFilterEntry(pf);

        Placement p2 = new Placement(2, "Microsoft", "CSA", "Computer System Analyst", 5, 3.2 );
        Placement_Filter pf1 = new Placement_Filter(2, p2,"AIML","MT2020CSE");
        pfs.addPlacementFilterEntry(pf);

        Placement p6 = new Placement(6, "Amazon", "DQE", "Data Quality Engineer", 10, 2.8 );
        Placement_Filter pf2 = new Placement_Filter(3, p6,"AIML","MT2020CSE");
        pfs.addPlacementFilterEntry(pf2);
    }

    public void addStudentCoursesTaken()
    {
        StudentCoursesService scs = new StudentCoursesService();

        Student s6 = new Student(6, "MT2020006", "Jerry", "T", "Jerry@iiitb.org", 3.2, 2022, "MTECH2020CSE", "TSCD");
        Student_Courses sc = new Student_Courses(1,s6,"Algorithms",3.2);
        scs.addStudentCourses(sc);

        Student s5 = new Student(5, "MT2020005", "Barry", "R", "br@iiitb.org", 3.4, 2021, "MTECH2019CSE", "TSCD");
        Student_Courses sc1 = new Student_Courses(2,s5,"ML",3.0);
        scs.addStudentCourses(sc1);
    }
}