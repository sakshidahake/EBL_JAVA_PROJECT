package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Accounts;


public class AccountDAOImpl implements AccountDAO{

    @Override
    public List<Accounts> getAllAccounts() {
        return null;

    }

    public List<Accounts> getAllAccountsByCustomer(int customer_id) {
        List<Accounts> accounts_al = new ArrayList<>();
        return accounts_al;
    }

    @Override
    public Accounts getAccountById(int accountId) {
        return null;
    }

    @Override
    public int addAccount(Accounts accounts) {
        int generated_ID = -1;
        return generated_ID;
    }


    @Override
    public void updateAccount(Accounts accounts)  {

    }

    @Override
    public void deleteAccount(int accountId) {

    }

}