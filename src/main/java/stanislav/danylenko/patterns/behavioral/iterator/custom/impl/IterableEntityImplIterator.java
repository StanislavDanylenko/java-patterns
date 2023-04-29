package stanislav.danylenko.patterns.behavioral.iterator.custom.impl;

import java.util.List;

import stanislav.danylenko.patterns.behavioral.iterator.custom.CustomIterator;

public class IterableEntityImplIterator implements CustomIterator {

    private int currentPosition;
    private final List<String> values;

    public IterableEntityImplIterator(IterableEntityImpl entity) {
        this.values = entity.getValues();
    }

    @Override
    public boolean hasMore() {
        return currentPosition < values.size();
    }

    @Override
    public String getNext() {
        return values.get(currentPosition++);
    }
}
