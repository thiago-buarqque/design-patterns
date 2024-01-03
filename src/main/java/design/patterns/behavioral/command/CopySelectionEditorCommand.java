package design.patterns.behavioral.command;

public class CopySelectionEditorCommand extends BaseEditorCommand {

    @Override
    public void execute() {
        Clipboard clipboard = Clipboard.getClipboard();

        String content = this.editor.copySelection();

        if(!content.isEmpty()) {
            clipboard.setContent(content);
        }
    }

}
