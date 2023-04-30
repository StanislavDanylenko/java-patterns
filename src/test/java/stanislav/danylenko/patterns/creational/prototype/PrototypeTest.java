package stanislav.danylenko.patterns.creational.prototype;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PrototypeTest {

    private static final int X = 1;
    private static final int Y = 2;
    private static final String COLOR = "Red";

    @Test
    void testCircleClone() {
        int radius = 5;

        Circle circle = new Circle();
        circle.setX(X);
        circle.setY(Y);
        circle.setRadius(radius);
        circle.setColor(COLOR);

        Circle clone = (Circle) circle.clone();
        assertThat(clone).isNotNull();
        assertThat(clone.getX()).isEqualTo(X);
        assertThat(clone.getY()).isEqualTo(Y);
        assertThat(clone.getColor()).isEqualTo(COLOR);
        assertThat(clone.getRadius()).isEqualTo(radius);
    }

    @Test
    void testRectangleClone() {
        int height = 5;
        int width = 10;

        Rectangle rectangle = new Rectangle();
        rectangle.setX(X);
        rectangle.setY(Y);
        rectangle.setColor(COLOR);
        rectangle.setHeight(height);
        rectangle.setWidth(width);

        Rectangle clone = (Rectangle) rectangle.clone();
        assertThat(clone).isNotNull();
        assertThat(clone.getX()).isEqualTo(X);
        assertThat(clone.getY()).isEqualTo(Y);
        assertThat(clone.getColor()).isEqualTo(COLOR);
        assertThat(clone.getHeight()).isEqualTo(height);
        assertThat(clone.getWidth()).isEqualTo(width);
    }

}