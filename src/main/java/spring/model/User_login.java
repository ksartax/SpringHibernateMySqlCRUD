package spring.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Damian Stępniak on 14.03.2017.
 */

@Entity
public class User_login implements Serializable{

    @Id
   // @OneToOne(cascade = CascadeType.ALL)
    private int id_login;

    @NotNull
    private int password;

    @NotNull
    @Email
    private String email;

}
