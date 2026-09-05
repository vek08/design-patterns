package abstractfactory.Database;

public class MySQLConnection implements Connection{
    @Override
    public void connect(){
        System.out.println("mysql connection successfully");
    }
}
