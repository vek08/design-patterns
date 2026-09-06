package abstractfactory.Database;

public class MySQLFactory implements DatabaseFactory{

    @Override
    public Connection getConnection(){
        return new MySQLConnection();
    }

    @Override
    public Query getQuery(){
        return new MySQLQuery();
    }

}
