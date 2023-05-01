package stanislav.danylenko.patterns.behavioral.template.impl;

import stanislav.danylenko.patterns.behavioral.template.AbstractFormatter;

public class EmailFormatter extends AbstractFormatter {
    @Override
    protected String getHeader() {
        return "Hello, team. I have some useful information for you. ";
    }

    @Override
    protected String getFooter() {
        return " Your teammate, Stanislav.";
    }
}
