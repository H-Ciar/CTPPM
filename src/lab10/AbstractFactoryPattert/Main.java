package lab10.AbstractFactoryPattert;

public class Main {
    public static void main(String[] args) {
        Application app;
        GUIFactory factory;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }

        app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
