package encryption_exercise.encryption_methods;

import encryption_exercise.encryption_methods.encrypt_interface.IEncryption;

public class CaesarEncrypt implements IEncryption {
    private int key;

    public CaesarEncrypt(int key){
        this.key = key;
    }
    public boolean isEncryptingNeeded(String message) {
        return key != 0 && message.length() != 0;
    }

    @Override
    public String encrypt(String message) {
        String result = "";
        char currentLetter;

        if (!isEncryptingNeeded(message)) {
            return message;
        }

        for (int i = 0; i < message.length(); i++) { // Looping through the String letter by letter
            currentLetter = message.charAt(i); // Getting the current letter
            currentLetter += key; // Adding the key value in it
            result += currentLetter; // Adding it to our result
        }
        return result;
    }
}
