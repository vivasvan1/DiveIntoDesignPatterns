package windows;

import interfaces.IButton;
import interfaces.ICheckbox;
import interfaces.IGUIFactory;
import windows.products.WindowsButton;
import windows.products.WindowsCheckbox;

public class WindowsFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
    
}
