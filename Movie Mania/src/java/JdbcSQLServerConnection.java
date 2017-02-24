import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcSQLServerConnection {
public static void main(String[] args) {
Connection conn = null;
try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn = DriverManager.getConnection("jdbc:odbc:movie_mania");
if (conn != null) {
DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
System.out.println("Driver name: " + dm.getDriverName());
System.out.println("Driver version: " + dm.getDriverVersion());
System.out.println("Product name: " + dm.getDatabaseProductName());
System.out.println("Product version: " + dm.getDatabaseProductVersion());
}
} catch (Exception ex) {
ex.printStackTrace();
} finally {
try {
if (conn != null && !conn.isClosed()) {
conn.close();
}
} catch (SQLException ex) {
ex.printStackTrace();
}
}
}
}
