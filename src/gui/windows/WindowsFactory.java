
package gui.windows;

import gui.abstracts.*;

public class WindowsFactory implements GuiFactory{
    
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
