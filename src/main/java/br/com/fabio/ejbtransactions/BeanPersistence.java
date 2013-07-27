package br.com.fabio.ejbtransactions;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class BeanPersistence {

    @PersistenceContext
    private EntityManager em;

    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    public void save(Cidade cidade) {
        em.persist(cidade);
    }
}