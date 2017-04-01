/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.byte23.boundary;

import java.time.Instant;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author tnsasse
 */
@Stateless
@Path("/ping")
@Produces(MediaType.APPLICATION_JSON)
public class PingResource {
    
    @GET
    public JsonObject getPing() {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("time", Instant.now().toString());
        builder.add("message", "Hello Duke!");
        return builder.build();
    }
    
    @POST
    public Response postPing(JsonObject payload) {
        return Response.noContent().build();
    }
}
