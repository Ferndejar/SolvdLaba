package com.solvd.Sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class TeachersHandler extends DefaultHandler {
    private static final String TEACHERS = "teachers";
    private static final String TEACHER= "teacher";
    private static final String FIRSTNAME = "firstName";
    private static final String LASTNAME = "lastName";
    private static final String AGE = "age";

    private Teachers teachers;
    private StringBuilder elementValue;

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (elementValue == null) {
            elementValue = new StringBuilder();
        } else {
            elementValue.append(ch, start, length);
        }
    }

    @Override
    public void startDocument() throws SAXException {
        teachers = new Teachers();
    }

    @Override
    public void startElement(String uri, String lName, String qName, Attributes attr) {
        switch (qName) {
            case TEACHERS:
                teachers.setList(new ArrayList<Teacher>());
                break;
            case TEACHER:
                teachers.getList().add(new Teacher());
                break;
            case FIRSTNAME:
                elementValue = new StringBuilder();
                break;
            case LASTNAME:
                elementValue = new StringBuilder();
                break;
            case AGE:
                elementValue = new StringBuilder();
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case FIRSTNAME:
                latestArticle().setFirstName(elementValue.toString());
                break;
            case LASTNAME:
                latestArticle().setLastName(elementValue.toString());
                break;
            case AGE:
                latestArticle().setAge(Integer.parseInt(elementValue.toString()));
                break;
        }
    }

    private Teacher latestArticle() {
        List<Teacher> carsList = teachers.getList();
        int latestArticleIndex = carsList.size() - 1;
        return carsList.get(latestArticleIndex);
    }

    public Teachers getTeachers() {
        return teachers;
    }
}
