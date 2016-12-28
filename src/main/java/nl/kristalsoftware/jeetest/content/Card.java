package nl.kristalsoftware.jeetest.content;

/**
 * Created by sjoerdadema on 28/12/16.
 */
public class Card {

    private String title = "";
    private String description = "";

    public Card() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {

        return description;
    }
}
