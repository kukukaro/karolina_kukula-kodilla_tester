package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonData#provideWeightAndHeightDataForBMITest")
    public void shouldReturnCorrectBMIMessage(String expected, double weight, double heightInMeters) throws InvalidNumbersException {
        Person person = new Person(heightInMeters, weight);
        assertEquals(expected, person.getBMI());
    }

}