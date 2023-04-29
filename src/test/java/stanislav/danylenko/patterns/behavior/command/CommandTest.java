package stanislav.danylenko.patterns.behavior.command;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.behavior.command.impl.CleanCommand;
import stanislav.danylenko.patterns.behavior.command.impl.ReplaceCommand;
import stanislav.danylenko.patterns.behavior.command.impl.TextObjectImpl;

class CommandTest {

    private final TextCommandExecutor commandExecutor = new TextCommandExecutor();

    @Test
    void testCleanCommand() {
        TextObject textObject = new TextObjectImpl("Hello");
        String clean = "l";
        TextCommand command = new CleanCommand(textObject, clean);

        String result = commandExecutor.executeTextCommand(command);

        String expectedString = "Heo";
        assertThat(result).isEqualTo(expectedString);
    }

    @Test
    void testReplaceCommand() {
        TextObject textObject = new TextObjectImpl("Hello");
        String from = "l";
        String to = "b";
        TextCommand command = new ReplaceCommand(textObject, from, to);

        String result = commandExecutor.executeTextCommand(command);

        String expectedString = "Hebbo";
        assertThat(result).isEqualTo(expectedString);
    }

}