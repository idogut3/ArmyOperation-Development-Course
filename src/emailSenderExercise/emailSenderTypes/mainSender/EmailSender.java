package emailSenderExercise.emailSenderTypes.mainSender;

import emailSenderExercise.emailSenderTypes.senderInterface.ISendable;

public class EmailSender {
    private ISendable iSendAble;

    public EmailSender(ISendable iSendAble) {
        this.iSendAble = iSendAble;
    }

    public void send(String emailAddress, String message) {
        iSendAble.send(emailAddress, message);
    }
}
