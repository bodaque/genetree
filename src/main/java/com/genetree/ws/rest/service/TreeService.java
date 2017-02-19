package com.genetree.ws.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.Status.OK;

public class TreeService {

    private static final String JSON = "application/json";

    @GET
    @Produces(JSON)
    @Path("/me")
    public Response showMyProfile() {
        return Response.status(OK).entity(new Object()).build();
    }
}