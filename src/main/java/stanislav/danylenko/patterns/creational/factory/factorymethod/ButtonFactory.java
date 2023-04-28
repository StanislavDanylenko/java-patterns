package stanislav.danylenko.patterns.creational.factory.factorymethod;

import stanislav.danylenko.patterns.creational.factory.factorymethod.components.SimpleButton;
import stanislav.danylenko.patterns.creational.factory.factorymethod.factory.SimpleButtonFactory;
import stanislav.danylenko.patterns.creational.factory.factorymethod.factory.impl.SimpleButtonFactoryLinuxImpl;
import stanislav.danylenko.patterns.creational.factory.factorymethod.factory.impl.SimpleButtonFactoryWindowsImpl;

public final class ButtonFactory {

    private static final String WINDOWS = "Windows";

    public static SimpleButtonFactory getFactory(String type) {
        if (WINDOWS.equals(type)) {
            return new SimpleButtonFactoryWindowsImpl();
        } else {
            return new SimpleButtonFactoryLinuxImpl();
        }
    }

    public static SimpleButton getButton(String type) {
        SimpleButtonFactory factory = getFactory(type);
        return factory.createButton();
    }

}
