package programa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.*;

public class TestBase {

	public static void main(String[] args) {
//		try {
//            // Establecer la conexión con la base de datos
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root@localhost", "your_password");
//
//            // Crear la tabla Persona
//            Statement statement = connection.createStatement();
//            String createPersonaTable = "CREATE TABLE Persona (" +
//                    "cedula INT PRIMARY KEY," +
//                    "nombre VARCHAR(50) NOT NULL," +
//                    "apellido VARCHAR(50) NOT NULL," +
//                    "direccion VARCHAR(100) NOT NULL," +
//                    "telefono VARCHAR(15) NOT NULL" +
//                    ")";
//            statement.executeUpdate(createPersonaTable);
//
//            // Crear la tabla Proveedor
//            String createProveedorTable = "CREATE TABLE Proveedor (" +
//                    "cedula INT PRIMARY KEY," +
//                    "empresa VARCHAR(100) NOT NULL," +
//                    "FOREIGN KEY (cedula) REFERENCES Persona(cedula)" +
//                    ")";
//            statement.executeUpdate(createProveedorTable);
//
//            // Crear la tabla Empleado
//            String createEmpleadoTable = "CREATE TABLE Empleado (" +
//                    "cedula INT PRIMARY KEY," +
//                    "carga VARCHAR(50) NOT NULL," +
//                    "FOREIGN KEY (cedula) REFERENCES Persona(cedula)" +
//                    ")";
//            statement.executeUpdate(createEmpleadoTable);
//
//            // Cerrar la conexión
//            statement.close();
//            connection.close();
//
//            System.out.println("Base de datos creada exitosamente.");
//
//            // Mostrar contenido de la tabla Persona
//            mostrarTabla(connection, "Persona");
//
//        } catch (SQLException e) {
//            System.out.println("Error al crear la base de datos: " + e.getMessage());
//        }
//	
//	
//	
//	
	}
	public static void mostrarTabla(Connection connection, String tabla) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tabla);

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Imprimir encabezados de columnas
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();

            // Imprimir contenido de la tabla
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
                System.out.println();
            }

            // Cerrar recursos
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar la tabla: " + e.getMessage());
        }
    }
}
