package stanislav.danylenko.patterns.structural.bridge.shape;

import lombok.Getter;
import stanislav.danylenko.patterns.structural.bridge.color.Color;

@Getter
public abstract class AbstractShape {

    private final int x;
    private final int y;
    private final Color color;

    protected AbstractShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract String fillColor();

}
