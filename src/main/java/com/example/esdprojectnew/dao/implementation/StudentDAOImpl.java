package com.example.esdprojectnew.dao.implementation;

import com.example.esdprojectnew.bean.Student;
import com.example.esdprojectnew.dao.StudentDAO;
import com.example.esdprojectnew.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAOImpl  implements StudentDAO
{

    @Override
    public void addStudent(Student s)
    {
        Session session = SessionUtil.getSession();
        try
        {
            Transaction transaction = session.beginTransaction();
            session.save(s);
            transaction.commit();
            //System.out.println("Added Employee to DB successfully");
            //return true;
        }
        catch (HibernateException exception)
        {
            System.out.print(exception.getLocalizedMessage());
            //  System.err.println("Unable to add employee to DB");
            //return false;
        }
        finally
        {
            session.close();
        }
    }
}