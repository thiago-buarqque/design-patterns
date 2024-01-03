package design.patterns.behavioral.command;

public class Clipboard {
    private static Clipboard clipboard = null;
    private String content;

    private Clipboard() {

    }

    public static Clipboard getClipboard() {
        if(clipboard == null) {
            clipboard = new Clipboard();
        }
        return clipboard;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
