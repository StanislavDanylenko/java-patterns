package stanislav.danylenko.patterns.creational.factory.abstractfactory.components.impl.chair;

import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Chair;

public class ChairPlainImpl implements Chair {

    private final String type;

    public ChairPlainImpl(String type) {
        this.type = type;
    }

    @Override
    public String sitOn() {
        return "Chair impl - " + type;
    }

}
