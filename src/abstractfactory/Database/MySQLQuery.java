package abstractfactory.Database;

public class MySQLQuery implements Query{
    @Override
    public void execute(){
        System.out.println("mysql query execute successfully");
    }
}
