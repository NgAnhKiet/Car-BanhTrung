package com.example.btontapspring231.controller;

import com.example.btontapspring231.model.Car;
import com.example.btontapspring231.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    public CarService carService;
    @GetMapping("")
    public String listCar(Model model){
        List<Car> carList = carService.getCarList();
        model.addAttribute("listCar", carList);
        return "/home";
    }

    @GetMapping("/add-car")
    public String showFormAddCar (Model model){
        Car car = new Car();
        model.addAttribute("car", car);
        return "/create";
    }

    @PostMapping("/create")
    public String createCar (@ModelAttribute Car car){
        carService.createCar(car);
        return "redirect:/car";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm (@PathVariable int id, Model model){
        Car car = carService.getCarById(id);
        model.addAttribute("car", car);
        return "/edit";
    }

    @PostMapping("/update")
    public String updateCar(@ModelAttribute Car car) {
        carService.updateCar(car);
        return "redirect:/car";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        Car car = carService.getCarById(id);
        model.addAttribute("car", car);
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Car car, RedirectAttributes redirect) {
        carService.remove(car.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customers";
    }
}
