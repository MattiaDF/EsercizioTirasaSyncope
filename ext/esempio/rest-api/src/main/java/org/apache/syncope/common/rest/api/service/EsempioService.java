package org.apache.syncope.common.rest.api.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("json/esempio")
public interface EsempioService extends JAXRSService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    JsonObject jsonEsempio();
}