package com.example.Student_Library_Management_System.Service;

import com.example.Student_Library_Management_System.DTOs.AuthorEntryDto;
import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(AuthorEntryDto authorEntryDto){
        // Important step is : in the parameter the object is of type DTO
        // but the repository only  interacts with entites.

        // Solution : Convert authorEntryDto ---> into Author(entity)

        // Create an object of type Author
        Author author = new Author();

        // This is basically we are making a Converter
        // We are setting its attributes so that we can save correct value in DB.

        author.setName(authorEntryDto.getName());
        author.setCountry(authorEntryDto.getCountry());
        author.setAge(authorEntryDto.getAge());
        author.setRating(authorEntryDto.getRating());

        authorRepository.save(author);

        return  "Author added successfully.";
    }
}
