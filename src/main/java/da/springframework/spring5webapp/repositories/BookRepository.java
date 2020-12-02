package da.springframework.spring5webapp.repositories;

import da.springframework.spring5webapp.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
