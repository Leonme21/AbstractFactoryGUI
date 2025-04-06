package gui;

import gui.abstracts.*;

public class App {
    public static void main(String[] args) {
        // Cambiar entre windows, linux o mac para probar
        GuiFactory factory = UIFactoryProducer.getFactory("linux");

        if (factory != null) {
            Button btn = factory.createButton();
            Menu menu = factory.createMenu();

            btn.paint();
            menu.show();
        }
    }
}
