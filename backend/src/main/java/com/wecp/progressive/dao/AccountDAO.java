package com.wecp.progressive.dao;


import com.wecp.progressive.entity.Accounts;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.List;

public interface AccountDAO {
    int addAccount(Accounts accounts) throws SQLException;
    Accounts getAccountById(int accountId) throws SQLException;
    void updateAccount(Accounts accounts) throws SQLException;
    void deleteAccount(int accountId) throws SQLException;
    List<Accounts> getAllAccounts() throws SQLException;
}
=======
import java.util.List;

public interface AccountDAO {
    int addAccount(Accounts accounts);
    Accounts getAccountById(int accountId);
    void updateAccount(Accounts accounts);
    void deleteAccount(int accountId);
    List<Accounts> getAllAccounts();
}
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
