package assignment_6_Character_Rendering_in_a_Text_Editor;

public class TextEditorApp {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        TextEditor editor = new TextEditor(factory);

        editor.insertText("Hello World", "Arial", 12, 0, 0);
        editor.insertText("Hello Again", "Arial", 12, 0, 20);
        editor.insertText("Flyweight Pattern", "Times New Roman", 14, 0, 40);
    }
}

