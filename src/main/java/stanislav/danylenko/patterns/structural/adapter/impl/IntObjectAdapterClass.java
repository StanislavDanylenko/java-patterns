package stanislav.danylenko.patterns.structural.adapter.impl;

import stanislav.danylenko.patterns.structural.adapter.StringValueObject;
import stanislav.danylenko.patterns.structural.adapter.obj.IntObject;

public class IntObjectAdapterClass extends IntObject implements StringValueObject {

    public IntObjectAdapterClass(IntObject intObject) {
        super(intObject.getIntValue());
    }

    @Override
    public String getStringValue() {
        return getIntValue().toString();
    }

    @Override
    public Integer getIntValue() {
        return super.getIntValue();
    }
}
