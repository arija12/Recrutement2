package com.example.demo.services;
import com.example.demo.models.Utilisateur;
import com.example.demo.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class UtilisateurService implements UtilisateurInterface {




  @Autowired

   private UtilisateurRepository utilisateurRepository;

   @Override
    public Utilisateur createUtilisateur(Utilisateur utilisateur) {

        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur updateUtilisateur(Integer Id,Utilisateur utilisateur) {

        Utilisateur utilisateurtoupdate;
        utilisateurtoupdate= utilisateurRepository.getOne(Id);
        utilisateurtoupdate.setPassword(utilisateur.getPassword());
        utilisateurtoupdate.setEmail(utilisateur.getEmail());
        utilisateurtoupdate.setCv(utilisateur.getCv());
        utilisateurtoupdate.setExperience(utilisateur.getExperience());
      //  utilisateurtoupdate.setUserName(utilisateur.getUserName());
        utilisateurtoupdate.setJob(utilisateur.getJob());
        utilisateurtoupdate.setPhone(utilisateur.getPhone());
        utilisateurtoupdate.setSource(utilisateur.getPhone());
        utilisateurtoupdate.setStatus(utilisateur.getStatus());


        return utilisateurRepository.saveAndFlush(utilisateurtoupdate);
    }


    @Override
    public List<Utilisateur> getListUtilisateur() {

        List<Utilisateur> utilisateurList = utilisateurRepository.findAll();

        return utilisateurList;
    }


    @Override
    public Optional<Utilisateur> getById(Integer Id) {
        return utilisateurRepository.findById(Id);
    }


    @Override
    public void deleteUtilisateur(Integer Id) {
        Optional<Utilisateur> utilisateur = utilisateurRepository.findById(Id);
        utilisateurRepository.delete(utilisateur.get());
        return;

    }


}

