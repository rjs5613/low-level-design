package com.github.rjs5613.atm;

public class WithdrawalWorkflow implements Workflow {

    private WorkflowStep currentStep;

    public WithdrawalWorkflow(WorkflowStep initialStep) {
        this.currentStep = initialStep;

    }

    @Override
    public boolean hasNext() {
        return currentStep.hasNext();
    }

    @Override
    public WorkflowStep next() {
        WorkflowStep nextStep = currentStep.next();
        this.currentStep = nextStep;
        return nextStep;
    }
}
