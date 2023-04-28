package stanislav.danylenko.patterns.structural.decorator.impl.dec;

import stanislav.danylenko.patterns.structural.decorator.TextWriter;
import stanislav.danylenko.patterns.structural.decorator.TextWriterDecorator;

public class TagTextWriterDecorator extends TextWriterDecorator {

    public TagTextWriterDecorator(TextWriter textWriter) {
        super(textWriter);
    }

    @Override
    public String write(String text) {
        return "<p>" + super.write(text) + "</p>";
    }
}
