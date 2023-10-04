package com.example.demo.services;


import com.example.demo.models.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurInterface {


    Utilisateur createUtilisateur(Utilisateur utilisateur);

    Utilisateur updateUtilisateur(Integer Id, Utilisateur utilisateur);

    List<Utilisateur> getListUtilisateur();

    Optional<Utilisateur> getById(Integer Id);

    void deleteUtilisateur(Integer Id);

}








