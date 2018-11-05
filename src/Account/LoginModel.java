package Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Database.dbConnection;

public class LoginModel {
Connection connection;
//check if is connected to database
public LoginModel()
{
try {
            this.connection = dbConnection.getConnection();

}

    catch(SQLException e)
    {
        e.printStackTrace();
    }
    if(this.connection==null)
    {
        System.exit(1);
    }


}

public boolean isDatabaseConnected()
{
    return this.connection!=null;
}
public boolean isLogin(String pin,String opt) throws Exception
{
    PreparedStatement pr =null;
    ResultSet rs = null;
    String SQL = "SELECT * FROM PINNUMBER where pin=?";
try {
    pr = this.connection.prepareStatement(SQL);
pr.setString(1,pin);
rs=pr.executeQuery();
if(rs.next())
{
    return true;
}
return false;
}
catch(Exception e)
{
    e.printStackTrace();
    return false;
}
finally {
    pr.close();
    rs.close();
}

}


}
