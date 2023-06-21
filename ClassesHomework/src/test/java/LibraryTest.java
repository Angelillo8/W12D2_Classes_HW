import com.codeclan.example.Book;
import com.codeclan.example.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

        private Library library;


        @Before
        public void before() {
                Book book1 = new Book("Kidnapped", "Robert Louis Stevenson", "Adventure");
                Book book2 = new Book("Foundation", "Isaac Asimov", "Science Fiction");
                ArrayList<Book> booksForLibrary = new ArrayList<>();
                booksForLibrary.add(book1);
                booksForLibrary.add(book2);
                library = new Library(booksForLibrary);
        }

        @Test
        public void libraryHasBooks() {
                assertEquals(2, library.countBooks());
        }
        @Test
        public void libraryCanAddBook() {
                Book newBook = new Book("Pride and Prejudice", "Jane Austen", "Novel");
                library.addBook(newBook);
                assertEquals(3, library.countBooks());
        }
        @Test
        public void libraryHasCapacity() {
                Book newBook = new Book("Pride and Prejudice", "Jane Austen", "Novel");
                Book anotherNewBook = new Book("Don Quijote", "Miguel de Cervantes", "Novel");
                library.addBook(anotherNewBook);
                library.addBook(newBook);
                assertEquals(3, library.countBooks());
        }


}
