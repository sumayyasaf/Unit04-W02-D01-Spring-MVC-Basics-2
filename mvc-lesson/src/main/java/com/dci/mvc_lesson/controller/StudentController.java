package com.dci.mvc_lesson.controller;


import com.dci.mvc_lesson.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }




    @GetMapping
    public String students(Model model){


        model.addAttribute("students",studentRepository.findAll());

        return "students";
    }


    @GetMapping("/{studentId}")
    public String getOneStudent(@PathVariable("studentId") int id,Model model){
        System.out.println(id);

        model.addAttribute("student",studentRepository.findById(id));

        return "student-details";
    }


}
