import java.time.LocalDateTime;

public class Event {

    private EventType eventType;
    private LocalDateTime createdAt;
    private Member member;


    public Event(EventType eventType,Member member) {
        this.eventType = eventType;
        this.createdAt = createdAt;
        this.member = member;
    }
}
