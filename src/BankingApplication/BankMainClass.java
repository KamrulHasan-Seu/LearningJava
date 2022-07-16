package BankingApplication;

import java.util.Scanner;

public class BankMainClass {
    public static void main(String[] args) {
        CustomerModel customerModel =new CustomerModel();
        //Showing Menu
        Menu.showMenu();

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
                    customerModel.openAccount(openCustomerLength);
                    break;
                case 2:
                    System.out.println("==================================");
                    System.out.println("Enter Account No. you want to see...");
                    int accNo = sc.nextInt();
                    customerModel.showAccountInfo(accNo);
                    System.out.println("==================================");
                    break;
                case 3:
                    System.out.println("==================================");
                    customerModel.depositInAccount();
                    System.out.println("==================================");
                    break;
                case 4:
                    System.out.println("==================================");
                    customerModel.withdrawfromAccount();
                    System.out.println("==================================");
                    break;
                case 5:
                    System.out.println("==================================");
                    customerModel.showAllCustomerInfo();
                    System.out.println("==================================");
                    break;

                case 6:
                    System.out.println("Thank you Dear customer.See you soon....");
                    break;
            }
        }while(choice!=6);






//        System.out.println("How Many Customer you want to open?");
//        int openCustomerLength = sc.nextInt();
//
//        CustomerModel[] customerModels =new CustomerModel[openCustomerLength];
//
//        for(int i =0;i<openCustomerLength;i++){
//            customerModels[i] = new CustomerModel();
//            customerModels[i].openAccount();
//        }


    }
}
