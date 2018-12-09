package events;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class SpecialEvent extends GeneralEvent {

    @XmlElement(name = "specialEventAbout")
    private String specialEventAbout;

    @XmlElement(name = "specialEventStatus")
    private SpecialEventStatus specialEventStatus;

    @XmlElement(name = "specialEventCreator")
    private Creator specialEventCreator;

    public String getSpecialEventAbout() {
        return specialEventAbout;
    }

    public void setSpecialEventAbout(String specialEventAbout) {
        this.specialEventAbout = specialEventAbout;
    }

    public SpecialEventStatus getSpecialEventStatus() {
        return specialEventStatus;
    }

    public void setSpecialEventStatus(SpecialEventStatus specialEventStatus) {
        this.specialEventStatus = specialEventStatus;
    }

    public Creator getSpecialEventCreator() {
        return specialEventCreator;
    }

    public void setSpecialEventCreator(Creator specialEventCreator) {
        this.specialEventCreator = specialEventCreator;
    }

    @Override
    public String toString() {
        return "SpecialEvent{" +
                "specialEventAbout='" + specialEventAbout + '\'' +
                ", specialEventStatus=" + specialEventStatus +
                ", specialEventCreator=" + specialEventCreator +
                '}';
    }
}
