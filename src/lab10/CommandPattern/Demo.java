package lab10.CommandPattern;

public class Demo {
    public static void main(String[] args) {
        Document doc = new Document();
        Editor editor = new Editor(doc);

        editor.copy();
        editor.paste();
    }
}
