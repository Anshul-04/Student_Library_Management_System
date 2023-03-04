package com.example.Student_Library_Management_System.Service;

import com.example.Student_Library_Management_System.DTOs.BookRequestDto;
import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Models.Book;
import com.example.Student_Library_Management_System.Repository.AuthorRepository;
import com.example.Student_Library_Management_System.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;

    public String addBook(BookRequestDto bookRequestDto){

        // I want to get the AuthorEntity, How can i get it?     ==> // First i will get Author Id

//        int authorId = book.getAuthor().getId();
         int authorId = bookRequestDto.getAuthorId();

        //Now i will be Fetching the Author Entity
        Author author = authorRepository.findById(authorId).get();


         // CONVERTER
        // We have created this entity so that we can save it in the DB
        Book book = new Book();

        // Basic ATtributes are being set from DTO to the Entity Layer
        book.setName(bookRequestDto.getName());
        book.setIssued(false);
        book.setGenre(bookRequestDto.getGenre());
        book.setPages(bookRequestDto.getPages());

        //Setting the Foreign key Attribute in child class
        book.setAuthor(author);

        // Now , We need to update the listOfBooks written in the parent class
        List<Book> currentBooksWritten = author.getBooksWritten();
        currentBooksWritten.add(book);
        author.setBooksWritten(currentBooksWritten);

        //Now the book is to be saved, but also author is alsoooo to be saved.

        //Why do we need to again save (updating) the author ?? bcz
        //because the author Entity has been updated....we need to resave/update it.

        authorRepository.save(author); //Date was modified

        //.save function works both as save function and as update function


        //bookRepo.save is not required : bcz it will be autocalled by cascading
        //effect

        return "Book Added successfully";

    }
}
