package com.example.btontapspring231.repository;

import com.example.btontapspring231.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {
    List<Car> carList = new ArrayList<>();

    public CarRepository(){
        Car car1 = new Car(1, "Roll Royce", "Roll Royce", 2300, "Roll Royce", true);
        Car car2 = new Car(2, "McLaren", "McLaren", 1700, "McLaren", true);
        Car car3 = new Car(3, "May Bach", "May Bach", 7200, "May Bach", true);
        Car car4 = new Car(4, "Ferrari", "Ferrari", 2100, "Ferrari", true);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
    }

    public List<Car> getCarList(){
        return carList;
    }
    public void createCar(Car car){
        carList.add(car);
    }

    public Car getCarById(int id) {
        for (Car car: carList) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    public void updateCar(Car car) {
        Car carEdit = getCarById(car.getId());
        carEdit.setName(car.getName());
        carEdit.setDetails(car.getDetails());
        carEdit.setPrice(car.getPrice());
        carEdit.setManufacturer(car.getManufacturer());
        carEdit.setStatus(car.isStatus());
    }
    public void remove(int id){
        Car carDelete = getCarById(id);
        carList.remove(carDelete);
    }
}
