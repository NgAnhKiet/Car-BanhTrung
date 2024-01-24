package com.example.banhtrung.repository;

import com.example.banhtrung.model.Cake;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CakeRepository {
    List<Cake> cakeList = new ArrayList<>();
    public CakeRepository(){
        Cake cake1 = new Cake(1,"Bánh trưng","Nhân thịt","Mặn",30000,true);
        Cake cake2 = new Cake(2,"Bánh trưng","Nhân đỗ","Ngọt",30000,true);
        Cake cake3 = new Cake(3,"Bánh trưng","Nhân hoa quả","Ngọt",30000,true);
        Cake cake4 = new Cake(4,"Bánh trưng","Nhân cơ hội","?",30000,true);

        cakeList.add(cake1);
        cakeList.add(cake2);
        cakeList.add(cake3);
        cakeList.add(cake4);
    }

    public List<Cake> getCakeList (){
        return cakeList;
    }

    public void addNewCake (Cake cake){
        cakeList.add(cake);
    }

    public Cake getCakeById(int id) {
        for (Cake cake: cakeList) {
            if (cake.getId() == id) {
                return cake;
            }
        }
        return null;
    }

    public void updateCake(Cake cake) {
        Cake cakeEdit = getCakeById(cake.getId());
        cakeEdit.setName(cake.getName());
        cakeEdit.setDetails(cakeEdit.getDetails());
        cakeEdit.setType(cake.getType());
        cakeEdit.setPrice(cakeEdit.getPrice());
        cakeEdit.setStatus(cake.isStatus());
    }

}
