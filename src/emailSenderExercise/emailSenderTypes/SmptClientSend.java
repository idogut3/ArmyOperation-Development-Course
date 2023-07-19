package emailSenderExercise.emailSenderTypes;

import emailSenderExercise.emailSenderTypes.senderInterface.ISendable;

public class SmptClientSend implements ISendable {


    @Override
    public void send(String emailAddress, String message) {
        System.out.println("I am this message using SmptClientSender");
        System.out.println("To " + emailAddress + ", messege : " + message);
    }
}
