package com.example.demo.beans;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String username ;
    private String password ;
    private String email ;
    private String role ;

    @OneToMany(mappedBy = "user")
    private List<Responce> responceList;


    @OneToMany(mappedBy = "user")
    private List<Diagnostic> diagnosticList;


    public User(){

    }
}
