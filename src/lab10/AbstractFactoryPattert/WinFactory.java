package lab10.AbstractFactoryPattert;

public class WinFactory implements GUIFactory {

    public Button createButton() {
        return new WinButton();
    }

    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
