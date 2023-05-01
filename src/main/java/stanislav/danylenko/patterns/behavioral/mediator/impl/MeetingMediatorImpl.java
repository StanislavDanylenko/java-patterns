package stanislav.danylenko.patterns.behavioral.mediator.impl;

import java.util.ArrayList;
import java.util.List;

import stanislav.danylenko.patterns.behavioral.mediator.AbstractAttendee;
import stanislav.danylenko.patterns.behavioral.mediator.MeetingMediator;

public class MeetingMediatorImpl implements MeetingMediator {

    private final List<AbstractAttendee> attendees = new ArrayList<>();

    @Override
    public void sendMessage(String message, AbstractAttendee attendee) {
        for (AbstractAttendee a : attendees) {
            if (a.equals(attendee)) {
                continue;
            }
            a.receive(message);
        }
    }

    @Override
    public void addAttendee(AbstractAttendee attendee) {
        attendees.add(attendee);
    }
}
