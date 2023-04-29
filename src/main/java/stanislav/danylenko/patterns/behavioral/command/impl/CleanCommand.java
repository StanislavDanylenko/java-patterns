package stanislav.danylenko.patterns.behavioral.command.impl;

import stanislav.danylenko.patterns.behavioral.command.TextCommand;
import stanislav.danylenko.patterns.behavioral.command.TextObject;

public class CleanCommand implements TextCommand {

    private final TextObject text;
    private final String clean;

    public CleanCommand(TextObject text, String clean) {
        this.text = text;
        this.clean = clean;
    }

    @Override
    public String execute() {
        return text.clean(clean);
    }
}
