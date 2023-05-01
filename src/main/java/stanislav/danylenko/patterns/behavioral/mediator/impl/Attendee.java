package stanislav.danylenko.patterns.behavioral.mediator.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.patterns.behavioral.mediator.AbstractAttendee;
import stanislav.danylenko.patterns.behavioral.mediator.MeetingMediator;

@Slf4j
public class Attendee extends AbstractAttendee {

    public Attendee(MeetingMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        getMediator().sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        log.info("Message received: {}", message);
    }
}
