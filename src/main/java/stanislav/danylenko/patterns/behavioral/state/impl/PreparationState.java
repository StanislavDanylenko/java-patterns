package stanislav.danylenko.patterns.behavioral.state.impl;

import java.io.File;

import stanislav.danylenko.patterns.behavioral.state.State;
import stanislav.danylenko.patterns.behavioral.state.StateContext;

public class PreparationState implements State {
    @Override
    public String handel(StateContext context) {
        // download file
        File inputFile = new File(context.getFileUrl());
        context.setInputFile(inputFile);
        context.setState(new ProcessingState());
        return "Prepared";
    }
}
