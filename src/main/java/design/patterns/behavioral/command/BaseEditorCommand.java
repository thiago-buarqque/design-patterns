package design.patterns.behavioral.command;

public abstract class BaseEditorCommand implements EditorCommand {
    protected Editor editor;
    protected String editorContent;

    protected BaseEditorCommand() {
        this.editor = Editor.getEditor();
    }

    @Override
    public void undo() {
        this.editor.setContent(this.editorContent);
    }
}
