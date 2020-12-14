package modul2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GradesTest {


    @Test
    void add() {
        //Given
        Grades grades = new Grades();

        //When
        grades.add(5);

        //Then
        assertEquals(5, grades.returnLastValue());
    }

    @Test
    void returnLastValue() {
        //Given
        Grades grades = new Grades();

        //When
        grades.add(12);

        //Then
        assertEquals(12, grades.returnLastValue());
    }

    @Test
    void returnAverageOfValues() {
        //Given
        Grades grades = new Grades();

        //When
        grades.add(5);
        grades.add(3);
        grades.add(1);

        //Then
        assertEquals(3, grades.returnAverageOfValues());
    }
}