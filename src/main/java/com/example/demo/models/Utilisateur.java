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
@Table(name = "utilisateur",uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email")
})


public class Utilisateur  implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private  String username;
    private String email;
    private String job;
    private String source;
   private Integer experience;
   private String phone;
    private String cv;
    private String password;
    private Status status;
    private Role role;




    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public Utilisateur(String email, String username, String encode) {
    }

    //8altaaa


    //8ALTA
}
