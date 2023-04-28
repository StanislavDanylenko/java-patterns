package stanislav.danylenko.patterns.structural.facade.api;

public class SomeApiFacade {

    private final SomeApi someApi;

    public SomeApiFacade(SomeApi someApi) {
        this.someApi = someApi;
    }

    public String read() {
        return someApi.read(null, null, null, null, null, null, null, null, null, null);
    }

    int write(String param4) {
        return someApi.write(null, null, null, param4, null, null, null, null, null, null);
    }

    int update(String param4, String param5) {
        return someApi.update(null, null, null, param4, param5, null, null, null, null, null);
    }

    boolean delete(String param1, String param2) {
        return someApi.delete(param1, param2, null, null, null, null, null, null, null, null);
    }

}
