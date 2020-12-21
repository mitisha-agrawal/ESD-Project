package com.example.esdprojectnew.service;

import com.example.esdprojectnew.bean.Placement;
import com.example.esdprojectnew.dao.PlacementDAO;
import com.example.esdprojectnew.dao.implementation.PlacementDAOImpl;

import java.util.List;

public class PlacementService {
    PlacementDAO placementDAO = new PlacementDAOImpl();

    /*public boolean verifyEmail(Employee emp){
        return empDAO.verifyEmail(emp);
    }*/
    public void addPlacement(Placement p){
        placementDAO.addPlacement(p);
    }

    public List<Placement> getOrganizations (){
        return placementDAO.getOrganizations();
    }

}
