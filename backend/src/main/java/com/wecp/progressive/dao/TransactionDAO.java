package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Transactions;

import java.sql.SQLException;
import java.util.List;

public interface TransactionDAO {
<<<<<<< HEAD
    int addTransaction(Transactions transaction) throws SQLException;
    Transactions getTransactionById(int transactionId) throws SQLException;
    void updateTransaction(Transactions transaction) throws SQLException;
    void deleteTransaction(int transactionId) throws SQLException;
    List<Transactions> getAllTransactions() throws SQLException;
=======
    int addTransaction(Transactions transaction);
    Transactions getTransactionById(int transactionId);
    void updateTransaction(Transactions transaction);
    void deleteTransaction(int transactionId) ;
    List<Transactions> getAllTransactions();
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
}
