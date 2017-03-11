package com.genetree.ws.dao;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.genetree.engine.enums.Sex;
import com.genetree.ws.tree.model.Member;

public class ListOfMembersDefaultDAO implements ListOfMembersDAO {

    private static final String BODAK = "Bodak";

    @Override
    public List<Member> getDataForTree() {
        Member m1 = new Member(1, 2, null, "Roman", BODAK, Sex.MALE, new Date(742078800000L));
        Member m2 = new Member(2, null, 003, "Volodymyr", BODAK, Sex.MALE, new Date(-147236400000L));
        Member m3 = new Member(3, null, 002, "Oksana", BODAK, Sex.FEMALE, new Date(-206593200000L));
        return Arrays.asList(m1, m2, m3);
    }
}
