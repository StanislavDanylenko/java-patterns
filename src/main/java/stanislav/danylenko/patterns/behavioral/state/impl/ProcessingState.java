package stanislav.danylenko.patterns.behavioral.state.impl;

import java.io.File;

import stanislav.danylenko.patterns.behavioral.state.State;
import stanislav.danylenko.patterns.behavioral.state.StateContext;

public class ProcessingState implements State {
    @Override
    public String handel(StateContext context) {
        File inputFile = context.getInputFile();
        // input file processing
        context.setOutputFile(inputFile);
        context.setState(new CompleteState());
        return "Processed";
    }
}
