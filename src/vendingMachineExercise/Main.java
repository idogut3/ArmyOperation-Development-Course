package vendingMachineExercise;

import vendingMachineExercise.objects.Date;
import vendingMachineExercise.objects.Item;
import vendingMachineExercise.objects.paymentPlaces.VendingMachine;
import vendingMachineExercise.paymentMethods.CashPay;
import vendingMachineExercise.paymentMethods.CreditCardPay;

import java.util.Scanner;

public class Main {

    public static void printInstructions() {
        System.out.println("Hello and welcome to the vending machine");
        System.out.println("What would you like to order? (Enter Item id)");
        System.out.println("And then please enter your preferable payment method");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();
        Item item1 = new Item(10, "tapochips");
        Item item2 = new Item(5, "water");
        Item item3 = new Item(1000, "phone");
        vendingMachine.addItems(item1);
        vendingMachine.addItems(item2);
        vendingMachine.addItems(item3);

        Date creditCardExpirationDate = new Date(13, 12, 2025);
        final int cvv = 781;
        final String creditCardNumber = "729284";
        final int bankBalance = 100;
        CreditCardPay creditCardPay = new CreditCardPay(creditCardNumber, creditCardExpirationDate, cvv, bankBalance);

        final int cash = 90;
        CashPay cashPay = new CashPay(cash);

        vendingMachine.addPaymentMethod("CashPay", cashPay);
        vendingMachine.addPaymentMethod("CreditCardPay", creditCardPay);

        printInstructions();
        int itemId = scan.nextInt();
        String paymentMethod = scan.next();

        System.out.println("You bought " + vendingMachine.pay(itemId, paymentMethod));

    }

}
