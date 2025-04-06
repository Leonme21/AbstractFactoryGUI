package gui;

import gui.abstracts.*;
import gui.windows.*;
import gui.linux.*;
import gui.mac.*;

public class UIFactoryProducer {

    public static GuiFactory getFactory(String osType) {
        switch (osType.toLowerCase()) {
            case "windows" -> {
                return new WindowsFactory();
            }
            case "linux" -> {
                return new LinuxFactory();
            }
            case "mac" -> {
                return new MacFactory();
            }
            default -> {
                System.out.println("Sistema no soportado");
                return null;
            }
        }
    }
}
