package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    UserValidator usernameValidator = new UserValidator();

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfStringIsEmpty(String text) {
        System.out.println("|" + text);
        assertFalse(usernameValidator.validateEmail(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"@karolina", "karolinakukula", "karolina@"})
    public void shouldReturnFalseIfSomePartIsMissing(String text) {
        assertFalse(usernameValidator.validateEmail(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"!karo@gmail.com", "karo,kukula@gmail.com", "karokuku@@gmail.com", "Karo@gmail,com", "kar4.ku4@kar3.p4"})
    public void shouldReturnFalseIfStringHasInvalidChar(String text) {
        assertFalse(usernameValidator.validateEmail(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1karolina.kukula@gmai.c", "Karo9@a.c", "kar4.ku4@kar3.p"})
    public void shouldReturnTrueIfStringIsCorrect(String text) {
        assertTrue(usernameValidator.validateEmail(text));
    }

}