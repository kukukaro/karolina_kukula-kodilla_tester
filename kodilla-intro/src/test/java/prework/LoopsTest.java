package prework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static prework.Loops.returnArraySum;

class LoopsTest {

    @Test
    void shouldReturnArraySum() {
        //Given
        int[] oneToThree = {1, 2, 3};

        //When
        int sum = returnArraySum(oneToThree);

        //Then
        assertEquals(6, sum);
    }
}