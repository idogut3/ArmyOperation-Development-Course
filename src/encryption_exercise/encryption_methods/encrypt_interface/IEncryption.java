package encryption_exercise.encryption_methods.encrypt_interface;

public interface IEncryption {

    public String encrypt(String message);

    public boolean isEncryptingNeeded(String message);
}
