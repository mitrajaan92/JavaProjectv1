package com.binary.day5.loan;

public abstract class ALoanApp {
    private double loanAmm;
    private String name;
    private String ssn;
    private double income;
    private double expense;

    public double getLoanAmm() {
        return loanAmm;
    }

    public void setLoanAmm(double loanAmm) {
        this.loanAmm = loanAmm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public abstract double calcRate();



}
