package nl.kristalsoftware.jeetest.content;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by sjoerdadema on 29/12/16.
 */
@TypeQualifier("Image")
public class ImageContentService implements ContentService {

    @Override
    public JsonObject getContent() {
        return Json.createObjectBuilder()
                .add("type", "Image")
                .add("title", "Hello Image")
                .build();
    }
}
