package lab10.CommandPattern;

public class CopyCommand implements Command {
    private Document document;

    public CopyCommand(Document doc) {
        this.document = doc;
    }

    public void execute() {
        document.copy();
    }
}