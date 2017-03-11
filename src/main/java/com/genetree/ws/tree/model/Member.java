package com.genetree.ws.tree.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.genetree.engine.enums.Sex;
import com.genetree.engine.parsers.JSONParser;

@XmlRootElement
public class Member {

    @XmlAttribute
    private Integer id;

    @XmlAttribute
    private Integer fatherId;

    @XmlAttribute
    private Integer spouseId;

    private String firstName;

    private String lastName;

    private Sex sex;

    private Date birth;

    public Member() {
    }

    public Member(String json) {
        Member member = JSONParser.fromJSON(json, Member.class);

        id = member.getId();
        fatherId = member.getFatherId();
        spouseId = member.getSpouseId();

        firstName = member.getFirstName();
        lastName = member.getLastName();
        sex = member.getSex();
        birth = member.getBirth();
    }

    public Member(Integer id, Integer fatherId, Integer spouseId, String firstName, String lastName, Sex sex,
            Date birth) {
        this.id = id;
        this.fatherId = fatherId;
        this.spouseId = spouseId;

        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birth = birth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public Integer getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(Integer spouseId) {
        this.spouseId = spouseId;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
