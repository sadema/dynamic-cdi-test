package nl.kristalsoftware.jeetest.content;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by sjoerdadema on 28/12/16.
 */
@TypeQualifier("Card")
public class CardContentService implements ContentService {

    @Inject
    private ContentValidator contentValidator;

    public JsonObject getContent() {
        Card card = new Card();
        card.setTitle("cardTitle");
        if (contentValidator.validate(card.getTitle())) {
            return Json.createObjectBuilder()
                    .add("type", "Card")
                    .add("title", "Hello World")
                    .build();
        }
        return Json.createObjectBuilder()
                .add("error", "validation error")
                .build();
    }

}
