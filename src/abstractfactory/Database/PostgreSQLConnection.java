package abstractfactory.Database;

public class PostgreSQLConnection implements Connection{
    @Override
    public void connect(){
        System.out.println("PostgreSQL connection successfully");
    }
}
