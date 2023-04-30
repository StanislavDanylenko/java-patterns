package stanislav.danylenko.patterns.behavioral.chain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.behavioral.chain.impl.FacebookAuthHandler;
import stanislav.danylenko.patterns.behavioral.chain.impl.GoogleAuthHandler;

class ChainOfResponsibilityTest {
    private final AbstractAuthHandler googleAuthHandler = new GoogleAuthHandler(null);
    private final AbstractAuthHandler facebookAuthHandler = new FacebookAuthHandler(googleAuthHandler);

    @Test
    void testChainProcessed() {
        AuthRequest request = new AuthRequest("123456", null, "hello");
        AuthUser authUser = facebookAuthHandler.authUser(request);

        assertThat(authUser).isNotNull();
        assertThat(authUser.id()).isEqualTo(request.userId());
        assertThat(authUser.token()).isNotNull();
    }

    @Test
    void testChainProcessedReturnsNull() {
        AuthRequest request = new AuthRequest("123456", null, null);
        AuthUser authUser = facebookAuthHandler.authUser(request);

        assertThat(authUser).isNull();
    }

    @Test
    void testChainProcessedNoHandler() {
        AuthRequest request = new AuthRequest(null, null, "123456");
        AuthUser authUser = facebookAuthHandler.authUser(request);

        assertThat(authUser).isNull();
    }

}