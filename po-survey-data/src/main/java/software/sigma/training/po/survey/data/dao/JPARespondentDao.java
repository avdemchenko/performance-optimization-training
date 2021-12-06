package software.sigma.training.po.survey.data.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import software.sigma.training.po.survey.data.domain.Respondent;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Transactional
@Repository
public class JPARespondentDao implements RespondentDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void save(Respondent respondent) {
        entityManager.persist(respondent);
    }
    
    @Override
    public void saveAll(Collection<Respondent> collection) {
        for (Respondent respondent : collection) {
            entityManager.persist(respondent);
        }
        
    }
    
    @Override
    public List<Respondent> getAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Respondent> criteriaQuery = cb.createQuery(Respondent.class);
        Root<Respondent> root = criteriaQuery.from(Respondent.class);
        criteriaQuery.select(root);
        Query query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }
    
}
