package com.solvd.Sax;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        TeachersHandler teachersHandler = new TeachersHandler();
        saxParser.parse("teacher.xml", teachersHandler);

        Teachers result = teachersHandler.getTeachers();
        System.out.println(result.getList().get(0).getFirstName());
        System.out.println(result.getList().get(0).getLastName());
        System.out.println(result.getList().get(0).getAge());

    }
}









