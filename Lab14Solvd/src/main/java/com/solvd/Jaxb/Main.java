package com.solvd.Jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

    public static void main(String[] args) throws JAXBException, IOException, ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        Date date   = simpleDateFormat.parse("22-1-2024");
//
//        Date date1 = new Date();
//        String abc = simpleDateFormat.format(date1);

        Teachers teachers = unmarshal();
        System.out.println(teachers);
        marshal();
    }

    public static Teachers unmarshal() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Teachers.class);
        return (Teachers) context.createUnmarshaller()
                .unmarshal(new FileReader("teacher.xml"));
    }

    public static void marshal() throws JAXBException, IOException {
        Teacher jonathan = new Teacher("Jonathan","Frilla",24,3,new Contact("jonathan.frilla@yahoo.com",724542324),new Date());
        Teacher tatiana = new Teacher("Tatiana","Molotov",29,4,new Contact("tatiana.molotov@yahoo.com",793543221),new Date());
        Teachers teachers = new Teachers();
        List<Teacher> list = new ArrayList<>();
        list.add(jonathan);
        list.add(tatiana);
        teachers.setList(list);

        JAXBContext context = JAXBContext.newInstance(Teachers.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(teachers, new File("teachers1.xml"));
    }
}
