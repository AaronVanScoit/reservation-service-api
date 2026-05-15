package org.binarybrains;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/AvailableVehicles")
public class SearchAvailableVehicles {

    @GET
    public String sav() {
        return "Chinga a tu madre pelon";
    }
}
