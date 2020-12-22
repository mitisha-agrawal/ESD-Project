package com.example.esdprojectnew.controller;

import com.example.esdprojectnew.service.PlacementFilterService;
import com.example.esdprojectnew.utils.DatabaseSetup;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("placementfilter")
public class PlacementFilterController
{

    PlacementFilterService placementService = new PlacementFilterService();

    @POST
    @Path("/addFilter")
    public Response addPlacementFilter() throws URISyntaxException
    {
        DatabaseSetup addingData = new DatabaseSetup();
        addingData.addPlacementFilterData();
        System.out.println("Inside placement filter controller");
        return Response.ok().build();
    }


}
