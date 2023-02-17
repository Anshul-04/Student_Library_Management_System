package com.example.Student_Library_Management_System.Repository;

import com.example.Student_Library_Management_System.Models.Student;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByEmail(String email); //there is inbuilt query but ,I have to define them
                                      // (I can only define for the attributes that i have in the class)

    //select * from student where country=India  ,Return of Entities
    List<Student> findByCountry(String country);
}
