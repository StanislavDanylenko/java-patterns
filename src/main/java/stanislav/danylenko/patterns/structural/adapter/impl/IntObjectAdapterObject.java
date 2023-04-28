package stanislav.danylenko.patterns.structural.adapter.impl;

import stanislav.danylenko.patterns.structural.adapter.StringValueObject;
import stanislav.danylenko.patterns.structural.adapter.obj.IntObject;

public class IntObjectAdapterObject implements StringValueObject {

    private final IntObject intObject;

    public IntObjectAdapterObject(IntObject intObject) {
        this.intObject = intObject;
    }

    @Override
    public String getStringValue() {
        return intObject.getIntValue().toString();
    }
}
