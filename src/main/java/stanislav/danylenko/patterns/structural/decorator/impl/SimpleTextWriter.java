package stanislav.danylenko.patterns.structural.decorator.impl;

import stanislav.danylenko.patterns.structural.decorator.TextWriter;

public class SimpleTextWriter implements TextWriter {
    @Override
    public String write(String text) {
        return text;
    }
}
