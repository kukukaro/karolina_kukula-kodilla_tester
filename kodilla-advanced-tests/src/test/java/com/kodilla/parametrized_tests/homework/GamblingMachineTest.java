package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingGameExamples.csv", delimiter = ':')
    public void shouldRetunMatchedResultForCorrectValues(String testNumbers) throws InvalidNumbersException {
        Set<Integer> numbers = convertToSet(testNumbers);

        int checked = gamblingMachine.howManyWins(numbers);
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