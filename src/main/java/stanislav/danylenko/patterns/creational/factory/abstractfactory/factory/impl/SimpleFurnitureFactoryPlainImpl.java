package stanislav.danylenko.patterns.creational.factory.abstractfactory.factory.impl;

import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Chair;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Table;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.impl.chair.ChairPlainImpl;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.impl.table.TablePlainImpl;
import stanislav.danylenko.patterns.creational.factory.abstractfactory.factory.SimpleFurnitureFactory;

public class SimpleFurnitureFactoryPlainImpl implements SimpleFurnitureFactory {

    @Override
    public Table createTable() {
        return new TablePlainImpl("Plain");
    }

    @Override
    public Chair createChair() {
        return new ChairPlainImpl("Plain");
    }

}
