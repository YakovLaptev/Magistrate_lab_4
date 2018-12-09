package program.utils;

import events.SpecialEvents;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import java.io.FileInputStream;

public class JAXBGenerator {

   public SpecialEvents deserialize(String xmlFileAbsolutePath) {
      SpecialEvents specialEvents = new SpecialEvents();
      try (FileInputStream fileInputStream = new FileInputStream(xmlFileAbsolutePath)) {
         JAXBContext jaxbContext = JAXBContext.newInstance(SpecialEvents.class);
         Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
         specialEvents = (SpecialEvents) unmarshaller.unmarshal(fileInputStream);
      } catch (Exception exception) {
         System.err.println("Ошибка при десериализация xml");
         exception.printStackTrace();
      }
      return specialEvents;
   }

   public JAXBSource serialize(SpecialEvents businessEntityList) {
      JAXBSource jaxbSource = null;
      try {
         JAXBContext jaxbContext = JAXBContext.newInstance(SpecialEvents.class);
         Marshaller marshaller = jaxbContext.createMarshaller();
         marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
         jaxbSource = new JAXBSource(jaxbContext, businessEntityList);
      } catch (Exception exception) {
         System.err.println("Ошибка при сериализация xml");
         exception.printStackTrace();
      }
      return jaxbSource;
   }

}
