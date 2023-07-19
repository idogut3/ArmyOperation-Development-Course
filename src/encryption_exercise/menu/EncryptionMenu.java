package encryption_exercise.menu;

public class EncryptionMenu {
    public static void printInstructions() {
        System.out.println("Hello and welcome to the encryption system");
        System.out.println("Please enter the message you want to encrypt with followed by the key");
        System.out.println("And now please type which encryption method do you want for your password");
    }

    public static void printResult(String messageEncrypted, String encryptionMethod , String beforeEncryption) {
        System.out.println("You have encrypted : " + beforeEncryption);
        System.out.println("The encryption method : " + encryptionMethod);
        System.out.println("The result : " + messageEncrypted);
    }
}
