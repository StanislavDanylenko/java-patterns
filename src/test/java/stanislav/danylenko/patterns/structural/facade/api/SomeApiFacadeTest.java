package stanislav.danylenko.patterns.structural.facade.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeApiFacadeTest {

    private final SomeApi someApi = mock(SomeApi.class);

    private final SomeApiFacade facade = new SomeApiFacade(someApi);

    @Test
    void read() {
        String helloWorld = "Hello World";

        when(someApi.read(null, null, null, null, null, null, null, null, null, null))
                .thenReturn(helloWorld);

        String read = facade.read();

        assertThat(read).isEqualTo(helloWorld);
    }

    @Test
    void write() {
        String param = "World";
        int expectedValue = 5;

        when(someApi.write(null, null, null, param, null, null, null, null, null, null))
                .thenReturn(expectedValue);

        int returnedValue = facade.write(param);

        assertThat(returnedValue).isEqualTo(expectedValue);
    }

    @Test
    void update() {
        String param1 = "param1";
        String param2 = "param2";
        int expectedValue = 1;

        when(someApi.update(null, null, null, param1, param2, null, null, null, null, null))
                .thenReturn(expectedValue);

        int returnedValue = facade.update(param1, param2);

        assertThat(returnedValue).isEqualTo(expectedValue);
    }

    @Test
    void delete() {
        String param1 = "param1";
        String param2 = "param2";
        boolean expectedValue = true;

        when(someApi.delete(param1, param2, null, null, null, null, null, null, null, null))
                .thenReturn(expectedValue);

        boolean returnedValue = facade.delete(param1, param2);

        assertThat(returnedValue).isEqualTo(expectedValue);
    }
}