package com.example.designpatterns.templatemethod.executor;

public abstract class AbstractTransactionExecutor {
    protected abstract void beginTransaction();
    protected abstract void commitTransaction();

    protected abstract void query(String query);

    public final void execute(String query) {
        beginTransaction();
        query(query);
        commitTransaction();
    }
}
