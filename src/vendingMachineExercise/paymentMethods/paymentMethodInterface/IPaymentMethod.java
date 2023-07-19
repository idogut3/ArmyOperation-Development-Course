package vendingMachineExercise.paymentMethods.paymentMethodInterface;

public interface IPaymentMethod {
    public boolean pay(double price);

    public boolean isEnoughMoney(double price);
}