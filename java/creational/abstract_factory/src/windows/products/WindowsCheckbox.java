package windows.products;

import interfaces.ICheckbox;

public class WindowsCheckbox implements ICheckbox {

    private boolean isChecked;

    public void render() {
        System.out.println("Windows Checkbox");
    }

    public void onPressed() {
        isChecked = !isChecked;
        System.out.println("Windows Checkbox Pressed");
    }

    public boolean get() {
        return isChecked;
    }
}
