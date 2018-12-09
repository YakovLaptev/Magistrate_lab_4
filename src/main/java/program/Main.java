package program;

import events.SpecialEvents;
import program.utils.DATAChanger;
import program.utils.Generator;
import program.utils.JAXBGenerator;
import program.utils.XLSGenerator;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        XLSGenerator xlsGenerator = new XLSGenerator();
        DATAChanger dataChanger = new DATAChanger();
        JAXBGenerator jaxbGenerator = new JAXBGenerator();

        SpecialEvents specialEvents = jaxbGenerator.deserialize(generator.getPath("xml_for_xsd.xml"));
        if (!specialEvents.getSpecialEvents().isEmpty()) {
            specialEvents.getSpecialEvents().forEach(dataChanger::updateEventName);
            xlsGenerator.generateHtml(jaxbGenerator.serialize(specialEvents), generator.getPath("xsl_template.xsl"));
        }
    }
}