package com.example.Student_Library_Management_System.Service;

import com.example.Student_Library_Management_System.DTOs.IssueBookRequestDto;
import com.example.Student_Library_Management_System.Repository.TranscationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranscationService {

    @Autowired
    TranscationRepository transcationRepository;

    public String issueBook(IssueBookRequestDto issueBookRequestDto){

        return "Book Issued.";

    }
}
