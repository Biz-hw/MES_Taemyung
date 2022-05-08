package com.mes.router;

import com.mes.controller.*;

import java.util.HashMap;

public class AddMainRouter {
    public AddMainRouter(HashMap<String, Controller> router) {
        //로그인 , 로그아웃
        router.put("/login.do", new LoginController());
        router.put("/loginProc.do", new LoginProcController());

    }
}
