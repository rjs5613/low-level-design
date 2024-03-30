package com.github.rjs5613.atm;

public interface WorkflowStep {

    void execute();

    WorkflowStep next();

    boolean hasNext();
}
