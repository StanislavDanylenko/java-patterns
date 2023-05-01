package stanislav.danylenko.patterns.behavioral.visitor.impl;

import lombok.Getter;
import lombok.Setter;
import stanislav.danylenko.patterns.behavioral.visitor.LengthInfo;
import stanislav.danylenko.patterns.behavioral.visitor.Visitor;

@Getter
@Setter
public class StringLengthInfo implements LengthInfo {

    private final String value;

    public StringLengthInfo(String value) {
        this.value = value;
    }

    @Override
    public int getLength() {
        return value.length();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
