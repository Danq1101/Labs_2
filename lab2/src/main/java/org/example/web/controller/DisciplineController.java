package org.example.web.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.DisciplineService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class DisciplineController {

    private final DisciplineService disciplineService;

    @RequestMapping("/home/disciplines")
    public String getDiscipline(
            @RequestParam(value = "numberOfPairs") Integer numberOfPairs,
            @RequestParam(value = "numberOfClass") Integer numberOfClass
    ){
        return "disciplines";
    }


    @GetMapping("/home/disciplines/find")
    public String findDiscipline(Integer numberOfPairs, Integer numberOfClass, Model model){
        String res = disciplineService.showDateByNumberOfClass(numberOfClass);
        model.addAttribute("DateByClass", res);
        res = disciplineService.showDateByNumberOfPairs(numberOfPairs);
        model.addAttribute("DateByPairs", res);
        return "disciplines";
    }

    @GetMapping("/home/disciplines")
    public String home(){
        return "disciplines";
    }

}
