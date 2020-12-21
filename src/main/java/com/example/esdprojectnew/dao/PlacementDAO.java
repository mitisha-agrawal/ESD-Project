package com.example.esdprojectnew.dao;


import com.example.esdprojectnew.bean.Placement;

import java.util.List;

public interface PlacementDAO {

    boolean addPlacement(Placement pla);
    List<Placement> getOrganizations();
}
