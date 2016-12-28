package nl.kristalsoftware.jeetest.content;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by sjoerdadema on 28/12/16.
 */
public class ContentService {

    @Inject
    private ContentValidator validator;

    JsonObject getContent() {
        Card card = new Card();
        if (validator.validate(card.getTitle())) {
            return Json.createObjectBuilder()
                    .add("title", "Hello World")
                    .build();
        }
        return Json.createObjectBuilder()
                .add("error", "validation error")
                .build();
    }

}
