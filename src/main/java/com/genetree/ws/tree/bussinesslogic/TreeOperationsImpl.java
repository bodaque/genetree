package com.genetree.ws.tree.bussinesslogic;

import java.util.List;

import com.genetree.response.model.Response;
import com.genetree.ws.tree.model.Member;

public class TreeOperationsImpl implements TreeOperations {

    private List<Member> members;

    @Override
    public void setTree(List<Member> members) {
        this.members = members;
    }

    @Override
    public List<Member> getTree() {
        return members;
    }

    @Override
    public Response showMyProfile() {
        return new Response(members.stream().findFirst().get());
    }
}
