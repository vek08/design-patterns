package abstractfactory.ThemeUI;

public class LightButton implements Button{
    @Override
    public void click(){
        System.out.println("light mode activated");
    }
}
