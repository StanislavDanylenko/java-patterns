package stanislav.danylenko.patterns.behavioral.template.impl;

import stanislav.danylenko.patterns.behavioral.template.AbstractFormatter;

public class SlackMessageFormatter extends AbstractFormatter {
    @Override
    protected String getHeader() {
        return "Hi, guys.  ";
    }

    @Override
    protected String getFooter() {
        return " Thanks!.";
    }
}
