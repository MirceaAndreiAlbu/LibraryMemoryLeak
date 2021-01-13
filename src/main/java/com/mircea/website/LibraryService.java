package com.mircea.website;

import com.mircea.bean.Author;
import com.mircea.bean.Book;
import com.mircea.bean.BookLeak;
import com.mircea.standalone.Library;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class LibraryService {
    public static Map<Book, Long> libraryShelf = new HashMap<>();
    private static Author[] authors;
    public synchronized static Book[] createLibrary(boolean withMemoryLeak) {
        Book[] library = new Book[Library.librarySize];
        for (int j = 0; j < library.length - 1; j++) {
            library[j] = new Book();
        }
        if(withMemoryLeak) {
            library[library.length - 1] = new BookLeak();
        }
        return library;
    }

    public synchronized static void addLibraryToColection(Book[] library) {
        for (int j = 0; j < library.length; j++) {
            libraryShelf.put(library[j], new Random().nextLong());
        }
    }

    public synchronized static void rentBooksFromLibrary(Book[] library) {
        for (int j = 0; j < library.length - 1; j++) {
            libraryShelf.remove(library[j]);
        }
    }

    @GetMapping("/rentBookLeak")
    public String rentBookLeak() {
        Book[] library = LibraryService.createLibrary(true);
        LibraryService.addLibraryToColection(library);
        LibraryService.rentBooksFromLibrary(library);
        return "BookLeak rented";
    }

    @GetMapping("/listAuthors")
    public String listAuthors() {
        authors = new Author[100000];
        for(int i = 0; i < authors.length; i++){
            authors[i] = new Author();
        }
        return "Lorem ipsum of a lot of authors";
    }
}
