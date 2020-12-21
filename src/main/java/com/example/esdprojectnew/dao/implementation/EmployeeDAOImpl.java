package com.example.esdprojectnew.dao.implementation;

import com.example.esdprojectnew.bean.Employee;
import com.example.esdprojectnew.dao.EmployeeDAO;
import com.example.esdprojectnew.utils.SessionUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public boolean verifyEmail(Employee emp) {
        Session session = SessionUtil.getSession();
        try {
            if (emp.getDepartment().equals("Outreach")) {
                Query query = session.createQuery("from Employee where email=:email and department=: dept ");
                query.setParameter("email", emp.getEmail());
                query.setParameter("dept", emp.getDepartment());
                if (query.getResultList().size() == 1) {
                    return true;
                }
            } else
                return false;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean addEmployee(Employee emp) {

        Session session = SessionUtil.getSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.save(emp);
            transaction.commit();
            System.out.println("Added Employee to DB successfully");
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            System.err.println("Unable to add employee to DB");
            return false;
        } finally {
            session.close();
        }
    }
}
