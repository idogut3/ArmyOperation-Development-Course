package encryption_exercise.encryption_factory;

import encryption_exercise.encryption_methods.encrypt_interface.IEncryption;

import java.util.HashMap;

public class EncryptionFactory {
    HashMap<String, IEncryption> encryption = new HashMap<String, IEncryption>();


    public IEncryption getEncryption(String encryptionMethodName) {
        return encryption.get(encryptionMethodName);
    }

    public void addEncryptionMethod(String encryptionMethodName, IEncryption iEncryption) {
        encryption.put(encryptionMethodName, iEncryption);
    }

}
