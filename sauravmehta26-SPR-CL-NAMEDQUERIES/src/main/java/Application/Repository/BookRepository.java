package Application.Repository;

import Application.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findBookByIsbn(long isbn);

    List<Book> findBooksByAuthor(String author);

    List<Book> findBooksByAuthorAndDateAdded(String author, Timestamp dateAdded);

    Book findBookByTitle(String title);

    List<Book> findBooksByAvailable(boolean available);

    List<Book> findBooksByDateAddedOrLastDateWithdrawn(Timestamp dateAdded, Timestamp lastDateWithdrawn);
}