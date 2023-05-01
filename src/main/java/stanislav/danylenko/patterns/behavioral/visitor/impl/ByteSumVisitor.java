package stanislav.danylenko.patterns.behavioral.visitor.impl;

import lombok.Getter;
import lombok.Setter;
import stanislav.danylenko.patterns.behavioral.visitor.Visitor;

@Setter
@Getter
public class ByteSumVisitor implements Visitor {

    private int byteSum = 0;

    @Override
    public void visit(IntLengthInfo intByteInfo) {
        this.byteSum += intByteInfo.getLength();
    }

    @Override
    public void visit(StringLengthInfo intByteInfo) {
        this.byteSum += intByteInfo.getLength() * 2;
    }
}
