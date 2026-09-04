package abstractfactory.CrossPlatformUiFactory;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("MacButton clicked");
    }
}
