package stanislav.danylenko.patterns.creational.factory.abstractfactory;

import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Chair;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Table;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.factory.SimpleFurnitureFactory;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.factory.impl.SimpleFurnitureFactoryLuxuryImpl;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.factory.impl.SimpleFurnitureFactoryPlainImpl;

public final class FurnitureFactory {

    private static final String PLAIN = "Plain";

    public static SimpleFurnitureFactory getFactory(String type) {
        if (PLAIN.equals(type)) {
            return new SimpleFurnitureFactoryPlainImpl();
        } else {
            return new SimpleFurnitureFactoryLuxuryImpl();
        }
    }

    public static Table getTable(String type) {
        SimpleFurnitureFactory factory = getFactory(type);
        return factory.createTable();
    }

    public static Chair getChair(String type) {
        SimpleFurnitureFactory factory = getFactory(type);
        return factory.createChair();
    }

}
