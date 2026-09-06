package abstractfactory.Database;

public class PostgreSQLQuery implements Query{
    @Override
    public void execute(){
        System.out.println("PostgreSQL query execute successfully");
    }
}
