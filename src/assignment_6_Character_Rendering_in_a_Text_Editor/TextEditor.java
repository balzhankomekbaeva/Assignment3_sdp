package assignment_6_Character_Rendering_in_a_Text_Editor;

public class TextEditor {
    private CharacterFactory characterFactory;

    public TextEditor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    public void insertText(String text, String font, int size, int startX, int startY) {
        int x = startX;
        for (char c : text.toCharArray()) {
            Character character = characterFactory.getCharacter(c, font, size);
            character.display(x, startY);
            x += 10; // Move position after each character
        }
    }
}
