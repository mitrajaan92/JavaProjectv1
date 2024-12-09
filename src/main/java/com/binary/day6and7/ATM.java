package com.binary.day6and7;

public class ATM {

    public void withdraw(int money) throws MinWithdrawException, MaxWithdrawException{
        if(money < 100){
            //throw an exception
            throw new MinWithdrawException("Minimum amount should not be less than 100.");
        }
        if(money > 500){
            throw new MaxWithdrawException("Maximum amount should not be more than 500.");
        }
        System.out.println("money "+ money);
    }
}
