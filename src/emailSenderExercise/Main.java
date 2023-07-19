package emailSenderExercise;

import emailSenderExercise.emailSenderTypes.MalikitClientSend;
import emailSenderExercise.emailSenderTypes.SmptClientSend;
import emailSenderExercise.emailSenderTypes.mainSender.EmailSender;

import java.util.Scanner;

public class Main {
    public static void printInstructions() {
        System.out.println("Hello and welcome to email sender");
        System.out.println("Please insert the message");
        System.out.println("Followed by the emailAddress");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printInstructions();
        String message = scan.next();
        String emailAddress = scan.next();
        MalikitClientSend malikitClientSend = new MalikitClientSend();
        SmptClientSend smptClientSend = new SmptClientSend();
        EmailSender emailSender = new EmailSender(smptClientSend);
        emailSender.send(emailAddress,message);
    }
}
