package web.products;

import interfaces.IButton;

public class WebButton implements IButton {
    public void render() {
        System.out.println("Web Button");
    }

    public void onClick() {
        System.out.println("Web Button Clicked");
    }
}
