package BankingApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BankingFunctionality {
    //CustomerModel customerModel = new CustomerModel();
    private final Set<CustomerModel> accountList = new HashSet<>();


    //Open Account
    public void openAccount(int accountId, String customerName, String accountType, long balance) {
        //for (int i = 0; i < openCustomerLength; i++) {
            CustomerModel customerModel = new CustomerModel(accountId, customerName, accountType, balance);
            accountList.add(customerModel);
       // }

    }

    //Show customer information
    public void showAllCustomerInfo() {
        for (CustomerModel customerModel : accountList) {

            System.out.println("Customer Account NO.: " + customerModel.getAccountId());
            System.out.println("Customer Name: " + customerModel.getCustomerName());
            System.out.println("Account Type: " + customerModel.getAccountType());
            System.out.println("Balance : " + customerModel.getBalance());
        }

    }

    //
    //show Single Account info
    public void showAccountInfo(int accountId) {
        for (CustomerModel customerModel : accountList) {
            if (customerModel.getAccountId() == accountId) {
                System.out.println("Customer Account NO.: " + customerModel.getAccountId());
                System.out.println("Customer Name: " + customerModel.getCustomerName());
                System.out.println("Account Type: " + customerModel.getAccountType());
                System.out.println("Balance : " + customerModel.getBalance());
            }
        }
    }

    //Deposit in account
    public void depositInAccount(int accNo, long depositAmount) {

        long previousBalance;
        for (CustomerModel customerModel : accountList) {
            if (customerModel.getAccountId() == accNo) {
                previousBalance = customerModel.getBalance();

                customerModel.setBalance(previousBalance + depositAmount);
                System.out.println("thanks!! Your Money " + depositAmount + " Is deposited");
                System.out.println("Your Current Balance Is : " + customerModel.getBalance());
            }
        }
    }

        public void withdrawfromAccount ( int accNo, long withdrawAmount){
            long previousBalance;
            for (CustomerModel customerModel : accountList) {
                if (customerModel.getAccountId() == accNo) {
                    previousBalance = customerModel.getBalance();
                    if (withdrawAmount > 0 && withdrawAmount <= customerModel.getBalance()) {
                        customerModel.setBalance(previousBalance - withdrawAmount);
                        System.out.println("thanks!! Your Money " + withdrawAmount + " Is Withdrawn");
                        System.out.println("Your Current Balance Is : " + customerModel.getBalance());
                    } else {
                        System.out.println("Please Enter Correct Amount ");
                    }
                }
            }
        }
    }

