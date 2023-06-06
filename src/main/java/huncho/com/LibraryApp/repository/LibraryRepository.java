package huncho.com.LibraryApp.repository;

import huncho.com.LibraryApp.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}
