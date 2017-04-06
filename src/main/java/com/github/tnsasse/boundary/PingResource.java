package com.github.tnsasse.boundary;

import com.github.tnsasse.jaxrsmonitor.boundary.MonitoringConfiguration;

import java.time.Instant;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Sample resource for generating responses to monitor
 *
 * @author tnsasse
 */
@Stateless
@Path("/ping")
@Produces(MediaType.APPLICATION_JSON)
public class PingResource {

  @Inject
  MonitoringConfiguration configuration; // optional


  @GET
  public JsonObject getPing() {
    JsonObjectBuilder builder = Json.createObjectBuilder();
    builder.add("time", Instant.now().toString());
    builder.add("message", "Hello Duke!");
    return builder.build();
  }

  @GET
  @Path("/{message}")
  public JsonObject getPingWithMessage(@PathParam("message") String message) {
    JsonObjectBuilder builder = Json.createObjectBuilder();
    builder.add("time", Instant.now().toString());
    builder.add("message", message);
    return builder.build();
  }

  @POST
  public Response postPing(JsonObject payload) {
    return Response.noContent().build();
  }
}
