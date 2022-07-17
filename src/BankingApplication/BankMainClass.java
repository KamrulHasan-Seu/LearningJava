package BankingApplication;

import java.util.Scanner;

public class BankMainClass {
    public static void main(String[] args) {
        CustomerModel customerModel =new CustomerModel();
        BankingFunctionality bankingFunctionality = new BankingFunctionality();
        int choice;
        do {
            //Taking Menu Number from user
            Scanner sc = new Scanner(System.in);
            Menu.showMenu();
            System.out.println("\nEnter Option:");
             choice= sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("How Many Customer you want to open?");
                    int openCustomerLength = sc.nextInt();

                    for (int i=1;i<=openCustomerLength;i++){
                        System.out.println("Enter Account No");
                        int accountId = sc.nextInt();
                        System.out.println("Enter Customer Name");
                        String customerName = sc.next();
                        System.out.println("Enter Account Type");
                        String accountType = sc.next();
                        System.out.println("Enter Initial Balance");
                        long balance = sc.nextInt();

                        bankingFunctionality.openAccount(accountId,customerName,accountType,balance);
                    }

                    break;
                case 2:
                    System.out.println("==================================");
                    System.out.println("Enter Account No. you want to see...");
                    int accNo = sc.nextInt();
                    bankingFunctionality.showAccountInfo(accNo);
                    System.out.println("==================================");
                    break;
                case 3:
                    System.out.println("==================================");
                    System.out.println("Enter Your Account Number: ");
                    int accNoFromDeposit = sc.nextInt();
                    System.out.println("How Much Money you want to deposit: ");
                    long depositAmount = sc.nextInt();
                    bankingFunctionality.depositInAccount(accNoFromDeposit,depositAmount);
                    System.out.println("==================================");
                    break;
                case 4:
                    System.out.println("==================================");
                    System.out.println("Enter Your Account Number: ");
                    int accNoFromWithdrawn = sc.nextInt();
                    System.out.println("How Much Money you want to WithDraw: ");
                    long withdrawAmount=sc.nextLong();
                    bankingFunctionality.withdrawfromAccount(accNoFromWithdrawn,withdrawAmount);
                    System.out.println("==================================");
                    break;
                case 5:
                    System.out.println("==================================");
                    bankingFunctionality.showAllCustomerInfo();
                    System.out.println("==================================");
                    break;

                case 6:
                    System.out.println("Thank you Dear customer.See you soon....");
                    break;
            }
        }while(choice!=6);



    }
}
