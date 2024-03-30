package com.github.rjs5613.atm;

public class DispenseCash implements WorkflowStep {

    public DispenseCash(Atm atm, CashDispenser cashDispenser) {

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
