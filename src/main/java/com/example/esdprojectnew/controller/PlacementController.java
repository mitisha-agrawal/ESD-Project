package com.example.esdprojectnew.controller;

import com.example.esdprojectnew.bean.Placement;
import com.example.esdprojectnew.service.PlacementService;
import com.example.esdprojectnew.utils.DatabaseSetup;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("placement")
public class PlacementController
{
    PlacementService placementService = new PlacementService();

    @POST
    @Path("/addPlac")
    public Response addPlacement() throws URISyntaxException{
        //employeeService.addEmployee();
        DatabaseSetup addingData = new DatabaseSetup();
        addingData.addPlac();
        System.out.println("Sending response code OK to frontend");
        return Response.ok().build();
    }

    @GET
    @Path("/displayorganizations")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrganizations() {
        List<Placement> orgs = placementService.getOrganizations();
        /*for( Placement i : orgs ) {
            System.out.println(i);
        }*/
        return Response.ok().entity(orgs).build();
    }
}
