
package br.com.cooperativa.bean;
import br.com.cooperativa.dao.FuncionarioDao;
import br.com.cooperativa.model.Funcionario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ezequiel
 */
@ManagedBean
@ViewScoped
public class FuncionarioBean implements Serializable{
    private FuncionarioDao funcionarioDao = new FuncionarioDao();
    
    public List<Funcionario> getFuncionarios(){  
        return funcionarioDao.pesquisar("");
        
    }
}
