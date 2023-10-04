package com.example.demo.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.spi.ToolProvider;


@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "roles")

public class Role implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;





}

