package com.genetree.ws.tree.model;

import java.util.Date;
import java.util.List;

import com.genetree.engine.enums.Sex;
import com.genetree.engine.parsers.JSONParser;

import org.codehaus.jackson.type.TypeReference;

public class Member extends Parent {

    private Date birth;
    private List<Parent> parents;

    public Member() {
    }

    public Member(String json) {
        Member member = JSONParser.fromJSON(new TypeReference<Member>() {
        }, json);
        id = member.getId();
        firstName = member.getFirstName();
        lastName = member.getLastName();
        sex = member.getSex();
        birth = member.getBirth();
        parents = member.getParents();
    }

    public Member(String id, String firstName, String lastName, Sex sex) {
        super(id, firstName, lastName, sex);
    }

    public Member(String id, String firstName, String lastName, Sex sex, Date birth) {
        this(id, firstName, lastName, sex, birth, null);
    }

    public Member(String id, String firstName, String lastName, Sex sex, Date birth, List<Parent> parents) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birth = birth;
        this.parents = parents;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public Date getBirth() {
        return birth;
    }

    public List<Parent> getParents() {
        return parents;
    }
}
