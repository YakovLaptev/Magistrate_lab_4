package program.utils;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XMLValidator {

    public boolean validateXMLSchema(String xmlDocumentPath, String xsdSchemaPath) {
        try {
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            ErrorHandler errorHandler = new CustomErrorHandler();
            schemaFactory.setErrorHandler(errorHandler);
            Schema schema = schemaFactory.newSchema(new File(xsdSchemaPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlDocumentPath)));
            return true;
        } catch (IOException | SAXException exception) {
            System.err.println("Ошибка при валидации xml-документа" + exception.getMessage());
            return false;
        }
    }
}