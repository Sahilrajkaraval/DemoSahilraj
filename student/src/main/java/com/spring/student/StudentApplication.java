package com.spring.student;

import com.spring.student.entity.Student;
import com.spring.student.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {
    public static void main(String[] args){
        SpringApplication.run(StudentApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
     /*Student student1 =new Student("Rahul", "10th", "SICD" );
     studentRepository.save(student1);
     Student student2 =new Student("Vishal", "10th", "SSKB" );
     studentRepository.save(student2);
     Student student3 =new Student("Sahil", "10th", "SICD" );
     studentRepository.save(student3);*/
    }
}
