
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    private Connection conexao = null;
    private String driver = "org.postgresql.Driver";
    private String url = "jdbc:postgresql://localhost:5432/bdcooperativa";
    private String user = "postgres";
    private String pass = "root";
    
    public Connection getConnection() throws SQLException, ClassNotFoundException {        
        if(conexao == null){
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, pass);
        }
        return conexao;        
    }
    
    public PreparedStatement getPreparedStatement(String sql) throws SQLException, ClassNotFoundException{
        return getConnection().prepareStatement(sql);
    }
}

