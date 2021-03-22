package ImageHoster.repository;

import ImageHoster.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class UserRepository {
    @PersistenceUnit(unitName = "imageHoster1")
    private EntityManagerFactory entityManagerFactory;

    public void registerUser(User newUser) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(newUser);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
    }


    public User checkUser(String username, String password) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            TypedQuery<User> typedQuery = entityManager.createQuery("SELECT u FROM User u WHERE u.username = :username AND u.password = :password", User.class);
            typedQuery.setParameter("username", username);
            typedQuery.setParameter("password", password);

            return typedQuery.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}