package design.patterns.behavioral.command;

public class AppendCharacterEditorCommand extends BaseEditorCommand {

    @Override
    public void execute() {
        this.editorContent = this.editor.getContent();

        Keyboard keyboard = Keyboard.getKeyboard();

        this.editor.appendContentToCursor(
                String.valueOf(keyboard.getPressedKey()));
    }

}
