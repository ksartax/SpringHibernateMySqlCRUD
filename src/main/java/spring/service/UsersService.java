package spring.service;

import spring.model.User;

import java.util.List;

/**
 * Created by Damian Stępniak on 14.03.2017.
 */
public interface UsersService {

    List<User> getAll();
    public void delete(int id);
    public void delete(User user);
    public User get(int id);
    public User update(User user);

}
