package web;

import interfaces.IButton;
import interfaces.ICheckbox;
import interfaces.IGUIFactory;
import web.products.WebButton;
import web.products.WebCheckbox;

public class WebFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new WebButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WebCheckbox();
    }
    
}
