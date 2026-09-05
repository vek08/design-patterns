package abstractfactory.Database;

public class Main {
    public static void main(String[] args) {

        DatabaseFactory factory = new MySQLFactory();
        Connection connection = factory.getConnection();
        connection.connect();

    }
}
