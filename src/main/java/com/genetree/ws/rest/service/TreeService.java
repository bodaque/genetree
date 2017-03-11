package com.genetree.ws.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.genetree.engine.parsers.JSONParser;
import com.genetree.ws.dao.ListOfMembersDefaultDAO;
import com.genetree.ws.tree.bussinesslogic.TreeOperations;
import com.genetree.ws.tree.bussinesslogic.TreeOperationsImpl;

import static javax.ws.rs.core.Response.Status.OK;

@Path("/tree")
public class TreeService {

    private static final String JSON = "application/json";
    private TreeOperations treeOperations = new TreeOperationsImpl(new ListOfMembersDefaultDAO().getDataForTree());

    @GET
    @Produces(JSON)
    @Path("/m{userNumber}")
    public Response showMyProfile(@PathParam("userNumber") String userNumber) {
        return Response.status(OK).entity(JSONParser.toJSON(treeOperations.showProfile(Integer.parseInt(userNumber))))
                .build();
    }

    @GET
    @Produces(JSON)
    @Path("/alltree")
    public Response showAllTree() {
        return Response.status(OK).entity(JSONParser.toJSON(treeOperations.getTree())).build();
    }
}