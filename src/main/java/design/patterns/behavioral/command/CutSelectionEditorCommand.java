package design.patterns.behavioral.command;

public class CutSelectionEditorCommand extends BaseEditorCommand {

    @Override
    public void execute() {
        this.editorContent = this.editor.getContent();

        Clipboard clipboard = Clipboard.getClipboard();

        clipboard.setContent(this.editor.cutSelection());
    }

}
