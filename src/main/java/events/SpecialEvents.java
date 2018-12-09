package events;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "specialEvents")
@XmlAccessorType(XmlAccessType.FIELD)
public class SpecialEvents {

    @XmlElement(name = "specialEvent")
    private List<SpecialEvent> specialEvents;

    public List<SpecialEvent> getSpecialEvents() {
        return specialEvents;
    }

    public void setSpecialEvents(List<SpecialEvent> specialEvents) {
        this.specialEvents = specialEvents;
    }
}
