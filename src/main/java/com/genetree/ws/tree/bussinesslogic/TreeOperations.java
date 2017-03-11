package com.genetree.ws.tree.bussinesslogic;

import java.util.List;

import com.genetree.response.model.Response;
import com.genetree.ws.tree.model.Member;

public interface TreeOperations {

    Response getTree();

    Response showMyProfile();

    Response showProfile(int i);
}
