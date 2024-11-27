package com.example.demo.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "utilisateur")



public class Utilisateur  implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String metier;
    private String mobile;
    private String email;
    private Integer anneeExperience;
    private String nom;
    private String source;
    private String cv;
    private Status status;
    private String interviewDate;
    private String place;












}
