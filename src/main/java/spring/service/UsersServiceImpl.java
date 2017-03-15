package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import spring.dao.UsersDao;
import spring.dao.UsersDaoImpl;
import spring.model.User;


import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Damian Stępniak on 14.03.2017.
 */

@Service("usersService")
@ComponentScan(value = "spring.dao")
@Transactional
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersDao usersDao;

    @Override
    public List<User> getAll()
    {
        return usersDao.getAll();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User get(int id) {
        return usersDao.get(id);
    }

    @Override
    public User update(User user) {
        return null;
    }
}
