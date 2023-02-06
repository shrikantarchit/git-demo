import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloWorld{

  public static void main(String[] args) {
        System.out.println("Hello, World!");
        String id = "admin"; // hard-coded credential
        String password = "password"; // hard-coded credential
       Boolean check= VerifyAdmin(password);
        //getConn(id,password);
}
@GetMapping("/api")
public static void getConn(String id, String password) throws SQLException {
  char[] JavaCharArray = new char[5];  
  JavaCharArray[0] = 'a';  
  JavaCharArray[1] = 'b';  
  JavaCharArray[2] = 'c';  
  JavaCharArray[3] = 'd';  
  JavaCharArray[4] = 'e';  
    DriverManager.getConnection(id, password,password); // sensitive call
}
  public static boolean VerifyAdmin(String password) {
if (password.equals("68af404b513073584c4b6f22b6c63e6b")) {
System.out.println("Entering Diagnostic Mode...");
return true;
}
System.out.println("Incorrect Password!");
return false;
  }
}
