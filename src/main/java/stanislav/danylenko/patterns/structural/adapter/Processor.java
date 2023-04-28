package stanislav.danylenko.patterns.structural.adapter;

public class Processor {

    public boolean process(StringValueObject stringValueObject) {
        return stringValueObject.getStringValue().length() > 5;
    }

}
