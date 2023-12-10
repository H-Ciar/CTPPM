package lab10.CommandPattern;

public class Editor {
    private Command copyCommand;
    private Command pasteCommand;

    public Editor(Document doc) {
        this.copyCommand = new CopyCommand(doc);
        this.pasteCommand = new PasteCommand(doc);
    }

    public void copy() {
        copyCommand.execute();
    }

    public void paste() {
        pasteCommand.execute();
    }
}
