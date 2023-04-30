package stanislav.danylenko.patterns.behavioral.state;

import java.io.File;

import lombok.Getter;
import lombok.Setter;
import stanislav.danylenko.patterns.behavioral.state.impl.PreparationState;

@Getter
@Setter
public class StateContext {

    private String fileUrl;
    private File inputFile;
    private File outputFile;

    private State state;

    public StateContext(String fileUrl) {
        this.fileUrl = fileUrl;
        this.state = new PreparationState();
    }

    public String handle() {
        return this.state.handel(this);
    }
}
