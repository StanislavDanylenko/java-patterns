package stanislav.danylenko.patterns.structural.bridge.color.impl;

import stanislav.danylenko.patterns.structural.bridge.color.Color;

public class Blue implements Color {
    @Override
    public String fill() {
        return "#11beec";
    }
}
