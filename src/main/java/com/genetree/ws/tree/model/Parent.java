package com.genetree.ws.tree.model;

import com.genetree.engine.enums.Sex;
import com.genetree.engine.parsers.JSONParser;

import org.codehaus.jackson.type.TypeReference;

public class Parent {

    protected String id;
    protected String firstName;
    protected String lastName;
    protected Sex sex;

    public Parent() {
    }

    public Parent(String json) {
        Member member = JSONParser.fromJSON(new TypeReference<Member>() {
        }, json);
        id = member.getId();
        firstName = member.getFirstName();
        lastName = member.getLastName();
        sex = member.getSex();
    }

    public Parent(String id, String firstName, String lastName, Sex sex) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
