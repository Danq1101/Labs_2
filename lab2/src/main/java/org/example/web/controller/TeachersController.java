package org.example.web.controller;

import lombok.RequiredArgsConstructor;
import org.example.models.Teacher;
import org.example.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TeachersController {

    private final TeacherService teacherService;

    @RequestMapping("/home/teachers")
    public String getInfo(
            @RequestParam(value = "date") String date,
            @RequestParam(value = "numberOfClass") Integer numberOfClass
    ){
        return "teachers";
    }

    @GetMapping("/home/teachers/find")
    public String findTeachers(@RequestParam String date, @RequestParam Integer numberOfClass, Model model){
        List<Teacher> teachers = teacherService.showTeachersByDateByClass(date, numberOfClass);
        model.addAttribute("teacherWork", teachers);
        List<Teacher> teachersNotWork = teacherService.showTeacherNotWorking(date);
        model.addAttribute("teachersNotWork", teachersNotWork);
        return "teachers";
    }


    @GetMapping("/home/teachers")
    public String home(){
        return "teachers";
    }

}
