package stanislav.danylenko.patterns.behavioral.command;

public class TextCommandExecutor {

    public String executeTextCommand(TextCommand textCommand) {
        return textCommand.execute();
    }

}
