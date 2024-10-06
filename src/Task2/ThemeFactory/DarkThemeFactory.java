package Task2.ThemeFactory;

import Task2.Buttons.*;
import Task2.Checkboxes.*;

public class DarkThemeFactory implements ThemeFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
