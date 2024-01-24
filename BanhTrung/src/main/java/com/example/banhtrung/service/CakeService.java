package com.example.banhtrung.service;

import com.example.banhtrung.model.Cake;
import com.example.banhtrung.repository.CakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeService {
    @Autowired
    private CakeRepository cakeRepository;

    public List<Cake> getCakeList (){
        return cakeRepository.getCakeList();
    }

    public void addNewCake (Cake cake){
        cakeRepository.addNewCake(cake);
    }

    public Cake getCakeById(int id) {
        return cakeRepository.getCakeById(id);
    }

    public void updateCake(Cake cake){
        cakeRepository.updateCake(cake);
    }
}
