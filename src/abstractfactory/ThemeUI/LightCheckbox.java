package abstractfactory.ThemeUI;

public class LightCheckbox implements Checkbox{
    @Override
    public void check(){
        System.out.println("light checkbox activated");
    }
}
