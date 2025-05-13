package guru.springframework.creditcard.domain;

import guru.springframework.creditcard.config.SpringContextHelper;
import guru.springframework.creditcard.services.EncryptionService;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class CreditCardConverter implements AttributeConverter<String,String> {
    @Override
    public String convertToDatabaseColumn(String s) {
        return getEncryptionService().encrypt(s);
    }

    @Override
    public String convertToEntityAttribute(String s) {
        return getEncryptionService().decrypt(s);
    }

    private EncryptionService getEncryptionService() {
        return SpringContextHelper.getApplicationContext().getBean(EncryptionService.class);
    }
}
