package program.utils;

import events.SpecialEvent;

public class DATAChanger {

    public SpecialEvent updateEventName(SpecialEvent specialEvent) {
        switch (specialEvent.getSpecialEventStatus()) {
            case Run:
                specialEvent.setEventName(specialEvent.getEventName() + " (Запущен)");
                break;
            case End:
                specialEvent.setEventName(specialEvent.getEventName() + " (Закончилось)");
                break;
            case Stop:
                specialEvent.setEventName(specialEvent.getEventName() + " (Приостановлено)");
                break;
            case New:
                specialEvent.setEventName(specialEvent.getEventName() + " (Открыт)");
                break;
        }
        return specialEvent;
    }
}
