package com.example.esdprojectnew.service;

import com.example.esdprojectnew.bean.Student;
import com.example.esdprojectnew.dao.StudentDAO;
import com.example.esdprojectnew.dao.implementation.StudentDAOImpl;

public class StudentService {

    StudentDAO studentDAO = new StudentDAOImpl();
    public void addStudent(Student s)
    {
        studentDAO.addStudent(s);
    }
}
