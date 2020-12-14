package prework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static prework.LeapYear.isLeap;
import static prework.LeapYear.isLeap2;

public class LeapYear2Test {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        int year = 1600;

        //when
        boolean isLeapYear = isLeap2(year);

        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4() {

        //given
        int year = 2020;

        //when
        boolean isLeapYear = isLeap2(year);

        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfDivisibleBy100() {

        //given
        int year = 1900;

        //when
        boolean isLeapYear = isLeap2(year);

        //then
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfIsNotDivisibleBy4() {

        //given
        int year = 1903;

        //when
        boolean isLeapYear = isLeap2(year);

        //then
        assertFalse(isLeapYear);
    }
}
