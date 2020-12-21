package com.example.esdprojectnew.service;

import com.example.esdprojectnew.bean.Employee;
import com.example.esdprojectnew.dao.EmployeeDAO;
import com.example.esdprojectnew.dao.implementation.EmployeeDAOImpl;

public class EmployeeService {
    EmployeeDAO empDAO = new EmployeeDAOImpl();

    public boolean verifyEmail(Employee emp){
        return empDAO.verifyEmail(emp);
    }
    public void addEmployee(Employee emp){
        empDAO.addEmployee(emp);
    }
}
