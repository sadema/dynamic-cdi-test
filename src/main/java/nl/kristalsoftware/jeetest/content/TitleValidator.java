package nl.kristalsoftware.jeetest.content;

/**
 * Created by sjoerdadema on 28/12/16.
 */
public class TitleValidator implements ContentValidator {

    @Override
    public boolean validate(String title) {
        return !title.isEmpty();
    }

}
