package org.apache.syncope.common.rest.api.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.syncope.model.JsonObject;

/**
 * <p>Operazione REST di Esempio</p>
 */
@Path("json/esempio")
public interface EsempioService extends JAXRSService {

    /**
     * <p>Restituisce un oggetto JSON contenente i miei dati anagrafici</p>
     * @return JsonObject
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    JsonObject jsonEsempio();
}