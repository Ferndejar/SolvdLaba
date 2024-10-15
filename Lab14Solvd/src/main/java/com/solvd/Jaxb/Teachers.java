package com.solvd.Jaxb;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
@XmlRootElement(name = "teachers")
public class Teachers {

    List<Teacher> list;

    public List<Teacher> getList() {
        return list;
    }
    @XmlElement(name = "teacher")
    public void setList(List<Teacher> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "list=" + list +
                '}';
    }
}
