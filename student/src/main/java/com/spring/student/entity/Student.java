package com.spring.student.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="Student_Name",nullable = false)
    private String studentName;
    @Column(name ="Student_Class")
    private String studentClass;

    @Column(name = "School_Name")
    private String schoolName;

    public Student(){

    }

    public Student(String studentName, String studentClass, String schoolName) {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.schoolName = schoolName;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    private String username;

}
