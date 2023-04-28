package stanislav.danylenko.patterns.creational.factory.abstractfactory.factory;

import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Chair;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Table;

public interface SimpleFurnitureFactory {

    Table createTable();
    Chair createChair();

}
