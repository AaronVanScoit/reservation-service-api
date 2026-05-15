package org.binarybrains;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/AvailableVehicles")
public class SearchAvailableVehicles {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sav() {
        return "Chinga a tu madre pelon";
    }
}
