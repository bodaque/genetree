package com.genetree.response.model;

import java.util.Collections;
import java.util.List;

import com.genetree.ws.tree.model.Member;

public class Response {

    public boolean correct = true;
    public String result = "Tak sobi";
    public List<Member> tree;

    public Response() {
    }

    public Response(Member member) {
        tree = Collections.singletonList(member);
    }

    public Response(List<Member> members) {
        tree = members;
    }
}
