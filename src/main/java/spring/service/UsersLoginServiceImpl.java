package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import spring.dao.UsersLoginDao;
import spring.model.User_login;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Damian Stępniak on 17.03.2017.
 */
@Service("usersLoginService")
@ComponentScan(value = "spring.dao")
@Transactional
public class UsersLoginServiceImpl implements UsersLoginService{

    @Autowired
    private UsersLoginDao usersLoginDao;

    @Override
    public List<User_login> getAll() {
       return usersLoginDao.getAll();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void delete(User_login user_login) {

    }

    @Override
    public User_login get(int id) {
        return null;
    }

    @Override
    public void update(User_login user_login) {

    }

    @Override
    public User_login save(User_login user_login) {
       return usersLoginDao.save(user_login);
    }
}
