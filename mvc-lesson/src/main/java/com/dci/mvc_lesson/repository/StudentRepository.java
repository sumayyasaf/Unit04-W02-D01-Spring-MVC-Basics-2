package com.dci.mvc_lesson.repository;

import com.dci.mvc_lesson.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    List<Student> students = List.of(
            new Student(1,"Mihai","miahi@gmail.com",true),
            new Student(2,"Hasan","Aron@gmail.com",true),
            new Student(3,"Maryam","Maryam@gmail.com",true),
            new Student(4,"Marcel","Marcel@gmail.com",true)
    );

    public List<Student> findAll(){
        return students;
    }


    public Student findById(int id){
        return students.stream().filter(s->s.getId()==id).findFirst()
                .orElseThrow(()-> new RuntimeException("Student not found"));
    }

}
