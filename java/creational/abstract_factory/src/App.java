import interfaces.IButton;
import interfaces.ICheckbox;
import interfaces.IGUIFactory;

public class App {

    IGUIFactory guiFactory;
    IButton button;
    ICheckbox checkbox;

    public App(IGUIFactory guiFactory) {
        this.guiFactory = guiFactory;

    }

    public void createUI() {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void render() {
        if (button == null || checkbox == null) {
            throw new RuntimeException("You must call createUI() first");
        }
        button.render();
        checkbox.render();
    }
}
