package web.products;

import interfaces.ICheckbox;

public class WebCheckbox implements ICheckbox {

    private boolean isChecked;

    public void render() {
        System.out.println("Web Checkbox");
    }

    public void onPressed() {
        isChecked = !isChecked;
        System.out.println("Web Checkbox Pressed");
    }

    public boolean get() {
        return isChecked;
    }
}
