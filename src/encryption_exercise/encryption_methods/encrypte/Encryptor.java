package encryption_exercise.encryption_methods.encrypte;

import encryption_exercise.encryption_factory.EncryptionFactory;
import encryption_exercise.encryption_methods.encrypt_interface.IEncryption;

public class Encryptor {

    private EncryptionFactory encryptionFactory;

    public Encryptor(){
        this.encryptionFactory = new EncryptionFactory();
    }

    public String encrypt(String encryptionMethodName, String password, int key) {
        return encryptionFactory.getEncryption(encryptionMethodName).encrypt(password);
    }

    public void addEncryptionMethod(String encryptionMethodName, IEncryption iEncryption) {
        encryptionFactory.addEncryptionMethod(encryptionMethodName, iEncryption);
    }


}
