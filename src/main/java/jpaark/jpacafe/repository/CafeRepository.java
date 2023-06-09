package jpaark.jpacafe.repository;

import jpaark.jpacafe.domain.Cafe;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CafeRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Cafe cafe){
        em.persist(cafe);
    }

    public void delete(Cafe cafe) {
        em.remove(cafe);
    }

    // 기본키로 찾기
    public Cafe findOne(Long id) {
        return em.find(Cafe.class, id);
    }

    // 카페 이름으로 찾기
    public Cafe findByName(String name) {
        return em.find(Cafe.class, name);
    }

    // 카페 이름으로 찾기
    public List<Cafe> findListByName(String name) {
        return em.createQuery("select c from Cafe c where c.name = :name", Cafe.class)
                .setParameter("name", name)
                .getResultList();
    }

    // 존재하는 모든 카페 검색
    public List<Cafe> findAll() {
        return em.createQuery("select c from Cafe c", Cafe.class)
                .getResultList();
    }

    public List<Cafe> searchCafe(String keyword) {
        return em.createQuery("SELECT c FROM Cafe c WHERE c.name LIKE CONCAT('%', :keyword, '%')", Cafe.class)
                .setParameter("keyword", keyword)
                .getResultList();
    }

}
