package abstractfactory.ThemeUI;

public class DarkCheckbox implements Checkbox{
    @Override
    public void check(){
        System.out.println("dark checkbox activated");
    }
}
