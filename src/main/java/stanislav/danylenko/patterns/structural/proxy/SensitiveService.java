package stanislav.danylenko.patterns.structural.proxy;

import java.util.List;

import stanislav.danylenko.patterns.structural.proxy.components.AuthUser;

public interface SensitiveService {

    void create(AuthUser user, String value);
    void delete(AuthUser user, String value);
    List<String> read(AuthUser user);

}
