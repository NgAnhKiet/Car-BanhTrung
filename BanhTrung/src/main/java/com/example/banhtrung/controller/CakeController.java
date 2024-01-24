package com.example.banhtrung.controller;

import com.example.banhtrung.model.Cake;
import com.example.banhtrung.service.CakeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cake")
public class CakeController {
    @Autowired
    public CakeService cakeService;
    @GetMapping("")
    public String home (Model model){
        List<Cake> cakeList = cakeService.getCakeList();
        model.addAttribute("cakeList", cakeList);
        return "/home";
    }

    @GetMapping("/add-cake")
    public String showFormAddCake(Model model){
        Cake cake = new Cake();
        model.addAttribute("cake", cake);
        return "/add";
    }

    @PostMapping("/add")
    public String addCake (@ModelAttribute Cake cake){
        cakeService.addNewCake(cake);
        return "redirect:/cake";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model){
        Cake cake = cakeService.getCakeById(id);
        model.addAttribute("cake", cake);
        return "/edit";
    }

    @PostMapping("/update")
    public String updateCake(@ModelAttribute Cake cake) {
        cakeService.updateCake(cake);
        return "redirect:/cake";
    }

}
