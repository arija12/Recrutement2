package com.example.demo.services;


import com.example.demo.models.Entretien;
import com.example.demo.repositories.EntretienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EntretienService  implements EntretienInterface{

    @Autowired
    private EntretienRepository entretienRepository;


    @Override
    public Entretien createEntretien(Entretien entretien) {
        return entretienRepository.save(entretien);
    }

    @Override
    public Entretien updateEntretien(Integer Id, Entretien entretien) {

        Entretien entretientoupdate;

        entretientoupdate= entretienRepository.getOne(Id);

        entretientoupdate.setPlace(entretien.getPlace());
        entretientoupdate.setDate(entretien.getDate());
        entretientoupdate.setName(entretien.getName());
        return entretienRepository.saveAndFlush(entretientoupdate);
    }

    @Override
    public List<Entretien> getListEntretien() {
        List<Entretien> entretienList = entretienRepository.findAll();

        return entretienList;
    }



    @Override
    public Optional<Entretien> getById(Integer Id) {
        return entretienRepository.findById(Id);
    }

    @Override
    public void deleteEntretien(Integer Id) {

        Optional <Entretien> entretien = entretienRepository.findById(Id);
        entretienRepository.delete(entretien.get());
        return;

    }
}
