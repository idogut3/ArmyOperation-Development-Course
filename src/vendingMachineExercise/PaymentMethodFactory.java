package vendingMachineExercise;

import java.util.HashMap;

public class PaymentMethodFactory {
    private HashMap<String, IPaymentMethod> factory;

    public PaymentMethodFactory(){
        factory = new HashMap<String, IPaymentMethod>();
    }

    public void addPaymentMethod(String paymentMethod, IPaymentMethod iPaymentMethod){
        factory.put(paymentMethod, iPaymentMethod);
    }
    public IPaymentMethod getPaymentMethod(String paymentMethod){
        return factory.get(paymentMethod);
    }
}
