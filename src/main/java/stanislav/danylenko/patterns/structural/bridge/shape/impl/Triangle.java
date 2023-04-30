package stanislav.danylenko.patterns.structural.bridge.shape.impl;

import stanislav.danylenko.patterns.structural.bridge.color.Color;
import stanislav.danylenko.patterns.structural.bridge.shape.AbstractShape;

public class Triangle extends AbstractShape {

    public Triangle(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public String fillColor() {
        return getColor().fill();
    }
}
