
package br.com.cooperativa.bean;
import br.com.cooperativa.dao.FuncionarioDao;
import br.com.cooperativa.model.Funcionario;
import br.com.cooperativa.service.FacesMessages;
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
    private Funcionario funcionario;
    private FuncionarioDao funcionarioDao = new FuncionarioDao();
    private FacesMessages messages = new FacesMessages();
    
    public void prepararSalvar(){
        funcionario = new Funcionario();
        
    }
    
    public void salvar(){
        funcionarioDao.salvar(this.funcionario);
        messages.info("O funcionário foi salvo com sucesso!");
    }
    public List<Funcionario> getFuncionarios(){  
        return funcionarioDao.pesquisar("");
        
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    
}
