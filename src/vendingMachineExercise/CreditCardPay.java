package vendingMachineExercise;

public class CreditCardPay implements IPaymentMethod {
    private String creditCardNumber;
    private Date expirationDate;
    private int cvv;
    private double bankBalance;

    public CreditCardPay(String creditCardNumber, Date expirationDate, int cvv, double bankBalance) {
        this.creditCardNumber = creditCardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.bankBalance = bankBalance;
    }

    @Override
    public boolean isEnoughMoney(double price) {
        if (bankBalance - price < 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean pay(double price) {
        if (isEnoughMoney(price)) {
            this.bankBalance = bankBalance - price;
            System.out.println("Payed successfully");
            return true;
        }
        System.out.println("Cant pay for item not enough money in bank balance");
        return false;
    }


}
