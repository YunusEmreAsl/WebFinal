package com.yunus.webfinal;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

//Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//DTO ==> validation
public class JqueryDto implements Serializable {

    //serileştirme
    public static final long serialVersionUID = 1L;

    // ID
    private Long id;

    // EMAIL
    @NotNull(message = "email addres yazmadınız")
    private String email;

    // PASSWORD
    @NotNull(message = "şifreyi girmediniz")
    private String password;

    private String firstName;

    // Sistem tarihi almak
    private Date createdDate;
}