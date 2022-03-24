package org.acme;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidEntityValidator implements ConstraintValidator<ValidEntity, Entity> {

    @Inject
    PotatoConfig config;

    @Override
    public boolean isValid(Entity value, ConstraintValidatorContext context) {
        context.disableDefaultConstraintViolation();
        return config.test().isBlank();
    }
}
