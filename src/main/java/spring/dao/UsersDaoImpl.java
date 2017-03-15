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
public class UsersDaoImpl extends AbstractDao<Integer, User> implements UsersDao{

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
        return getByKey(id);
    }

    @Override
    public void update(User user) {
        User entity = get(user.getId_user());
        entity.setFirstName(user.getFirstName());
        entity.setLastName(user.getLastName());
    }
}
