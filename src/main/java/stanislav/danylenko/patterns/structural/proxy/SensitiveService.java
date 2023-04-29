package stanislav.danylenko.patterns.structural.proxy;

import java.util.List;

import stanislav.danylenko.patterns.structural.proxy.components.AuthUser;

public interface SensitiveService {

    void create(AuthUser user, String record);
    void delete(AuthUser user, String record);
    List<String> read(AuthUser user);

}
