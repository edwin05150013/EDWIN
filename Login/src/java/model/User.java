package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.UserPojo;



public class User extends Database{
    private int id;
    private String email;
    private String password;
    private String name;
    private String status;

    public int getId() { return id; }

    public String getEmail() { return email; }

    public String getName() { return name; }

    public String getStatus() { return status; }
    
   

    public void setId(int id) { this.id = id; }

    public void setEmail(String email) { this.email = email; }

    public void setPassword(String password) { this.password = password; }

    public void setName(String name) { this.name = name; }

    public void setStatus(String status) { this.status = status; }
    
    public User() {
        super();
        setId(0);
    }
    
    public void authenticate(String _email, String _password ) throws SQLException, ClassNotFoundException{
        this.connect();
        if(this.getConn() != null){
            String query = "select * from dbo.Usuario where email = '"+_email+"' and password='"+_password+"' and status = '1'";
            Statement stmt = this.getConn().createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()) {
                setId(resultSet.getInt("id"));
                setEmail(resultSet.getString("email"));
                setPassword(resultSet.getString("password"));
                setName(resultSet.getString("name"));
                setStatus(resultSet.getString("status"));
            }
            this.disconnect();
        }
    }
    
    public int agregar(String _email, String _password , String _name) throws SQLException, ClassNotFoundException{
        this.connect();
        if(this.getConn() != null){
            String query = "insert into dbo.Usuario(email,password,name,status) values(?,?,?,?)";
            PreparedStatement preparedStmt = this.getConn().prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            preparedStmt.setString(1,_email);
            preparedStmt.setString(2,_password);
            preparedStmt.setString(3,_name);
            preparedStmt.setString(4,"1");
            int affects = preparedStmt.executeUpdate();            
            this.disconnect();
            return affects;            
        }
        return 0;
    }
    
    public ArrayList listar() throws SQLException, ClassNotFoundException{
        ArrayList<UserPojo> user = new ArrayList<UserPojo>();
        this.connect();
        if(this.getConn() != null){
            String query = "select * from dbo.Usuario where status = '1'";
            Statement stmt = this.getConn().createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                email = resultSet.getString("email");
                password = resultSet.getString("password");
                name = resultSet.getString("name");
                status = resultSet.getString("status");
                user.add(new UserPojo(id,email,password,name,status));
            }
            this.disconnect();
        }
        return user;
        
    }
    
    public ArrayList editar(String _id) throws SQLException, ClassNotFoundException{
        ArrayList<UserPojo> user = new ArrayList<UserPojo>();
        this.connect();
        if(this.getConn() != null){
            String query = "select * from dbo.Usuario where status = '1' and id = '"+_id+"'";
            Statement stmt = this.getConn().createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                email = resultSet.getString("email");
                password = resultSet.getString("password");
                name = resultSet.getString("name");
                status = resultSet.getString("status");
                user.add(new UserPojo(id,email,password,name,status));
            }
            this.disconnect();
        }
        return user;
        
    }
    
    public int actualizar(String id, String _email, String _password , String _name) throws SQLException, ClassNotFoundException{
        this.connect();
        if(this.getConn() != null){
            String query = "update dbo.Usuario set email=?,password=?,name=?,status=? where id=?";
            PreparedStatement preparedStmt = this.getConn().prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            preparedStmt.setString(1,_email);
            preparedStmt.setString(2,_password);
            preparedStmt.setString(3,_name);
            preparedStmt.setString(4,"1");
            preparedStmt.setString(5,id);
            int affects = preparedStmt.executeUpdate();            
            this.disconnect();                     
            return affects;
        }
        
        return 0;
    
    }
    
    
    public int eliminar(String id) throws SQLException, ClassNotFoundException{
        this.connect();
        if(this.getConn() != null){
            String query = "update dbo.Usuario set status='0' where id = ?";
            PreparedStatement preparedStmt = this.getConn().prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            preparedStmt.setString(1,id);
            int affects = preparedStmt.executeUpdate();            
            this.disconnect();                     
            return affects;
        }
        
        return 0;
    
    }
}


