package stanislav.danylenko.patterns.behavioral.memento;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MementoTest {

    @Test
    void testMemento() {
        TextEditor textEditor = new TextEditor(new TextWindow());

        String print = textEditor.print();
        assertThat(print).isEmpty();

        textEditor.write("Hello");
        textEditor.save();
        print = textEditor.print();
        assertThat(print).isEqualTo("Hello");

        textEditor.write(" World");
        print = textEditor.print();
        assertThat(print).isEqualTo("Hello World");

        textEditor.undo();
        print = textEditor.print();
        assertThat(print).isEqualTo("Hello");

        textEditor.undo();
        print = textEditor.print();
        assertThat(print).isEqualTo("Hello");
    }
}