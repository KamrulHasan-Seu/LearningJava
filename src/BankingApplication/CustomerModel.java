package BankingApplication;

import java.util.*;

public class CustomerModel {
    private int accountId;
    private String customerName;
    private String accountType;
    private long balance;

    //private Set<CustomerModel> accountList = new HashSet<>();


    public CustomerModel(int accountId, String customerName, String accountType, long balance) {
        this.accountId = accountId;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public CustomerModel() {
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
