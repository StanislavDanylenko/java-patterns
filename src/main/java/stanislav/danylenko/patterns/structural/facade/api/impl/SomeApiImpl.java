package stanislav.danylenko.patterns.structural.facade.api.impl;

import stanislav.danylenko.patterns.structural.facade.api.SomeApi;

public class SomeApiImpl implements SomeApi {
    @Override
    public String read(
            String param1,
            String param2,
            String param3,
            String param4,
            String param5,
            String param6,
            String param7,
            String param8,
            String param9,
            String param10) {
        return "Read some info";
    }

    @Override
    public int write(
            String param1,
            String param2,
            String param3,
            String param4,
            String param5,
            String param6,
            String param7,
            String param8,
            String param9,
            String param10) {
        return param4.length();
    }

    @Override
    public int update(
            String param1,
            String param2,
            String param3,
            String param4,
            String param5,
            String param6,
            String param7,
            String param8,
            String param9,
            String param10) {
        return param5.length() - param4.length();
    }

    @Override
    public boolean delete(
            String param1,
            String param2,
            String param3,
            String param4,
            String param5,
            String param6,
            String param7,
            String param8,
            String param9,
            String param10) {
        return param1.equals(param2);
    }
}
