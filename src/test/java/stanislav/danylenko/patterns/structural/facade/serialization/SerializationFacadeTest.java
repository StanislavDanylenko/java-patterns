package stanislav.danylenko.patterns.structural.facade.serialization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.structural.facade.serialization.components.JsonDeserializer;
import stanislav.danylenko.patterns.structural.facade.serialization.components.ToXmlSerializer;

class SerializationFacadeTest {

    private final SerializationFacade facade = new SerializationFacade(
            new JsonDeserializer(),
            new ToXmlSerializer()
    );

    @Test
    void fromJsonInt() {
        Integer expected = 1;

        Integer result = facade.fromJson("1", Integer.class);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void fromJsonDouble() {
        Double expected = 1.0;

        Double result = facade.fromJson("1.0", Double.class);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void fromJsonLong() {
        Long expected = 1L;

        Long result = facade.fromJson("1", Long.class);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void fromJsonException() {
        assertThatThrownBy(() -> facade.fromJson("1", Boolean.class))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void fromXmlInt() {
        Integer expected = 1;

        Integer result = facade.fromXml("1", Integer.class);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void fromXmlDouble() {
        Double expected = 1.0;

        Double result = facade.fromXml("1.0", Double.class);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void fromXmlLong() {
        Long expected = 1L;

        Long result = facade.fromXml("1", Long.class);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void fromXmlException() {
        assertThatThrownBy(() -> facade.fromXml("1", Boolean.class))
                .isInstanceOf(RuntimeException.class);
    }
}