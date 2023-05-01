package stanislav.danylenko.patterns.behavioral.visitor.impl;

import lombok.Getter;
import lombok.Setter;
import stanislav.danylenko.patterns.behavioral.visitor.LengthInfo;
import stanislav.danylenko.patterns.behavioral.visitor.Visitor;

@Getter
@Setter
public class IntLengthInfo implements LengthInfo {

    private final int value;

    public IntLengthInfo(int value) {
        this.value = value;
    }

    @Override
    public int getLength() {
        return 4;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
