package Task2.ThemeFactory;

import Task2.Buttons.*;
import Task2.Checkboxes.*;

public class LightThemeFactory implements ThemeFactory {
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
