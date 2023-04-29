package stanislav.danylenko.patterns.structural.proxy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import java.util.List;

import stanislav.danylenko.patterns.structural.proxy.components.AuthUser;
import stanislav.danylenko.patterns.structural.proxy.components.Role;
import stanislav.danylenko.patterns.structural.proxy.components.Store;
import stanislav.danylenko.patterns.structural.proxy.impl.SensitiveServiceImpl;
import stanislav.danylenko.patterns.structural.proxy.impl.SensitiveServiceProxy;

class ProxyTest {

    private final Store store = new Store();
    private final SensitiveService service = new SensitiveServiceImpl(store);
    private final SensitiveService serviceProxy = new SensitiveServiceProxy(store);

    private final AuthUser USER = new AuthUser("User", Role.USER);
    private final AuthUser ADMIN = new AuthUser("User", Role.ADMIN);

    private static final String USER_RECORD = "User record";
    private static final String ADMIN_RECORD = "Admin record";

    @Test
    void testCreate() {
        service.create(USER, USER_RECORD);

        List<String> list = service.read(USER);
        assertThat(list).hasSize(1);

        service.create(ADMIN, ADMIN_RECORD);

        list = service.read(USER);
        assertThat(list).hasSize(2);
    }

    @Test
    void testDelete() {
        service.create(USER, USER_RECORD);
        service.create(ADMIN, ADMIN_RECORD);

        List<String> list = service.read(USER);
        assertThat(list).hasSize(2);

        service.delete(USER, USER_RECORD);
        list = service.read(USER);
        assertThat(list).hasSize(1);

        service.delete(ADMIN, ADMIN_RECORD);
        list = service.read(USER);
        assertThat(list).hasSize(0);
    }

    @Test
    void testRead() {
        service.create(USER, USER_RECORD);
        service.create(ADMIN, ADMIN_RECORD);

        List<String> list = service.read(USER);
        assertThat(list).hasSize(2);

        list = service.read(ADMIN);
        assertThat(list).hasSize(2);
    }

    @Test
    void testCreateProxy() {
        serviceProxy.create(USER, USER_RECORD);

        List<String> list = serviceProxy.read(USER);
        assertThat(list).hasSize(1);

        serviceProxy.create(ADMIN, ADMIN_RECORD);

        list = serviceProxy.read(USER);
        assertThat(list).hasSize(2);
    }

    @Test
    void testDeleteProxy() {
        serviceProxy.create(USER, USER_RECORD);
        serviceProxy.create(ADMIN, ADMIN_RECORD);

        List<String> list = serviceProxy.read(USER);
        assertThat(list).hasSize(2);

        serviceProxy.delete(USER, USER_RECORD);
        list = serviceProxy.read(USER);
        assertThat(list).hasSize(2);

        serviceProxy.delete(ADMIN, ADMIN_RECORD);
        list = serviceProxy.read(USER);
        assertThat(list).hasSize(1);
    }

    @Test
    void testReadProxy() {
        serviceProxy.create(USER, USER_RECORD);
        serviceProxy.create(ADMIN, ADMIN_RECORD);

        List<String> list = serviceProxy.read(USER);
        assertThat(list).hasSize(2);

        list = serviceProxy.read(ADMIN);
        assertThat(list).hasSize(2);
    }
}