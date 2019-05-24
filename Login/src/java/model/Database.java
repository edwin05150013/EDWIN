package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String username;
    private String password;
    private String url;
    private Connection conn;
    
    public Database(){
        this.username = "sa";
        this.password = "123";
        this.url = "jdbc:sqlserver://DESKTOP-12FVLNL\\SQLEXPRESS:1433;databaseName=biblioteca";
    }
    
    public String getUsername() { return username; }

    public String getPassword() { return password; }

    public String getUrl() { return url;}

    public Connection getConn() { return conn; }

    public void connect() throws SQLException,ClassNotFoundException{
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.conn = DriverManager.getConnection(this.getUrl(), this.getUsername(), this.getPassword());
        }catch(SQLException se){
            System.out.print("No se ha podido conectar con la base de datos,"
                    +se.getCause()+": "+this.getUrl()+"| "+this.getUsername()+"| "+ this.getPassword());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    } 

    public void disconnect() throws SQLException {
        this.conn.close();
    }
    
}
