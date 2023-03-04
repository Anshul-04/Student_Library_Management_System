package com.example.Student_Library_Management_System.Models;

import com.example.Student_Library_Management_System.ENUMS.TranscationStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "transcations")
public class Transcations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private TranscationStatus transcationStatus;

    private int fine;
    private String transcationId = UUID.randomUUID().toString();  //shareable txn ID

    @CreationTimestamp
    private Date transcationDate;

    private boolean isIssuedOperation;


     // { Doing UNIDIRECTIONAL MAPPING }
    // transcation is child wrt Book
    @ManyToOne
    @JoinColumn
    private Book book;  //primary key of Book entity is come here and become the Foreign key

    // transcation is also child wrt Card
    @ManyToOne
    @JoinColumn
    private Card card;   //primary key of Card entity is come here and become the Foreign key

    public Transcations() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TranscationStatus getTranscationStatus() {
        return transcationStatus;
    }

    public void setTranscationStatus(TranscationStatus transcationStatus) {
        this.transcationStatus = transcationStatus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public String getTranscationId() {
        return transcationId;
    }

    public void setTranscationId(String transcationId) {
        this.transcationId = transcationId;
    }

    public Date getTranscationDate() {
        return transcationDate;
    }

    public void setTranscationDate(Date transcationDate) {
        this.transcationDate = transcationDate;
    }

    public boolean isIssuedOperation() {
        return isIssuedOperation;
    }

    public void setIssuedOperation(boolean issuedOperation) {
        isIssuedOperation = issuedOperation;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
