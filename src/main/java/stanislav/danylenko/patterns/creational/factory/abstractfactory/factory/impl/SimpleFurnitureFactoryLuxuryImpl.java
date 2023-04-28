package stanislav.danylenko.patterns.creational.factory.abstractfactory.factory.impl;

import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Chair;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Table;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.impl.chair.ChairLuxuryImpl;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.impl.table.TableLuxuryImpl;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.factory.SimpleFurnitureFactory;

public class SimpleFurnitureFactoryLuxuryImpl implements SimpleFurnitureFactory {

    @Override
    public Table createTable() {
        return new TableLuxuryImpl("Luxury");
    }

    @Override
    public Chair createChair() {
        return new ChairLuxuryImpl("Luxury");
    }

}
