package clases;
import java.sql.*;

public class Conexion {
	//Conexi�n
	public static Connection conectar() {
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_ds", "root", "");
			return cn;
		}catch(SQLException e) {
			System.out.println("Error de conexi�n"+e);
		}
		return (null);
	}

}
