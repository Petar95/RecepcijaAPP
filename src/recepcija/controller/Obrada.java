package recepcija.controller;

import recepcija.pomocno.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class Obrada<T> {

    private final Session session;

    public Obrada() {
        session = HibernateUtil.getSession();
    }

    public T save(T entitet) {
        session.beginTransaction();
        session.saveOrUpdate(entitet);
        session.getTransaction().commit();
        return entitet;
    }

    @Deprecated
    public List<T> createQuery(String hql) {
        Query q = session.createQuery(hql);
        return q.list();
    }

    public void delete(T entitet) {
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }

    public List<T> save(List<T> lista) {
        session.beginTransaction();
        lista.stream().forEach((entitet) -> {
            session.saveOrUpdate(entitet);
        });
        session.getTransaction().commit();
        return lista;
    }

}
