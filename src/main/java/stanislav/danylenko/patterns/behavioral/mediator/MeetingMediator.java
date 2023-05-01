package stanislav.danylenko.patterns.behavioral.mediator;

public interface MeetingMediator {

    void sendMessage(String message, AbstractAttendee attendee);

    void addAttendee(AbstractAttendee attendee);

}
