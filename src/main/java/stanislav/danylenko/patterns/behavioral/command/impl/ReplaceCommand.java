package stanislav.danylenko.patterns.behavioral.command.impl;

import stanislav.danylenko.patterns.behavioral.command.TextCommand;
import stanislav.danylenko.patterns.behavioral.command.TextObject;

public class ReplaceCommand implements TextCommand {

    private final TextObject text;
    private final String replaceFrom;
    private final String replaceTo;

    public ReplaceCommand(TextObject text, String replaceFrom, String replaceTo) {
        this.text = text;
        this.replaceFrom = replaceFrom;
        this.replaceTo = replaceTo;
    }

    @Override
    public String execute() {
        return text.replace(replaceFrom, replaceTo);
    }

}
