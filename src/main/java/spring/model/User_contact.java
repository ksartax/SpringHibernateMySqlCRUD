package spring.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Damian Stępniak on 14.03.2017.
 */

@Entity
public class User_contact implements Serializable{

    //@OneToMany(fetch = FetchType.LAZY)
    //private int id_user;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_user_contact;

}
