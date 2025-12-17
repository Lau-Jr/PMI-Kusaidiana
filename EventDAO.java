import java.util.ArrayList;
import java.util.List;

public class EventDAO {
    List<Event> events;

    public EventDAO(){// Here I can use singleton to Ensure there is only on instance of this
        events = new ArrayList<>();
    }

    public List<Event> getEvents() {
        return events;
    }

    public void addEvent(Event event){
        events.add(event);
    }

}
