package stanislav.danylenko.patterns.creational.factory.factorymethod;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.creational.factory.factorymethod.components.SimpleButton;
import stanislav.danylenko.patterns.creational.factory.factorymethod.factory.SimpleButtonFactory;

class FactoryMethodTest {

    private static final String WINDOWS = "Windows";
    private static final String LINUX = "Linux";

    @Test
    void testLinuxButtonCreationByFactory() {
        SimpleButtonFactory factory = ButtonFactory.getFactory(WINDOWS);
        SimpleButton button = factory.createButton();
        String press = button.press();

        assertThat(press).isEqualTo("Button impl - " + WINDOWS);
    }

    @Test
    void testWindowsButtonCreationByFactory() {
        SimpleButtonFactory factory = ButtonFactory.getFactory(LINUX);
        SimpleButton button = factory.createButton();
        String press = button.press();

        assertThat(press).isEqualTo("Button impl - " + LINUX);
    }

    @Test
    void testLinuxButtonCreation() {
        SimpleButton button = ButtonFactory.getButton(WINDOWS);
        String press = button.press();

        assertThat(press).isEqualTo("Button impl - " + WINDOWS);
    }

    @Test
    void testWindowsButtonCreation() {
        SimpleButton button = ButtonFactory.getButton(LINUX);
        String press = button.press();

        assertThat(press).isEqualTo("Button impl - " + LINUX);
    }

}