package com.xworks.boot;

import com.xworks.dto.EmailEntity;
import com.xworks.dto.FertilizerEntity;
import com.xworks.dto.TravelEntity;
import com.xworks.repository.EmailRepositoryImpl;
import com.xworks.repository.FertilizerRepositoryImpl;
import com.xworks.repository.TravelRepository;
import com.xworks.repository.TravelRepositoryImpl;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
//        FertilizerEntity entity=new FertilizerEntity(1,"urea",2,1500, LocalDate.of(2022,2,1),LocalDate.of(2025,5,10));
//        FertilizerRepositoryImpl fertilizerRepository=new FertilizerRepositoryImpl();
//        Integer id=fertilizerRepository.save(entity);
//        System.out.println(id);
//        EmailEntity email=new EmailEntity("shreegandh@gmail.com","Shreegandh","lalu","interview","x-workz","success");
//        EmailRepositoryImpl repo=new EmailRepositoryImpl();
//       Integer id1= repo.save(email);
//        System.out.println(id1);
        TravelEntity travel=new TravelEntity("karnataka","ayodhya","5K","1200km","5days","Bus",LocalDate.of(2024,1,22),LocalDate.of(2024,1,25));
        TravelRepositoryImpl repository=new TravelRepositoryImpl();
        Integer id2=repository.save(travel);
        System.out.println(id2);
    }
}
