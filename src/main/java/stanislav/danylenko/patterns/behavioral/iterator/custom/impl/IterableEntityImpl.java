package stanislav.danylenko.patterns.behavioral.iterator.custom.impl;

import java.util.ArrayList;
import java.util.List;

import stanislav.danylenko.patterns.behavioral.iterator.custom.CustomEntity;
import stanislav.danylenko.patterns.behavioral.iterator.custom.CustomIterator;

public class IterableEntityImpl implements CustomEntity {

    private final List<String> values = new ArrayList<>();

    @Override
    public void addValue(String value) {
        values.add(value);
    }

    @Override
    public void removeValue(String value) {
        values.remove(value);
    }

    @Override
    public CustomIterator createIterator() {
        return new IterableEntityImplIterator(this);
    }

    public List<String> getValues() {
        return new ArrayList<>(values);
    }
}
