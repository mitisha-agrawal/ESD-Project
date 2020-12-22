package com.example.esdprojectnew.service;

import com.example.esdprojectnew.bean.Placement_Filter;
import com.example.esdprojectnew.dao.PlacementFilterDAO;
import com.example.esdprojectnew.dao.implementation.PlacementFilterDAOImpl;

public class PlacementFilterService{

    PlacementFilterDAO pfDAO = new PlacementFilterDAOImpl();
    public void addPlacementFilterEntry(Placement_Filter pf)
    {
        pfDAO.addPlacementFilterEntry(pf);
    }
}
