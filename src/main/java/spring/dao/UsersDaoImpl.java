package spring.dao;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import spring.model.User;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Damian Stępniak on 14.03.2017.
 */

@Repository("usersDao")
@Transactional
public class UsersDaoImpl extends AbstractDao<User, Float> implements UsersDao{

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAll() {
        Criteria criteria = createEntityCriteria();
        return (List<User>) criteria.list();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }
}
