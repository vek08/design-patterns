package abstractfactory.Database;

public interface DatabaseFactory {
    Connection getConnection();
    Query getQuery();
}
