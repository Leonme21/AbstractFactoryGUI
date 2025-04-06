package gui.mac;

import gui.abstracts.*;

public class MacFactory implements GuiFactory {
    
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
