package com.github.rjs5613.atm;

public class Atm {

    private Workflow currentWorkflow;

    private final CardHolder cardHolder;
    private final CashDispenser cashDispenser;
    private final Screen screen;
    private final KeyBoard keyBoard;
    private final CashDipositor cashDipositor;


    public Atm(CardHolder cardHolder, CashDispenser cashDispenser, Screen screen, KeyBoard keyBoard, CashDipositor cashDipositor) {
        this.cardHolder = cardHolder;
        this.cashDispenser = cashDispenser;
        this.screen = screen;
        this.keyBoard = keyBoard;
        this.cashDipositor = cashDipositor;

    }

    public void startWithdrawal() {
        if (null == currentWorkflow) {
            currentWorkflow = new WithdrawalWorkflow(new InsertCard(Task.WITHDRAWAL));
        } else {
            throw new IllegalStateException("");
        }
        initiateWorkflow();
    }

    public void printStatement() {
        if (null == currentWorkflow) {
            currentWorkflow = new PrintStatementWorkflow(new InsertCard(Task.PRINT_STATEMENT));
        } else {
            throw new IllegalStateException("");
        }
        initiateWorkflow();
    }

    private void initiateWorkflow() {
        while (currentWorkflow.hasNext()) {
            currentWorkflow.next().execute();
        }
    }
}
