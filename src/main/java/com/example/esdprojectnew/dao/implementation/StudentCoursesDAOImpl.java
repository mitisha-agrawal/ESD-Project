package com.example.esdprojectnew.dao.implementation;

import com.example.esdprojectnew.bean.Student;
import com.example.esdprojectnew.bean.Student_Courses;
import com.example.esdprojectnew.dao.StudentCoursesDAO;
import com.example.esdprojectnew.dao.StudentDAO;
import com.example.esdprojectnew.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentCoursesDAOImpl implements StudentCoursesDAO {
    @Override
    public void addStudentCourses(Student_Courses sc)
    {
        Session session = SessionUtil.getSession();
        try
        {
            Transaction transaction = session.beginTransaction();
            session.save(sc);
            transaction.commit();
            System.out.println("Adding Student courses to DB");
            // return true;
        }
        catch (HibernateException exception)
        {
            System.out.print(exception.getLocalizedMessage());

            // return false;
        }
        finally
        {
            session.close();
        }
    }
}