package encryption_exercise.encryption_methods.encrypte;

import encryption_exercise.encryption_factory.EncryptionFactory;
import encryption_exercise.encryption_methods.encrypt_interface.IEncryption;

public class Encrypt {

    private EncryptionFactory encryptionFactory;

    public Encrypt(){
        this.encryptionFactory = new EncryptionFactory();
    }

    public String encrypt(String encryptionMethodName, String password, int key) {
        return encryptionFactory.getEncryption(encryptionMethodName).encrypt(password, key);
    }

    public void addEncryptionMethod(String encryptionMethodName, IEncryption iEncryption) {
        encryptionFactory.addEncryptionMethod(encryptionMethodName, iEncryption);
    }


}
