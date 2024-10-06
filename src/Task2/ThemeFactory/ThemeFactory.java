package Task2.ThemeFactory;

import Task2.Buttons.Button;
import Task2.Checkboxes.Checkbox;

public interface ThemeFactory {
    Button createButton();
    Checkbox createCheckbox();
}
