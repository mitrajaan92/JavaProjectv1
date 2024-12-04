package com.binary.day5.loan;

public class LoanApplication extends ALoanApp{
    private double loanAmm;
    private String name;
    private String ssn;
    private double income;
    private double expense;
    public LoanApplication( double loanAmm, String name, String ssn ,double income, double expense){
        this.loanAmm = loanAmm;
        this.name = name;
        this.ssn = ssn;
        this.income = income;
        this.expense = expense;
    }

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

    @Override
    public double calcRate(){
        double rate1 = rateBaseIncome(this.income, this.expense);
        double rate2 = rateBaseIncome(this.income, this.expense);
        double rate = (rate1 + rate2)/2;
        return rate;
    }
    private int getCreditScore(String ssn){
        //logic
        return 760;
    }
    private double rateBaseIncome(double income, double expense){
        //logic
        return 7.5;
    }
    private double calcRateCreditScore(){
        int creditScore = getCreditScore(this.ssn);
        //logic base on creditors
        return 5.5;
    }
}
