package com.example.demo.services;

import com.example.demo.models.Entretien;

import java.util.List;
import java.util.Optional;

public interface EntretienInterface {



    Entretien createEntretien(  Entretien entretien);
    Entretien updateEntretien(Integer Id, Entretien entretien);
    List<Entretien> getListEntretien();
    Optional<Entretien> getById(Integer Id);
    void deleteEntretien(Integer Id);
}
