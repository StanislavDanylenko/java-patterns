package stanislav.danylenko.patterns.behavioral.chain.impl;

import java.util.UUID;

import stanislav.danylenko.patterns.behavioral.chain.AbstractAuthHandler;
import stanislav.danylenko.patterns.behavioral.chain.AuthRequest;
import stanislav.danylenko.patterns.behavioral.chain.AuthUser;

public class FacebookAuthHandler extends AbstractAuthHandler {

    public FacebookAuthHandler(AbstractAuthHandler next) {
        super(next);
    }

    @Override
    public AuthUser authUser(AuthRequest authRequest) {
        if (authRequest.facebookId() != null) {
            return auth(authRequest);
        } else if (getNext() != null) {
            return getNext().authUser(authRequest);
        }
        return null;
    }

    private AuthUser auth(AuthRequest authRequest) {
        if (authRequest.userId() != null) {
            return new AuthUser(authRequest.userId(), UUID.randomUUID().toString());
        }
        return null;
    }
}
