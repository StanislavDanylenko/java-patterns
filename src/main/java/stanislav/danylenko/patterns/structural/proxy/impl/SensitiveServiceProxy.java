package stanislav.danylenko.patterns.structural.proxy.impl;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.patterns.structural.proxy.SensitiveService;
import stanislav.danylenko.patterns.structural.proxy.components.AuthUser;
import stanislav.danylenko.patterns.structural.proxy.components.Role;
import stanislav.danylenko.patterns.structural.proxy.components.Store;

@Slf4j
public class SensitiveServiceProxy implements SensitiveService {

    private final SensitiveService sensitiveService;

    public SensitiveServiceProxy(Store values) {
        this.sensitiveService = new SensitiveServiceImpl(values);
    }

    @Override
    public void create(AuthUser user, String value) {
        sensitiveService.create(user, value);
    }

    @Override
    public void delete(AuthUser user, String value) {
        if (user.role() == Role.ADMIN) {
            sensitiveService.delete(user, value);
        } else {
            log.info("Access denied dor user: {}", user.name());
        }
    }

    @Override
    public List<String> read(AuthUser user) {
        return sensitiveService.read(user);
    }
}
