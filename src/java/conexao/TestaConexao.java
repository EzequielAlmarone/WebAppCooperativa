
package conexao;

import br.com.cooperativa.model.Funcionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        
        Funcionario f = new Funcionario();
        f.setNome("Marcos Rogerio Ferreira");
        
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("cooperativa");
        EntityManager em = emf.createEntityManager();
        List<Funcionario> lista = em.createQuery("from Funcionario", Funcionario.class).getResultList();
        
        for(Funcionario funcionario : lista){
            System.out.println("Funcionario.:"+funcionario.getNome());
        }
//        em.getTransaction().begin();
//        
//        em.persist(f);
//        
//        em.getTransaction().commit();
        em.close();
        emf.close();
        
        
//        Connection conexao = Conexao.getConnection();        
//        PreparedStatement stmt;
//        
//        String nome = "Nando Reis";
//        String RG = "";
//        String CPF = "";
//        String telefone = "";
//        
//        String sql = "INSERT INTO cooperado "
//                + "(nome, rg, cpf, telefone)" 
//                + "VALUES (?, ?, ?, ?)";
//        
//        stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//        stmt.setString(1, nome);
//        stmt.setString(2, RG);
//        stmt.setString(3, CPF);
//        stmt.setString(4, telefone);        
//        stmt.execute(); 
//        
//        ResultSet rs = stmt.getGeneratedKeys();
//        rs.next();
//        int id = rs.getInt("id");
//        System.out.println("ID gerado..: "+id);
//        
//        stmt.close();
//        conexao.close();
//        
        /*
        String sql = "select * from cooperado";
        String sql2 = "insert into cooperado";
        //boolean resultado = conexao.createStatement().execute(sql);
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);
        ResultSet lista = stmt.getResultSet();
        while(lista.next()){
            int id = lista.getInt("id");
            String nome = lista.getString("nome");      
        
            System.out.println("ID......: "+id);
            System.out.println("Nome....: "+nome);
        }
        
        stmt.close();
        lista.close();
        conexao.close();*/        
    }
}

