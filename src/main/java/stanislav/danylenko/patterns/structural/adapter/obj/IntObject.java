package stanislav.danylenko.patterns.structural.adapter.obj;

public class IntObject { // 3d party

    private final Integer value;

    public IntObject(Integer value) {
        this.value = value;
    }

    public Integer getIntValue() {
        return value;
    }
}
