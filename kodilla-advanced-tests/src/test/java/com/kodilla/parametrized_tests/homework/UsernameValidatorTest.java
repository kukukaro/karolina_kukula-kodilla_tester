package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UsernameValidatorTest {

    UserValidator usernameValidator = new UserValidator();

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfStringIsEmpty(String text) {
        assertFalse(usernameValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings ={ "Ka", "."})
    public void shouldReturnFalseIfStringIsShorterThenThreeChar(String text) {
        assertFalse(usernameValidator.validateUsername(text));
    }
    @ParameterizedTest
    @ValueSource(strings ={ "%Ka", "!kolina", "GGG\"", "`Baron", "JpK@", "#007", "G^P", "C&I", "L*o", "+Kp" })
    public void shouldReturnFalseIfStringIsContainInvalidChar(String text) {
        assertFalse(usernameValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings ={ "Kar", "arek8_", "aa8", ".78", "---", "..."})
    public void shouldReturnTrueIfStringIsCorrect(String text) {
        assertTrue(usernameValidator.validateUsername(text));
    }
}