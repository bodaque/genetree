package com.genetree.ws.tree.model;

import com.genetree.engine.enums.Sex;
import com.genetree.engine.parsers.JSONParser;
import org.codehaus.jackson.type.TypeReference;

import java.util.Date;

public class Member {

    private String id;
    private String firstName;
    private String lastName;
    private Sex sex;
    private Date birth;
    private String motherId;
    private String fatherId;

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
        fatherId = member.getFatherId();
        motherId = member.getMotherId();
    }

    public Member(String id, String firstName, String lastName, Sex sex) {
        this(id, firstName, lastName, sex, null);
    }

    public Member(String id, String firstName, String lastName, Sex sex, Date birth) {
        this(id, firstName, lastName, sex, birth, null, null);
    }

    public Member(String id, String firstName, String lastName, Sex sex, Date birth, String fatherId, String motherId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birth = birth;
        this.fatherId = fatherId;
        this.motherId = motherId;
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

    public String getMotherId() {
        return motherId;
    }

    public void setMotherId(String motherId) {
        this.motherId = motherId;
    }

    public String getFatherId() {
        return fatherId;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId;
    }
}
