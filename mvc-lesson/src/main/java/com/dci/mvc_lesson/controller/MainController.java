package com.dci.mvc_lesson.controller;

import com.dci.mvc_lesson.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String home(Model model){
        Student student1 = new Student(1,"Mihai","miahi@gmail.com",false);
        model.addAttribute("student",student1);

        return "home";
    }
}
