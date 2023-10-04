package com.example.demo.controllers;

import com.example.demo.models.Entretien;
import com.example.demo.services.EntretienService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/entretien")



public class EntretienController {




    @Autowired
    private EntretienService entretienService ;
    @PostMapping("/create-entretien")
    public Entretien create(@RequestBody Entretien entretien){
        return  entretienService.createEntretien(entretien);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Entretien> update(@PathVariable Integer id, @RequestBody Entretien entretien ) {
        return ResponseEntity.ok(entretienService.updateEntretien(id,entretien )); }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        entretienService.deleteEntretien(id);
    }

    @GetMapping("/find/{Id}")
    public Optional<Entretien> getById(@PathVariable Integer Id) {
        return entretienService.getById(Id); }


        @GetMapping("/List")
    public List<Entretien> getList() {
        List<Entretien> list = this.entretienService.getListEntretien();
        return list;}


    }


