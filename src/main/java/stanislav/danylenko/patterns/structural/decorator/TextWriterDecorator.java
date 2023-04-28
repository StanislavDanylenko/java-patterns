package stanislav.danylenko.patterns.structural.decorator;

public abstract class TextWriterDecorator implements TextWriter {

    private final TextWriter textWriter;

    protected TextWriterDecorator(TextWriter textWriter) {
        this.textWriter = textWriter;
    }

    @Override
    public String write(String text) {
        return textWriter.write(text);
    }
}
