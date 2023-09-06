package com.spring.student.controller;

import com.spring.student.entity.Student;
import com.spring.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class StudentController {
    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @Autowired
    private StudentService studentService;

   /* @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudent());
        return "students";
    }*/

    @GetMapping("/students/add")
    public String createStudentForm(Model model){
        Student student =new Student();
        model.addAttribute("student",student);
        return "create_student";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
       studentService.saveStudent(student);
       return "redirect:/students";
    }
    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Integer id, Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Integer id,
    @ModelAttribute("student") Student student,
    Model model){
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setStudentName(student.getStudentName());
        existingStudent.setStudentClass(student.getStudentClass());
        existingStudent.setSchoolName(student.getSchoolName());

        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Integer id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }



}
