package abstractfactory.CrossPlatformUiFactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void click(){
        System.out.println("Windows Checkbox clicked");
    }
}
