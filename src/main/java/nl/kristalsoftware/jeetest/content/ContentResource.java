package nl.kristalsoftware.jeetest.content;

import nl.kristalsoftware.jeetest.content.card.CardTypeSelector;
import nl.kristalsoftware.jeetest.content.image.ImageTypeSelector;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by sjoerdadema on 28/12/16.
 */
@RequestScoped
@Path("content")
@Produces("application/json")
public class ContentResource {

    @Inject
    @Any
    private Instance<ContentService> contentServiceSelectors;

    @GET
    @Path("card")
    public JsonObject getCardContent() {
        ContentService contentService = contentServiceSelectors.select(new CardTypeSelector()).get();
        return contentService.getContent();
    }

    @GET
    @Path("image")
    public JsonObject getImageContent() {
        ContentService contentService = contentServiceSelectors.select(new ImageTypeSelector()).get();
        return contentService.getContent();
    }
}
