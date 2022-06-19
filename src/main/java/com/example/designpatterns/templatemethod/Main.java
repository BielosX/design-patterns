package com.example.designpatterns.templatemethod;

import com.example.designpatterns.templatemethod.executor.AbstractTransactionExecutor;
import com.example.designpatterns.templatemethod.executor.TransactionExecutor;

public class Main {
    public static void main(String[] args) {
        AbstractTransactionExecutor executor = new TransactionExecutor();
        executor.execute("SELECT * FROM USERS");
    }
}
