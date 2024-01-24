package com.example.btontapspring231.service;

import com.example.btontapspring231.model.Car;
import com.example.btontapspring231.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class CarService {
    @Autowired
    public CarRepository carRepository;
    public List<Car> getCarList(){
        return carRepository.getCarList();
    }

    public void createCar(Car car){
        carRepository.createCar(car);
    }
    public Car getCarById(int id) {
        return carRepository.getCarById(id);
    }

    public void updateCar(Car car){
        carRepository.updateCar(car);
    }

    public void remove(int id) {
        carRepository.remove(id);
    }

}
