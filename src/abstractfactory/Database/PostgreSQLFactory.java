package abstractfactory.Database;

public class PostgreSQLFactory implements DatabaseFactory {

    @Override
    public Connection getConnection() {
        return new PostgreSQLConnection();
    }

    @Override
    public Query getQuery() {
        return new PostgreSQLQuery();
    }
}
