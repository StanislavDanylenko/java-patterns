package stanislav.danylenko.patterns.behavior.command;

public class TextCommandExecutor {

    public String executeTextCommand(TextCommand textCommand) {
        return textCommand.execute();
    }

}
