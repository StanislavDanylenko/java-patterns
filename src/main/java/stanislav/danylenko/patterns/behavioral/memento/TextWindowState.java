package stanislav.danylenko.patterns.behavioral.memento;

import lombok.Getter;

@Getter
public class TextWindowState { // Memento

    private final String text;

    public TextWindowState(String text) {
        this.text = text;
    }

}
