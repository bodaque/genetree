package com.genetree.response.model;

import java.util.List;

import com.genetree.ws.tree.model.Member;

public class Response {

    public boolean correct = true;
    public String result = "Tak sobi";
    public Member member;
    public List<Member> tree;

    public Response() {
    }

    public Response(Member member) {
        this.member = member;
    }
}
