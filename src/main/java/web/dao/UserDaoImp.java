package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

//    @PersistenceContext
    @Autowired
    private EntityManagerFactory emf;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {
        EntityManager entityManager = null;
        try {
            entityManager = emf.createEntityManager();
            String hql = "from User";
            Query query = entityManager.createQuery(hql, User.class);
            return query.getResultList();
        }
        finally {
            entityManager.close();
        }
    }

    @Override
    public void addUser(User user) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void updateUser(User user) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void removeUser(int id) {
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(User.class, id));
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public User getUserById(int id) {
        EntityManager entityManager = null;
        try {
            entityManager = emf.createEntityManager();
            return entityManager.find(User.class, id);
        }
        finally {
            entityManager.close();
        }
    }
}
