package stanislav.danylenko.patterns.behavior.command.impl;

import stanislav.danylenko.patterns.behavior.command.TextObject;

public class TextObjectImpl implements TextObject {

    private final String text;

    public TextObjectImpl(String text) {
        this.text = text;
    }

    @Override
    public String replace(String replaceFrom, String replaceTo) {
        return text.replace(replaceFrom, replaceTo);
    }

    @Override
    public String clean(String cleanText) {
        return text.replace(cleanText, "");
    }
}
