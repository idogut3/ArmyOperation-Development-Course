package vendingMachineExercise;

import java.util.ArrayList;

public class VendingMachine {
    ArrayList<Item> items;
    PaymentMethodFactory factory;

    public VendingMachine() {
        items = new ArrayList<Item>();
        factory = new PaymentMethodFactory();
    }

    public Item pay(int id, String paymentMethod) {
        Item item = items.get(id);
        boolean isPaid = factory.getPaymentMethod(paymentMethod).pay(item.getPrice());
        if (isPaid) {
            return item;
        }
        return null;
    }

    public void addPaymentMethod(String paymentMethod, IPaymentMethod iPaymentMethod) {
        factory.addPaymentMethod(paymentMethod, iPaymentMethod);
    }

    public void addItems(Item item) {
        items.add(item);
    }
}
