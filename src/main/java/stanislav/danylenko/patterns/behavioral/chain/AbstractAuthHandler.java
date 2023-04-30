package stanislav.danylenko.patterns.behavioral.chain;

import lombok.Getter;

@Getter
public abstract class AbstractAuthHandler {

    private final AbstractAuthHandler next;

    protected AbstractAuthHandler(AbstractAuthHandler next) {
        this.next = next;
    }

    public abstract AuthUser authUser(AuthRequest authRequest);
}
