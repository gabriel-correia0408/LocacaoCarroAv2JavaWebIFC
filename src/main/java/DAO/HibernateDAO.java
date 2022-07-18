package DAO;

import Database.DbConfig;
import Models.BaseEntity;
import org.hibernate.Session;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;

public abstract class HibernateDAO<E extends BaseEntity> {

    protected abstract Class<E> getEntityClass();

    public E getBydId(int id) {
        Session session = getSession();
        return session.find(getEntityClass(), id);
    }

    public List<E> getAll() {
        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<E> criteria = builder.createQuery(getEntityClass());
        criteria.from(getEntityClass());
        return session.createQuery(criteria).getResultList();
    }
    
    public void insert(E entity) {
        Session session = getSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }

    public void delete(E entity) {
        Session session = getSession();

    }

    public void update(E entity) {
        Session session = getSession();

    }

    protected Session getSession() {
        return DbConfig.getSession();
    }
}