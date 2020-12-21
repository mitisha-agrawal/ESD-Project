package com.example.esdprojectnew.dao.implementation;



import com.example.esdprojectnew.bean.Placement;

import com.example.esdprojectnew.dao.PlacementDAO;
import com.example.esdprojectnew.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class PlacementDAOImpl implements PlacementDAO {
    @Override
    public boolean addPlacement(Placement pla) {

        Session session = SessionUtil.getSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.save(pla);
            transaction.commit();
            System.out.println("Added Placement to DB successfully");
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            System.err.println("Unable to add placement to DB");
            return false;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Placement> getOrganizations() {
        Session session = SessionUtil.getSession();
        List<Placement> orgs = new ArrayList<>();
        try {
            for (final Object placement : session.createQuery("from Placement ").list()) {
                orgs.add((Placement) placement);
            }
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
        }
        return orgs;
    }
}
