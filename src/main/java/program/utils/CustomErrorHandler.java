package program.utils;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class CustomErrorHandler implements ErrorHandler {
    @Override
    public void warning(SAXParseException exception) {
        System.err.println(String.format("WARNING: xml validate warning in line %d, column %d", exception.getLineNumber(), exception.getColumnNumber()));
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        System.err.println(String.format("ERROR: xml validate error in line %d, column %d", exception.getLineNumber(), exception.getColumnNumber()));
        throw exception;
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {
        System.err.println(String.format("FATAL ERROR: xml validate error in line %d, column %d", exception.getLineNumber(), exception.getColumnNumber()));
        throw exception;
    }
}