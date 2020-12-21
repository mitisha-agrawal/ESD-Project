package com.example.esdprojectnew.dao;

import com.example.esdprojectnew.bean.Employee;

public interface EmployeeDAO {

    boolean verifyEmail(Employee emp);
    boolean addEmployee(Employee emp);
}
