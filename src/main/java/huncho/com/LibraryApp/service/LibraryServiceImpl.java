package huncho.com.LibraryApp.service;

import huncho.com.LibraryApp.entity.Library;
import huncho.com.LibraryApp.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    LibraryRepository libraryRepository;
    @Override
    public Library findById(long id) {
        return libraryRepository.findById(id).get();
    }

    @Override
    public Library addLibrary(Library library) {
        return libraryRepository.save(library);
    }
}
