package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import GUI.Alerty;

public class db_connect {
    private final static Alerty alerty = new Alerty();
    private static final String url = "jdbc:postgresql://localhost:5432/Sklep_Komputerowy";
    private static final String user = "postgres";
    private static final String password = "123456";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("OK");
        } catch (SQLException e) {
            e.printStackTrace();
            alerty.errorMessage("Nie udało się połączyć z bazą danych", "Sprawdź ustawienia i spróbuj ponownie");
        }
        return connection;
    }
    
}
