package stanislav.danylenko.patterns.creational.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void testInstanceTheSame() {
        String value = "hello";

        Singleton instance1 = Singleton.getInstance(value);
        Singleton instance2 = Singleton.getInstance(value);

        assertThat(instance1).isNotNull();
        assertThat(instance2).isNotNull();
        assertThat(instance1).isSameAs(instance2);
        assertThat(instance1.getValue()).isEqualTo(instance2.getValue());
    }

}