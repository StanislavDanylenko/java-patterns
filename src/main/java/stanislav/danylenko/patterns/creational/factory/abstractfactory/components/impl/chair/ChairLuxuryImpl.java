package stanislav.danylenko.patterns.creational.factory.abstractfactory.components.impl.chair;

import stanislav.danylenko.patterns.creational.factory.abstractfactory.components.Chair;

public class ChairLuxuryImpl implements Chair {

    private final String type;

    public ChairLuxuryImpl(String type) {
        this.type = type;
    }

    @Override
    public String sitOn() {
        return "Chair impl - " + type;
    }

}
