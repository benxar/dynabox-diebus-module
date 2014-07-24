package org.dynabox.diebus.rest;

import java.util.UUID;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * @author benja
 *
 */
@Path("/")
public class DiebusEndpoint {

    private static final Logger log = Logger.getLogger(DiebusEndpoint.class.getName());

    @PersistenceContext
    private EntityManager persistence;

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public Response test() {
        log.info("test OK");
        return Response.ok("success!!!").build();
    }
}
