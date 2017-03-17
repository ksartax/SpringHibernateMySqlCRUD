package spring.dao;

import spring.model.User;

import java.util.List;

/**
 * Created by Damian Stępniak on 14.03.2017.
 */
public interface UsersDao {

    public List<User> getAll();
    public void delete(int id);
    public void delete(User user);
    public User get(int id);
    public void update(User user);
    public User save(User user);

}
