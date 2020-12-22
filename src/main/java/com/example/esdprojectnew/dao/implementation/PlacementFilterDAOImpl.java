package com.example.esdprojectnew.dao.implementation;

import com.example.esdprojectnew.bean.Placement_Filter;
import com.example.esdprojectnew.dao.PlacementFilterDAO;
import com.example.esdprojectnew.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PlacementFilterDAOImpl  implements PlacementFilterDAO
{
    @Override
    public void addPlacementFilterEntry(Placement_Filter pf)
    {
        Session session = SessionUtil.getSession();
        try
        {
            Transaction transaction = session.beginTransaction();
            session.save(pf);
            transaction.commit();
            System.out.println("Added PlacementFilter to DB successfully");
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