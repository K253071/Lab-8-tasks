package Lab08Task01;

import java.util.Scanner;
interface Payment {
    void processPayment();
}

class CreditCard implements Payment {
    @Override
    public void processPayment (){
        System.out.println("Payment completed through Credit card");
    }
}

class PayPal implements Payment {
    @Override
    public void processPayment (){
        System.out.println("Payment completed through PayPal");
    }
}

class BankTransfer implements Payment {
    @Override
    public void processPayment (){
        System.out.println("Payment completed through bank transfer");
    }
}

class Main {
    public static void main (String[] args){

        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a payment method: ");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Bank Transfer");
        System.out.println("Enter your choice (1-3): ");
        choice = sc.nextInt();

        Payment p = null;
        switch (choice) {
            case 1:
                p = new CreditCard();
                break;
            case 2:
                p = new PayPal();
                break;
            case 3:
                p = new BankTransfer();
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        p.processPayment();

    }
}
