package nl.kristalsoftware.jeetest.content.card;

import nl.kristalsoftware.jeetest.content.TypeQualifier;

import java.lang.annotation.Annotation;

/**
 * Created by sjoerdadema on 29/12/16.
 */
public class CardTypeSelector implements TypeQualifier {

    @Override
    public String value() {
        return "Card";
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return TypeQualifier.class;
    }

}
