package stanislav.danylenko.patterns.structural.proxy.impl;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.patterns.structural.proxy.SensitiveService;
import stanislav.danylenko.patterns.structural.proxy.components.AuthUser;
import stanislav.danylenko.patterns.structural.proxy.components.Store;

@Slf4j
public class SensitiveServiceImpl implements SensitiveService {

    private static final String ACCESS_USER = "Access user: {}";

    private final Store values;

    public SensitiveServiceImpl(Store values) {
        this.values = values;
    }

    @Override
    public void create(AuthUser user, String value) {
        log.info(ACCESS_USER, user.name());
        values.add(value);
    }

    @Override
    public void delete(AuthUser user, String value) {
        log.info(ACCESS_USER, user.name());
        values.remove(value);
    }

    @Override
    public List<String> read(AuthUser user) {
        log.info(ACCESS_USER, user.name());
        return values.get();
    }

}
