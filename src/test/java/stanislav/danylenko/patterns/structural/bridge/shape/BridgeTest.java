package stanislav.danylenko.patterns.structural.bridge.shape;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.structural.bridge.color.Color;
import stanislav.danylenko.patterns.structural.bridge.color.impl.Blue;
import stanislav.danylenko.patterns.structural.bridge.color.impl.Yellow;
import stanislav.danylenko.patterns.structural.bridge.shape.impl.Pentagon;
import stanislav.danylenko.patterns.structural.bridge.shape.impl.Triangle;

class BridgeTest {

    private static final int X = 1;
    private static final int Y = 2;

    @Test
    void testBridge() {
        Color blue = new Blue();
        Color yellow = new Yellow();

        AbstractShape triangle = new Triangle(X, Y, blue);
        AbstractShape pentagon = new Pentagon(X, Y, yellow);

        String stringColor1 = triangle.fillColor();
        assertThat(stringColor1).isEqualTo("#11beec");

        String stringColor2 = pentagon.fillColor();
        assertThat(stringColor2).isEqualTo("#f5ef2f");
    }

}