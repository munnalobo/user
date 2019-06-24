package com.munna.ecommerce.user.modelsAndEntities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    @Email
    private String eMail;
    private String dateOfBirth;
    private String gender;
    @NotNull
    private String userName;
    @NotNull
    private String password;
//    @NotNull private Roles role;
}