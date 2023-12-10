package lab10.CommandPattern;

public class PasteCommand implements Command {
    private Document document;

    public PasteCommand(Document doc) {
        this.document = doc;
    }

    public void execute() {
        document.paste();
    }
}
