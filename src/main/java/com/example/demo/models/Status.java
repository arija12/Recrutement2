package com.example.demo.models;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@DynamicInsert
@DynamicUpdate


public class Status implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private Integer id;
    private String status;


}
