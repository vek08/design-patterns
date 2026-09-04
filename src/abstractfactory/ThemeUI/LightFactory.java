package abstractfactory.ThemeUI;

public class LightFactory implements UIFactory{

    @Override
    public Button createButton(){
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new LightCheckbox();
    }
}
