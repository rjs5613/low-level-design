package com.github.rjs5613.atm;

public class EnterAmount implements WorkflowStep {

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
