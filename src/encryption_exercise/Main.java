package encryption_exercise;

import encryption_exercise.encryption_methods.CaesarEncrypt;
import encryption_exercise.encryption_methods.encrypte.Encrypt;
import encryption_exercise.encryption_methods.encrypt_interface.IEncryption;

import java.util.Scanner;

import static encryption_exercise.menu.EncryptionMenu.printInstructions;
import static encryption_exercise.menu.EncryptionMenu.printResult;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printInstructions();

        String message = scanner.next();
        int key = scanner.nextInt();
        String encryptionMethod = scanner.next();

        Encrypt encrypt = new Encrypt();
        IEncryption CaesarEncrypt = new CaesarEncrypt(key);
        encrypt.addEncryptionMethod("CaesarEncrypt", CaesarEncrypt);

        String result = encrypt.encrypt(encryptionMethod, message, key);
        printResult(result, encryptionMethod, message);
    }


}
