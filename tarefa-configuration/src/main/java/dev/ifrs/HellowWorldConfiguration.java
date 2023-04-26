package dev.ifrs;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class HellowWorldConfiguration {

    @ConfigProperty(name = "ifrs.pw2",  defaultValue="" )
    String message;
  
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return message + " ";
    }
}