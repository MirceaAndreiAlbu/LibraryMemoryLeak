package com.mircea.standalone;

import com.mircea.bean.Book;
import com.mircea.website.LibraryService;

public class Library {
    public static final int librarySize = 100;

    public static void main(String[] args){
        while (true) {
            Book[] library = LibraryService.createLibrary(true);
            LibraryService.addLibraryToColection(library);
            LibraryService.rentBooksFromLibrary(library);
        }
    }


}
