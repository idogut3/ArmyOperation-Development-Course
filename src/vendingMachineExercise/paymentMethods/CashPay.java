package vendingMachineExercise.paymentMethods;

import vendingMachineExercise.paymentMethods.paymentMethodInterface.IPaymentMethod;

public class CashPay implements IPaymentMethod {
    private double cash;

    public CashPay(double cash) {
        this.cash = cash;
    }

    @Override
    public boolean isEnoughMoney(double price) {
        if (cash - price < 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean pay(double price) {
        if (isEnoughMoney(price)) {
            this.cash = cash - price;
            System.out.println("Payed successfully");
            return true;
        }
        System.out.println("Cant pay for item not enough money in bank balance");
        return false;
    }
}
