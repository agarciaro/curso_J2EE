package com.cursoj2ee.jsfj2ee;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
//@ViewScoped
@ApplicationScoped
@Getter
@Setter
@ToString
public class PersonaBean implements Serializable {

    private List<String> list;
    private String name;

    @PostConstruct
    public void init(){
        name = "Pepe";
        list = new ArrayList<>();
        list.add("nombre1");
        list.add("nombre2");
    }

    public void add(){
        list.add(name);
    }

    public void delete(String p) {
        for (String x: list) {
            if(x.equals(p)){
                list.remove(x);
                break;
            }
        }
        list.removeIf( x -> x.equals(p));
    }
}
