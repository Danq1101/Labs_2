package org.example.web.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.Student;
import org.example.repository.StudentsRepository;
import org.example.service.StudentsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentsController {

    private final StudentsService studentsService;


    @RequestMapping("/home/students")
    public void getInfo(
            @RequestParam("id") int id,
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("department") String department,
            @RequestParam("enrollment") String enrollment
            ){
    }


    @GetMapping("/home/students")
    public String home(Model model){
        List<Student> students =  studentsService.getAll();
        model.addAttribute("students", students);
        return "home";
    }

    @GetMapping("/home/students/delete")
    public String deleteStudentById(String id, Model model){
        int newId = Integer.parseInt(id);
        studentsService.deleteStudent(newId);
        List<Student> students =  studentsService.getAll();
        model.addAttribute("students", students);
        return "home";
    }

    @GetMapping("/home/students/create")
    public String createStudent(Student student, Model model){
        studentsService.createStudent(student);
        List<Student> students =  studentsService.getAll();
        model.addAttribute("students", students);
        return "home";
    }

    @GetMapping("/home/students/update")
    public String updateStudent(int id, String department, Model model){
        studentsService.updateStudent(id , department);
        List<Student> students =  studentsService.getAll();
        model.addAttribute("students", students);
        return "home";

    }

}
