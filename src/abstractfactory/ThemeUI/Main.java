package abstractfactory.ThemeUI;

public class Main {
    public static void main(String[] args) {

        UIFactory factory = new LightFactory();
        Checkbox checkbox = factory.createCheckbox();
        checkbox.check();

    }
}
