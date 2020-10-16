package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class GamblingMachineTest {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineExamplesCorrect.csv", delimiter = ':')
    public void shouldReturnMatchedResultForCorrectValues(String testNumbers) throws InvalidNumbersException {
        Set<Integer> numbers = convertToSet(testNumbers);

        int checked = gamblingMachine.howManyWins(numbers);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineTooShortExample.csv", delimiter = ':')
    public void shouldReturnExceptionForTooShortSet(String testNumbers) {
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            Set<Integer> numbers = convertToSet(testNumbers);

            int checked = gamblingMachine.howManyWins(numbers);
        });

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineTooLongExample.csv", delimiter = ':')
    public void shouldReturnExceptionForTooLongSet(String testNumbers) {
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            Set<Integer> numbers = convertToSet(testNumbers);

            int checked = gamblingMachine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineZeroAndNegativeValues.csv", delimiter = ':')
    public void shouldReturnExceptionForZeroAndNegativeValue(String testNumbers) {
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            Set<Integer> numbers = convertToSet(testNumbers);

            int checked = gamblingMachine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineTooHighValues.csv", delimiter = ':')
    public void shouldReturnExceptionForTooHighValues(String testNumbers) {
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            Set<Integer> numbers = convertToSet(testNumbers);

            int checked = gamblingMachine.howManyWins(numbers);
        });
    }

    @Test
    public void shouldReturnExceptionForEmptyValues() {
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(Collections.emptySet()));
    }

    @Test
    public void shouldReturnExceptionForNullValues() {
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(null));
    }

    private Set<Integer> convertToSet(String testNumbers) {
        String[] stringNumbers = testNumbers.split(",");
        Set<Integer> result = new HashSet<>();
        for (String stringNumber : stringNumbers) {
            int number = Integer.parseInt(stringNumber.trim());
            result.add(number);
        }
        return result;
    }

}