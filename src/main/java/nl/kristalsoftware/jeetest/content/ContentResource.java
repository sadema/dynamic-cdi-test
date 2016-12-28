package nl.kristalsoftware.jeetest.content;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by sjoerdadema on 28/12/16.
 */
@Stateless
@Path("content")
@Produces("application/json")
public class ContentResource {

    @Inject
    private ContentService contentService;

    @GET
    public JsonObject getContent() {
        return contentService.getContent();
    }
}
