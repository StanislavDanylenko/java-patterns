package stanislav.danylenko.patterns.creational.prototype;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseShape {

    private int x;
    private int y;
    private String color;

    public BaseShape() {
    }

    public BaseShape(BaseShape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract BaseShape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof BaseShape shape)) return false;
        return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}
