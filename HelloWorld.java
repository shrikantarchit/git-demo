import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloWorld{

  public static void main(String[] args) {
        System.out.println("Hello, World!");
    String id = "admin"; // hard-coded credential
    String password = "password"; // hard-coded credential
    getConn(id,password);
}
@GetMapping("/api")
public static void getConn(String id, String password) throws SQLException {
    DriverManager.getConnection(id, password); // sensitive call
}
}
