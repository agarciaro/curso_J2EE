package com.cursojavaee.restjavaee.annotation;

import com.cursojavaee.restjavaee.validator.SerialNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {SerialNumberValidator.class})
public @interface SerialNumber {
    String message() default "Número de serie inválido";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
