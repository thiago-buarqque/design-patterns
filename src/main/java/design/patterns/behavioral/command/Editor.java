package design.patterns.behavioral.command;

public class Editor {
    private String content = "";
    private static Editor editor = null;

    public static Editor getEditor() {
        if (editor == null) {
            editor = new Editor();
        }

        return editor;
    }

    private Editor() {

    }

    public String copySelection() {
        // Copy and return it from this.content based on the selection
        return "Selected text";
    }

    public String cutSelection() {
        // Remove it and return it from this.content based on the selections
        return "Selected text";
    }

    public void appendContentToCursor(String content) {
        // Append the content based on the cursor position
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
