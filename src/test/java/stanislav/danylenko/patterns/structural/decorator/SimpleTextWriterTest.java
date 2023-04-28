package stanislav.danylenko.patterns.structural.decorator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.structural.decorator.impl.SimpleTextWriter;
import stanislav.danylenko.patterns.structural.decorator.impl.dec.TagTextWriterDecorator;
import stanislav.danylenko.patterns.structural.decorator.impl.dec.UpperCaseTextWriterDecorator;

class SimpleTextWriterTest {

    @Test
    void writeWithoutDecorator() {
        String text = "Hello World";

        TextWriter textWriter = new SimpleTextWriter();
        String write = textWriter.write(text);

        assertThat(write).isEqualTo(text);
    }

    @Test
    void writeWithTagDecorator() {
        String text = "Hello World";
        String expectedText = "<p>Hello World</p>";

        TextWriter textWriter = new TagTextWriterDecorator(new SimpleTextWriter());
        String write = textWriter.write(text);

        assertThat(write).isEqualTo(expectedText);
    }

    @Test
    void writeWithUpperCaseDecorator() {
        String text = "Hello World";
        String expectedText = "HELLO WORLD";

        TextWriter textWriter = new UpperCaseTextWriterDecorator(new SimpleTextWriter());
        String write = textWriter.write(text);

        assertThat(write).isEqualTo(expectedText);
    }

    @Test
    void writeWithUpperCaseAndTagDecorator() {
        String text = "Hello World";
        String expectedText = "<p>HELLO WORLD</p>";

        TextWriter textWriter = new TagTextWriterDecorator(new UpperCaseTextWriterDecorator(new SimpleTextWriter()));
        String write = textWriter.write(text);

        assertThat(write).isEqualTo(expectedText);
    }

    @Test
    void writeWithTagAndUpperCaseDecorator() {
        String text = "Hello World";
        String expectedText = "<P>HELLO WORLD</P>";

        TextWriter textWriter = new UpperCaseTextWriterDecorator(new TagTextWriterDecorator(new SimpleTextWriter()));
        String write = textWriter.write(text);

        assertThat(write).isEqualTo(expectedText);
    }
}