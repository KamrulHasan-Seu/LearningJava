package BankingApplication;

import java.util.*;

public class CustomerModel {
    private int accountId;
    private String customerName;
    private String accountType;
    private int balance;

    private Set<CustomerModel> accountList = new HashSet<>();
    //private static int count;
    Scanner sc =new Scanner(System.in);

    public CustomerModel(int accountId, String customerName, String accountType, int balance) {
        this.accountId = accountId;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public CustomerModel() {
    }

    //Open Account
    public void openAccount(int customerLength) {

        for (int i = 0; i < customerLength; i++) {
            System.out.println("Enter Account No");
            accountId = sc.nextInt();
            System.out.println("Enter Customer Name");
            customerName = sc.next();
            System.out.println("Enter Account Type");
            accountType = sc.next();
            System.out.println("Enter Initial Balance");
            balance = sc.nextInt();

            CustomerModel customerModel =new CustomerModel(accountId,customerName,accountType,balance);
            accountList.add(customerModel);
        }

    }

    //Show customer information
    public void showAllCustomerInfo(){
        for (CustomerModel customerModel : accountList) {
            System.out.println("Customer Account NO.: "+customerModel.accountId);
            System.out.println("Customer Name: "+customerModel.customerName);
            System.out.println("Account Type: "+customerModel.accountType);
            System.out.println("Balance : "+customerModel.balance);
        }

    }
//
    //show Single Account info
    public void showAccountInfo(int accountId){
        for (CustomerModel customerModel : accountList) {
            if(customerModel.accountId==accountId){
                System.out.println("Customer Account NO.: "+customerModel.accountId);
                System.out.println("Customer Name: "+customerModel.customerName);
                System.out.println("Account Type: "+customerModel.accountType);
                System.out.println("Balance : "+customerModel.balance);
            }
        }
    }

    //Deposit in account
    public void depositInAccount(){
        System.out.println("Enter Your Account Number: ");
        int accNo = sc.nextInt();
        int previousBalance;
        int depositAmount;
        for (CustomerModel customerModel : accountList) {
            if(customerModel.accountId==accNo){
                previousBalance = customerModel.balance;
                System.out.println("How Much Money you want to deposit: ");
                depositAmount = sc.nextInt();
                customerModel.balance = previousBalance+depositAmount;
                System.out.println("thanks!! Your Money "+ depositAmount+" Is deposited");
                System.out.println("Your Current Balance Is : "+customerModel.balance);
             }
        }
    }

    public void withdrawfromAccount() {
        System.out.println("Enter Your Account Number: ");
        int accNo = sc.nextInt();
        int withdrawAmount,previousBalance;
        for (CustomerModel customerModel : accountList) {
            if(customerModel.accountId==accNo){
                previousBalance = customerModel.balance;
                System.out.println("How Much Money you want to WithDraw: ");
                withdrawAmount = sc.nextInt();
                if(withdrawAmount>0&& withdrawAmount<=customerModel.balance) {
                    customerModel.balance = previousBalance - withdrawAmount;
                    System.out.println("thanks!! Your Money " + withdrawAmount + " Is Withdrawn");
                    System.out.println("Your Current Balance Is : "+customerModel.balance);
                }else{
                    System.out.println("Please Enter Correct Amount ");
                }
            }
        }
    }
}
