package stanislav.danylenko.patterns.behavioral.visitor;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import stanislav.danylenko.patterns.behavioral.visitor.impl.ByteSumVisitor;
import stanislav.danylenko.patterns.behavioral.visitor.impl.IntLengthInfo;
import stanislav.danylenko.patterns.behavioral.visitor.impl.StringLengthInfo;

class VisitorTest {

    @Test
    void testVisitor() {
        List<LengthInfo> objects = new ArrayList<>();
        objects.add(new IntLengthInfo(5));
        objects.add(new StringLengthInfo("Hello World!"));

        ByteSumVisitor visitor = new ByteSumVisitor();
        for (LengthInfo object : objects) {
            object.accept(visitor);
        }

        int sum = visitor.getByteSum();
        assertThat(sum).isEqualTo(28);
    }
}