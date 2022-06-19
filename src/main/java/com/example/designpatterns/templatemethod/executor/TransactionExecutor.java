package com.example.designpatterns.templatemethod.executor;

import com.example.designpatterns.templatemethod.executor.AbstractTransactionExecutor;

public class TransactionExecutor extends AbstractTransactionExecutor {
    @Override
    protected void beginTransaction() {
        System.out.println("Starting transaction");
    }

    @Override
    protected void commitTransaction() {
        System.out.println("Committing transaction");
    }

    @Override
    protected void query(String query) {
        System.out.println("Query: " + query);
    }
}
