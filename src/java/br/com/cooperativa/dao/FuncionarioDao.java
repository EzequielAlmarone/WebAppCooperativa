package br.com.cooperativa.dao;

import br.com.cooperativa.model.Funcionario;
import br.com.cooperativa.util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author ezequiel
 */
public class FuncionarioDao {

    private EntityManager em;

    public FuncionarioDao() {
    }

    public FuncionarioDao(EntityManager em) {
        this.em = em;
    }

    public Funcionario porId(Integer id) {
        return em.find(Funcionario.class, id);
    }

    public List<Funcionario> pesquisar(String nome) {
        EntityManager em = new JPAUtil().getEntityManager();
        String sql = "from Funcionario where nome like :nome";
        TypedQuery<Funcionario> query = em.createQuery(sql, Funcionario.class);
        query.setParameter("nome", nome + "%");
        List<Funcionario> lista = query.getResultList();
        em.close();
        return lista;
    }

    public Funcionario salvar(Funcionario f) {
        return em.merge(f);
    }

    public void excluir(Funcionario f) {
        f = porId(f.getId());
        em.remove(f);
        
    }
}
