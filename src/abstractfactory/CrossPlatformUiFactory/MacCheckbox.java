package abstractfactory.CrossPlatformUiFactory;

public class MacCheckbox implements Checkbox {
    @Override
    public void click() {
        System.out.println("MacCheckbox clicked");
    }
}
