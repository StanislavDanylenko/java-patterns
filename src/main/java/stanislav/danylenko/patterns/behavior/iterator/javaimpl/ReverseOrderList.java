package stanislav.danylenko.patterns.behavior.iterator.javaimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseOrderList<T> implements Iterable<T> {

    private final List<T> list = new ArrayList<>();

    public ReverseOrderList() {
    }

    public void add(T data) {
        list.add(data);
    }

    public int size() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);
    }

    public void delete(int index) {
        list.remove(index);
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseOrderIterator<>(this);
    }

    @Override
    public String toString() {
        return "ReversedList={" + list.toString() + "}";
    }
}
