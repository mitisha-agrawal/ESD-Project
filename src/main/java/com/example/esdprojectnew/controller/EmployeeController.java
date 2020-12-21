package com.example.esdprojectnew.controller;

import com.example.esdprojectnew.bean.Employee;
import com.example.esdprojectnew.service.EmployeeService;
import com.example.esdprojectnew.utils.DatabaseSetup;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;


@Path("employee")           //This is just a path for which will get appended in URI
public class EmployeeController
{

    EmployeeService employeeService = new EmployeeService();



    @GET
    @Path("/get")                   //This means  /<uri>/employee/get this is how it will work
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDepartments()
    {
        List<String> departments = new ArrayList<>();
        departments.add("IT Services");
        departments.add("Accounts");
        departments.add("Admission");
        departments.add("Grievance");
        departments.add("Outreach");
        departments.add("Library");
        departments.add("Faculty");
        return Response.ok().entity(departments).build();
    }

    @POST
    @Path("/addEmp")
    public Response addEmployee() throws URISyntaxException{
        //employeeService.addEmployee();
        DatabaseSetup addingData = new DatabaseSetup();
        addingData.add();
        System.out.println("Sending response code OK to frontend");
        return Response.ok().build();
    }



    @POST
    @Path("/login")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response loginEmployee(Employee emp) throws URISyntaxException
    {
        if(employeeService.verifyEmail(emp))
        {
            return Response.ok().build();
        }
        else
        {
            return Response.status(401).build();            //return unauthorized code if fail to login
        }
    }

}
