package com.example.esdprojectnew.controller;

import com.example.esdprojectnew.service.StudentCoursesService;
import com.example.esdprojectnew.utils.DatabaseSetup;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("studentcourses")
public class StudentCoursesController {
    StudentCoursesService scService = new StudentCoursesService();

    @POST
    @Path("/addCourses")
    public Response addStudentCourses() throws URISyntaxException {
        DatabaseSetup addingData = new DatabaseSetup();
        addingData.addStudentCoursesTaken();
        System.out.println("Inside adding of student courses Controller");
        return Response.ok().build();
    }
}