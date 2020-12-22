package com.example.esdprojectnew.service;

import com.example.esdprojectnew.bean.Student_Courses;
import com.example.esdprojectnew.dao.StudentCoursesDAO;
import com.example.esdprojectnew.dao.implementation.StudentCoursesDAOImpl;

public class StudentCoursesService {

    StudentCoursesDAO scDAO = new StudentCoursesDAOImpl();
    public void addStudentCourses(Student_Courses sc)
    {
        scDAO.addStudentCourses(sc);
    }
}
