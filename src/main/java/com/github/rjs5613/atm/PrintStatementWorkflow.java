package com.github.rjs5613.atm;

public class PrintStatementWorkflow implements Workflow {

    public PrintStatementWorkflow(InsertCard insertCard) {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public WorkflowStep next() {
        return null;
    }
}
