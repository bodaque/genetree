package com.genetree.ws.tree.bussinesslogic;

import java.util.List;

import com.genetree.response.model.Response;
import com.genetree.ws.tree.model.Member;

public class TreeOperationsImpl implements TreeOperations {

    private List<Member> members;

    public TreeOperationsImpl(List<Member> members) {
        this.members = members;
    }

    @Override
    public Response getTree() {
        return new Response(members);
    }

    @Override
    public Response showMyProfile() {
        return new Response(members.stream().findFirst().get());
    }

    @Override
    public Response showProfile(int i) {
        return new Response(members.get(i));
    }
}
