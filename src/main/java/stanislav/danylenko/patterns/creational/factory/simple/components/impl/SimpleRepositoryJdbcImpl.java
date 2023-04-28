package stanislav.danylenko.patterns.creational.factory.simple.components.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.patterns.creational.factory.simple.components.SimpleRepository;

@Slf4j
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
