package com.mes.router;

import com.mes.controller.Controller;
import com.mes.controller.account.AccountListController;
import com.mes.controller.account.CreateAccountController;

import java.util.HashMap;

public class AddAccountRouter {

    public AddAccountRouter(HashMap<String, Controller> router){
        router.put("/accountList.do", new AccountListController());
        router.put("/accountCreate.do", new CreateAccountController());

    }
}
