package com.github.rjs5613.atm;

public class InsertCard implements WorkflowStep {

    private final Task task;

    public InsertCard(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {

    }

    @Override
    public WorkflowStep next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
