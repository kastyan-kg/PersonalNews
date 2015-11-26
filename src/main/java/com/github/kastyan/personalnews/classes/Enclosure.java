package com.github.kastyan.slownewsspringmvc.classes;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAnyAttribute;
import java.util.HashMap;

@Embeddable
public class Enclosure {

    private HashMap<String, String> enclosureMap;

    @XmlAnyAttribute
    public HashMap<String, String> getEnclosureMap() {
        return enclosureMap;
    }



    public void setEnclosureMap(HashMap<String, String> enclosureMap) {
        this.enclosureMap = enclosureMap;
    }


    @Override
    public String toString() {
        return "Enclosure{" +
                "enclosureMap=" + enclosureMap.keySet().toString() +
                '}';
    }
}