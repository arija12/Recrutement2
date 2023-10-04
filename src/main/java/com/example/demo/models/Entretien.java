package com.example.demo.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "entretien")


public class Entretien implements Serializable  {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Integer id;
        private  String name ;
        private Date date;
        private String place;









}
