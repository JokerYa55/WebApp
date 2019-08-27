/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import beans.AppConst;
import beans.SessionData;
import ejb.testEjb;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.jboss.logging.Logger;

/**
 *
 * @author vasil
 */
@Stateless
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class RestResourses {

    private static final Logger LOG = Logger.getLogger(RestResourses.class);

    @Context
    private Request request;
    @Context
    private UriInfo uriInfo;
    @Context
    private HttpHeaders requestHeaders;
    @Context
    private HttpServletRequest req;
    @Context
    private Response response;
    @Context
    HttpServletRequest servletRequest;
    @Inject
    private AppConst appConst;
    @Inject
    private SessionData session;

    @EJB
    testEjb ejb1;

    public RestResourses() {
    }

    @Path("/test")
    @GET
    public Response test() {
        return Response.status(Response.Status.OK).entity(appConst.getId()).build();
    }

    @Path("/say")
    @GET
    public Response say() {
        return Response.status(Response.Status.OK).entity(ejb1.say()).build();
    }

    @Path("/auth")
    @GET
    public Response auth() {
        session.setSesionId(req.getSession().getId());
        appConst.getSessionList().put(req.getSession().getId(), session);
        appConst.getSessionList().forEach((t, u) -> {
            LOG.info(String.format("t = %s u = %s", t, u));
        });
        return Response.status(Response.Status.OK).entity(appConst.getSessionList()).build();
    }

}
