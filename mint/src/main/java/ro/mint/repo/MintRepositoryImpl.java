package ro.mint.repo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class MintRepositoryImpl<T extends Object> implements MintRepository {
    private T entity;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Object entity) {
        entityManager.persist(entity);
    }
}
