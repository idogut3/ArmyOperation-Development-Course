package emailSenderExercise.emailSenderTypes;

import emailSenderExercise.emailSenderTypes.senderInterface.ISendAble;

public class SmptClientSend implements ISendAble {


    @Override
    public void send(String emailAddress, String message) {
        System.out.println("I am this message using SmptClientSender");
        System.out.println("To " + emailAddress + ", messege : " + message);
    }
}
