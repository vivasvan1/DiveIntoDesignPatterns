package windows.products;

import interfaces.IButton;

public class WindowsButton implements IButton {
    public void render() {
        System.out.println("Windows Button");
    }

    public void onClick() {
        System.out.println("Windows Button Clicked");
    }
}
