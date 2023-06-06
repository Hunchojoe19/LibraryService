package huncho.com.LibraryApp.controller;

import huncho.com.LibraryApp.entity.Book;
import huncho.com.LibraryApp.entity.Library;
import huncho.com.LibraryApp.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/library")
public class LibraryController {
    @Autowired
    LibraryService libraryService;

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/add_library")
    public Library addLibrary(@RequestBody Library library){
       return libraryService.addLibrary(library);
    }
    @GetMapping("/get_library/{id}")
    public Library getLibrary(@PathVariable long id){

        Book book = restTemplate.getForObject("http://localhost:9090/api/v1/book/get_book/"+id, Book.class);
        Library library =  libraryService.findById(id);
        library.setBook(book);
        return library;
    }
}
