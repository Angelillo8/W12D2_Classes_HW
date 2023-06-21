import com.codeclan.example.Book;
import com.codeclan.example.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Kidnapped", "Robert Louis Stevenson", "Adventure");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Kidnapped", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Robert Louis Stevenson", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Adventure", book.getGenre());
    }
}
