package com.codurance.srp;

public class AccountServiceWithdraw {


    private TransactionRepository transactionRepository;
    private Clock clock;

    public AccountServiceWithdraw(TransactionRepository t, Clock clock){

        this.transactionRepository=t;
        this.clock = clock;
    }

    public TransactionRepository getTransactionRepository (){
        return this.transactionRepository;
    }
    
    public void deposit(int amount) {
        transactionRepository.add(transactionWith(amount));
    }

    public void withdraw(int amount) {
        transactionRepository.add(transactionWith(-amount));
    }

    public Transaction transactionWith(int amount) {
        return new Transaction(clock.today(), amount);
    }

    
}
