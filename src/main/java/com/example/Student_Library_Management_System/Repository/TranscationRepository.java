package com.example.Student_Library_Management_System.Repository;

import com.example.Student_Library_Management_System.Models.Transcations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranscationRepository extends JpaRepository<Transcations,Integer> {
}
