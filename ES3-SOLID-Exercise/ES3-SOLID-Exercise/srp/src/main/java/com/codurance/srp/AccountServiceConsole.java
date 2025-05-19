package com.codurance.srp;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.Collectors.toCollection;


public class AccountServiceConsole {
    

    private AccountServiceFormat format;
    private AccountServiceWithdraw withdraw;
    private Console console;


    public AccountServiceConsole(AccountServiceFormat f, AccountServiceWithdraw w){

        this.format = f;
        this.withdraw = w;
    }

     
    public void printStatement() {
        printHeader();
        printTransactions();
    }

    private void printHeader() {
        printLine(AccountServiceFormat.STATEMENT_HEADER);
        
    }

    private void printTransactions() {
        List<Transaction> transactions = withdraw.getTransactionRepository().all();
        final AtomicInteger balance = new AtomicInteger(0);
        transactions.stream()
                .map(transaction -> format.statementLine(transaction, balance.addAndGet(transaction.amount())))
                .collect(toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining(this::printLine);
    }

      private void printLine(String line) {
        console.printLine(line);
    }

}
