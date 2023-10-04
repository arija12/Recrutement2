package com.example.demo.controllers;



import com.example.demo.models.Utilisateur;
import com.example.demo.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/utilisateur")

public class UtilisateurController {

   @Autowired
    private UtilisateurService utilisateurService ;

    @PostMapping("/create-utilisateur")
    public Utilisateur create(@RequestBody Utilisateur utilisateur){
        return  utilisateurService.createUtilisateur(utilisateur);
    }

        @GetMapping("/get/{Id}")
   public Optional<Utilisateur> getById(@PathVariable Integer Id) {
        return utilisateurService.getById(Id); }

        @PutMapping("/update/{Id}")
    public ResponseEntity<Utilisateur> update(@PathVariable Integer Id, @RequestBody Utilisateur utilisateur ) {
        return ResponseEntity.ok(utilisateurService.updateUtilisateur(Id,utilisateur )); }


        @GetMapping("/getList")
    public List<Utilisateur> getList() {
        List<Utilisateur> list = this.utilisateurService.getListUtilisateur();
        return list;}
        @DeleteMapping("/delete/{Id}")
    public void delete(@PathVariable Integer Id){
            utilisateurService.deleteUtilisateur(Id);
         return;

    }


}
