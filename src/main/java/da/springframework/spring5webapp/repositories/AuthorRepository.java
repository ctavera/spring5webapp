package da.springframework.spring5webapp.repositories;

import da.springframework.spring5webapp.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
