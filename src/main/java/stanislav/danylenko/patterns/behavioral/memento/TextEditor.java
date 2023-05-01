package stanislav.danylenko.patterns.behavioral.memento;

public class TextEditor { // Caretaker

    private final TextWindow textWindow;
    private TextWindowState savedTextWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public String print() {
        return textWindow.getCurrentText();
    }

    public void save() {
        savedTextWindow = textWindow.save();
    }

    public void undo() {
        textWindow.restore(savedTextWindow);
    }

}
