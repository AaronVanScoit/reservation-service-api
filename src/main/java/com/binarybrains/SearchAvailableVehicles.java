package com.binarybrains

import ...


@Path("/SearchAvailableVehicles")
public class SearchAV {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }
}