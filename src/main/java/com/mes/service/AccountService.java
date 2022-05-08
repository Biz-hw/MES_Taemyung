package com.mes.service;

import com.mes.dao.AccountDAO;
import com.mes.dto.account.AccountListDTO;
import com.mes.entity.Account;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class AccountService {
    private final HttpServletRequest request;

    private final AccountDAO accountDAO = new AccountDAO();

    public AccountService(HttpServletRequest request) {
        this.request = request;
    }

    public void accountList(AccountListDTO dto) {
        List<Account> accountList = accountDAO.findAll();
        long accountTotalCount = accountDAO.countAll();

        request.setAttribute("accountList", accountList);
        request.setAttribute("accountTotalCount", accountTotalCount);
    }
}
