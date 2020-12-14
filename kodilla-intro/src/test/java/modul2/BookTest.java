package modul2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void of() {
        //Given
         String author = "KK";
         String title = "Title";

        //When
        Book testBook = Book.of(author, title);

        //Then

    }
}