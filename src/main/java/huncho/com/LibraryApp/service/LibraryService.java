package huncho.com.LibraryApp.service;

import huncho.com.LibraryApp.entity.Library;
import org.springframework.stereotype.Service;

@Service
public interface LibraryService {
    public Library findById(long id);
    public Library addLibrary(Library library);
}
