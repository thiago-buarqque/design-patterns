package design.patterns.behavioral.command;

public class Keyboard {
    private static Keyboard keyboard = null;

    public static Keyboard getKeyboard() {
        if(keyboard == null) {
            keyboard = new Keyboard();
        }

        return keyboard;
    }

    private Keyboard() {

    }

    public char getPressedKey() {
        // Returns the current pressed key
        //
        // The AppendCharacterEditorCommand is executed on keyDown,
        // after keyUp event, this return will be null.
        return 'a';
    }
}
