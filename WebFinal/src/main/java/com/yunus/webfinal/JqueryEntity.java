package com.yunus.webfinal;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

//lombok
@Data
@NoArgsConstructor

//Entity
@Entity
@Table(name = "jquery")
public class JqueryEntity implements Serializable{
    //serileştirme
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    private String firstName;

    @Column(name = "email")
    private String email;

    @Column(name = "password", columnDefinition = "varchar(255) default 'Hm123456@'")
    private String password;
}