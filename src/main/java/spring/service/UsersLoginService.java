package spring.service;

import spring.model.User_login;

import java.util.List;

/**
 * Created by Damian Stępniak on 17.03.2017.
 */
public interface UsersLoginService {

    public List<User_login> getAll();
    public void delete(int id);
    public void delete(User_login user_login);
    public User_login get(int id);
    public void update(User_login user_login);
    public User_login save(User_login user_login);

}
