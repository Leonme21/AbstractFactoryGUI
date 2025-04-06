package gui.linux;

import gui.abstracts.*;

public class LinuxFactory implements GuiFactory{
    
    @Override
    public Button createButton(){
        return new LinuxButton();
    }
    
    @Override
    public Menu createMenu(){
        return new LinuxMenu();
    }
}
