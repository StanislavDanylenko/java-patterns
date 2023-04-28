package stanislav.danylenko.patterns.creational.factory.simple.components.impl;

import stanislav.danylenko.patterns.creational.factory.simple.components.SimpleRepository;

public class SimpleRepositoryJdbcImpl implements SimpleRepository {

    private final String type;

    public SimpleRepositoryJdbcImpl(String type) {
        this.type = type;
    }

    @Override
    public String load() {
        return "Type = " + type;
    }

}
