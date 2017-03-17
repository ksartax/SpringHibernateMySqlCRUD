package spring.dao;

import org.hibernate.Criteria;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import spring.model.User_login;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Damian Stępniak on 17.03.2017.
 */
@Repository("usersLoginDao")
@Transactional
public class UsersLoginDaoImpl extends AbstractDao<Integer, User_login> implements UsersLoginDao{

    @Override
    @SuppressWarnings("unchecked")
    public List<User_login> getAll() {
        Criteria criteria = createEntityCriteria();
        return (List<User_login>) criteria.list();
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
        persist(user_login);
        return user_login;
    }
}
