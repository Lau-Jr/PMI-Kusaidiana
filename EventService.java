public class EventService {

    private final EventDAO eventDAO;

    public EventService(EventDAO eventDAO) {
        this.eventDAO =  eventDAO;
    }

    public void addEvent(EventType eventType, Member member){

        Event event = new Event(eventType,member);
        eventDAO.addEvent(event);
        System.out.printf("=======Event Successfully Created, Below is the summary===========%n");
        System.out.printf("Event Type: %s%n",eventType);
        System.out.printf("Event Date: %s%n", event.getCreateAt());
        System.out.printf("Beneficiary: %s%n",member.getFullName());
        System.out.printf("=======End of Event summary===========%n");

    }
}
