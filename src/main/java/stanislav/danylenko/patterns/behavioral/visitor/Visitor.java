package stanislav.danylenko.patterns.behavioral.visitor;

import stanislav.danylenko.patterns.behavioral.visitor.impl.IntLengthInfo;
import stanislav.danylenko.patterns.behavioral.visitor.impl.StringLengthInfo;

public interface Visitor {

    void visit (IntLengthInfo intByteInfo);
    void visit (StringLengthInfo intByteInfo);

}
