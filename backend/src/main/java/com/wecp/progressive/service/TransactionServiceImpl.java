package com.wecp.progressive.service;


<<<<<<< HEAD
import com.wecp.progressive.dao.AccountDAO;
import com.wecp.progressive.dao.AccountDAOImpl;
import com.wecp.progressive.dao.TransactionDAO;
import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.exception.AccountNotFoundException;
import com.wecp.progressive.exception.OutOfBalanceException;
=======
import com.wecp.progressive.dao.TransactionDAO;
import com.wecp.progressive.entity.Transactions;
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12

import java.sql.SQLException;
import java.util.List;


public class TransactionServiceImpl implements TransactionService {
<<<<<<< HEAD
    private TransactionDAO transactionDAO;

    public TransactionServiceImpl(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    @Override
    public List<Transactions> getAllTransactions() throws SQLException {
        return transactionDAO.getAllTransactions();
=======

    private TransactionDAO transactionDAO;

    public TransactionServiceImpl(TransactionDAO transactionDAO){
        this.transactionDAO = transactionDAO;
    }
    @Override
    public List<Transactions> getAllTransactions() throws SQLException {
        return null;
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
    }

    @Override
    public Transactions getTransactionById(int transactionId) throws SQLException {
<<<<<<< HEAD
        return transactionDAO.getTransactionById(transactionId);
=======
        return null;
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
    }

    @Override
    public int addTransaction(Transactions transaction) throws SQLException {
<<<<<<< HEAD
        return transactionDAO.addTransaction(transaction);
=======
        return -1;
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
    }

    @Override
    public void updateTransaction(Transactions transaction) throws SQLException {
<<<<<<< HEAD
        transactionDAO.updateTransaction(transaction);
=======

>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
    }

    @Override
    public void deleteTransaction(int transactionId) throws SQLException {
<<<<<<< HEAD
        transactionDAO.deleteTransaction(transactionId);
    }

    @Override
    public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
}
=======

    }

    @Override
    public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException{
        return null;
    }
}
>>>>>>> 4e22544bcc9b3dd20b60f27ef1f2b6cfef344e12
