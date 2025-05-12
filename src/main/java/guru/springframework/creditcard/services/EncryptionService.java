package guru.springframework.creditcard.services;

public interface EncryptionService {

    String encrpyt(String freeText);

    String decrypt(String encryptedText);
}
