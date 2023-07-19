package emailSenderExercise.emailSenderTypes.mainSender;

import emailSenderExercise.emailSenderTypes.senderInterface.ISendAble;

public class EmailSender {
    private ISendAble iSendAble;

    public EmailSender(ISendAble iSendAble) {
        this.iSendAble = iSendAble;
    }

    public void send(String emailAddress, String message) {
        iSendAble.send(emailAddress, message);
    }
}
