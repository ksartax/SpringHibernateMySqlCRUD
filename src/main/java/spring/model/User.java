package spring.model;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Damian Stępniak on 14.03.2017.
 */

@Entity
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private int id_user;

    @Size(min = 3, max = 250)
    @Column(nullable = true)
    private String firstName;

    @Size(min = 3, max = 250)
    @Column(nullable = true)
    private String lastName;

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate joiningData;

    //@OneToOne(cascade = CascadeType.ALL)
    private int id_login;

    //@OneToMany(cascade = CascadeType.ALL)
    //private List<User_contact> userContacts;

    //public List<User_contact> getUserContacts() {
       // return userContacts;
   // }

   // public void setUserContacts(List<User_contact> userContacts) {
       // this.userContacts = userContacts;
    //}

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    public int getId_user() {
        return id_user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
