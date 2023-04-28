package stanislav.danylenko.patterns.creational.factory.factorymethod.components.impl;

import stanislav.danylenko.patterns.creational.factory.factorymethod.components.SimpleButton;

public class SimpleButtonWindowsImpl implements SimpleButton {

    private final String type;

    public SimpleButtonWindowsImpl(String type) {
        this.type = type;
    }

    @Override
    public String press() {
        return "Button impl - " + type;
    }

}
