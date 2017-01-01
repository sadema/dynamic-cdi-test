package nl.kristalsoftware.jeetest.content.card;

import nl.kristalsoftware.jeetest.content.ContentService;
import nl.kristalsoftware.jeetest.content.TypeQualifier;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by sjoerdadema on 28/12/16.
 */
@TypeQualifier("Card")
public class CardContentService implements ContentService {

    public JsonObject getContent() {
        return Json.createObjectBuilder()
                .add("type", "Card")
                .add("title", "Hello Card")
                .build();
    }


}
