package com.example.demo.repositories;

import com.example.demo.models.Entretien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EntretienRepository   extends JpaRepository<Entretien, Integer> {



    Optional<Entretien> findById(Integer id);




    //8alta
}
