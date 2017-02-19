package com.genetree.ws.dao;

import com.genetree.engine.enums.Sex;
import com.genetree.ws.tree.model.Member;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ListOfMembersDefaultDAO implements ListOfMembersDAO {
    @Override
    public List<Member> getDataForTree() {
        Member m2 = new Member("00000002", "Volodymyr", "Bodak", Sex.MALE);
        Member m3 = new Member("00000003", "Oksana", "Bodak", Sex.FEMALE);
        Member m1 = new Member("00000001", "Roman", "Bodak", Sex.MALE, new Date(742078800000L), Arrays.asList(m2, m3));
        return Arrays.asList(m1, m2, m3);
    }
}
