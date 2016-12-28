package nl.kristalsoftware.jeetest.content;

import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by sjoerdadema on 28/12/16.
 */
@Stateless
@Path("content")
public class ContentResource {

    @GET
    public JsonObject getContent() {
        return Json.createObjectBuilder()
                .add("title", "Hello World")
                .build();
    }
}
