package stanislav.danylenko.patterns.structural.proxy.components;

import java.util.ArrayList;
import java.util.List;

public final class Store {

    public Store() {}

    private final List<String> values = new ArrayList<>();

    public void add(String value) {
        values.add(value);
    }

    public void remove(String value) {
        values.remove(value);
    }

    public List<String> get() {
        return List.copyOf(values);
    }

}
