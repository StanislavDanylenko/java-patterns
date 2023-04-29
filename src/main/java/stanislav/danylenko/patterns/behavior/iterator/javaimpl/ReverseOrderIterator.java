package stanislav.danylenko.patterns.behavior.iterator.javaimpl;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReverseOrderIterator<T> implements Iterator<T> {

    private final ReverseOrderList<T> list;
    private int currentIndex;
    private int lastReturnedIndex;
    private boolean nextCalled = false;
    private boolean wasDeleted = false;

    public ReverseOrderIterator(ReverseOrderList<T> list) {
        this.list = list;
        this.currentIndex = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        nextCalled = false;
        return currentIndex >= 0;
    }

    @Override
    public T next() {
        nextCalled = true;

        if (currentIndex < 0) {
            throw new NoSuchElementException("No more elements");
        }

        lastReturnedIndex = currentIndex;
        wasDeleted = false;
        return list.get(currentIndex--);
    }

    @Override
    public void remove() {
        if (!nextCalled) {
            throw new IllegalStateException("Can not delete, next() was not called yet");
        }
        if (wasDeleted) {
            throw new IllegalStateException("Already deleted");
        }

        list.delete(lastReturnedIndex);
        wasDeleted = true;
    }
}
