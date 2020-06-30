package clases;
import java.sql.*;

public class Conexion {
	//Conexión
	public static Connection conectar() {
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_ds", "root", "");
			return cn;
		}catch(SQLException e) {
			System.out.println("Error de conexiòn"+e);
		}
		return (null);
	}

}
