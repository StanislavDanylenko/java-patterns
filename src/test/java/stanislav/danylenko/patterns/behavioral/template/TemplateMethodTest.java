package stanislav.danylenko.patterns.behavioral.template;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.behavioral.template.impl.EmailFormatter;
import stanislav.danylenko.patterns.behavioral.template.impl.SlackMessageFormatter;

class TemplateMethodTest {

    private static final String MESSAGE = "We must finish our work at Monday";

    @Test
    void emailFormatterTest() {
        EmailFormatter emailFormatter = new EmailFormatter();

        String format = emailFormatter.format(MESSAGE);

        assertThat(format)
                .isEqualTo("Hello, team. I have some useful information for you. "
                + MESSAGE
                + " Your teammate, Stanislav.");
    }

    @Test
    void slackMessageFormatterTest() {
        SlackMessageFormatter emailFormatter = new SlackMessageFormatter();

        String format = emailFormatter.format("We must finish our work at Monday");

        assertThat(format)
                .isEqualTo("Hi, guys.  " + MESSAGE +  " Thanks!.");
    }
}