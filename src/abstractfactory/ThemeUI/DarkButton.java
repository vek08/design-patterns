package abstractfactory.ThemeUI;

public class DarkButton implements Button{
    @Override
    public void click(){
        System.out.println("dark mode activated");
    }
}
