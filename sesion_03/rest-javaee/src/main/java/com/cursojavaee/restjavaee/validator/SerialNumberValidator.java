package com.cursojavaee.restjavaee.validator;

import com.cursojavaee.restjavaee.annotation.SerialNumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class SerialNumberValidator implements ConstraintValidator<SerialNumber, String> {

    @Override
    public void initialize(SerialNumber serialNumber) {

    }

    @Override
    public boolean isValid(String serialNumber, ConstraintValidatorContext context) {
        String serialNumRegex = "^\\d{3}-\\d{3}";
        return Pattern.matches(serialNumRegex, serialNumber);
    }
}
