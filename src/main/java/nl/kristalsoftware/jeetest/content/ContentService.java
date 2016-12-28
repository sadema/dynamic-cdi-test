package nl.kristalsoftware.jeetest.content;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by sjoerdadema on 28/12/16.
 */
public class ContentService {

    JsonObject getContent() {
        return Json.createObjectBuilder()
                .add("title", "Hello World")
                .build();
    }

}
