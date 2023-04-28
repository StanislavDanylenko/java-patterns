package stanislav.danylenko.patterns.structural.adapter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.structural.adapter.impl.IntObjectAdapterClass;
import stanislav.danylenko.patterns.structural.adapter.impl.IntObjectAdapterObject;
import stanislav.danylenko.patterns.structural.adapter.obj.IntObject;
import stanislav.danylenko.patterns.structural.adapter.obj.StringObject;

class ProcessorTest {

    private final Processor processor = new Processor();

    @Test
    void processStringObject() {
        StringValueObject stringValueObject1 = new StringObject("Hello");
        StringValueObject stringValueObject2 = new StringObject("Hello World");

        boolean process1 = processor.process(stringValueObject1);
        boolean process2 = processor.process(stringValueObject2);

        assertThat(process1).isFalse();
        assertThat(process2).isTrue();
    }

    @Test
    void processIntObjectAdapterObject() {
        IntObject intObject1 = new IntObject(1);
        IntObject intObject2 = new IntObject(12345678);

        boolean process1 = processor.process(new IntObjectAdapterObject(intObject1));
        boolean process2 = processor.process(new IntObjectAdapterObject(intObject2));

        assertThat(process1).isFalse();
        assertThat(process2).isTrue();
    }

    @Test
    void processIntObjectAdapterClass() {
        IntObject intObject1 = new IntObject(1);
        IntObject intObject2 = new IntObject(12345678);

        boolean process1 = processor.process(new IntObjectAdapterClass(intObject1));
        boolean process2 = processor.process(new IntObjectAdapterClass(intObject2));

        assertThat(process1).isFalse();
        assertThat(process2).isTrue();
    }
}