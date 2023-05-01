package stanislav.danylenko.patterns.behavioral.mediator;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.behavioral.mediator.impl.Attendee;
import stanislav.danylenko.patterns.behavioral.mediator.impl.MeetingMediatorImpl;

class MediatorTest {

    @Test
    void testMediator() {
        MeetingMediator mediator = new MeetingMediatorImpl();
        AbstractAttendee attendee1 = new Attendee(mediator, "User 1");
        AbstractAttendee attendee2 = spy(new Attendee(mediator, "User 2"));

        mediator.addAttendee(attendee1);
        mediator.addAttendee(attendee2);

        String message = "Hello!";
        attendee1.send(message);

        verify(attendee2).receive(message);
    }
}