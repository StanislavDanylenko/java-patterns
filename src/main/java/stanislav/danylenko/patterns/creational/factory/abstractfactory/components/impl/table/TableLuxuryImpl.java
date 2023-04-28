package stanislav.danylenko.patterns.creational.factory.abstractfactory.components.impl.table;

import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Table;

public class TableLuxuryImpl implements Table {

    private final String type;

    public TableLuxuryImpl(String type) {
        this.type = type;
    }

    @Override
    public String putOn() {
        return "Table impl - " + type;
    }

}
