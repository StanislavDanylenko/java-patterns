package stanislav.danylenko.patterns.creational.factory.factorymethod.factory.impl;

import stanislav.danylenko.patterns.creational.factory.factorymethod.components.SimpleButton;
import stanislav.danylenko.patterns.creational.factory.factorymethod.components.impl.SimpleButtonWindowsImpl;
import stanislav.danylenko.patterns.creational.factory.factorymethod.factory.SimpleButtonFactory;

public class SimpleButtonFactoryLinuxImpl implements SimpleButtonFactory {

    @Override
    public SimpleButton createButton() {
        return new SimpleButtonWindowsImpl("Linux");
    }
}
