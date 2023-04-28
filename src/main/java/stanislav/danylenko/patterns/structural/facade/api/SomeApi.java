package stanislav.danylenko.patterns.structural.facade.api;

public interface SomeApi {

    String read(String param1, String param2, String param3, String param4, String param5,
            String param6, String param7, String param8, String param9, String param10);

    int write(String param1, String param2, String param3, String param4, String param5,
            String param6, String param7, String param8, String param9, String param10);

    int update(String param1, String param2, String param3, String param4, String param5,
            String param6, String param7, String param8, String param9, String param10);

    boolean delete(String param1, String param2, String param3, String param4, String param5,
            String param6, String param7, String param8, String param9, String param10);

}
