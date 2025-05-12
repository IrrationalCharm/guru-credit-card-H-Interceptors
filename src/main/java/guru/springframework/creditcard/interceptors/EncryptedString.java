package guru.springframework.creditcard.interceptors;

import org.hibernate.tool.schema.TargetType;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface EncryptedString {
}
