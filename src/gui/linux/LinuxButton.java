package gui.linux;

import gui.abstracts.Button;

public class LinuxButton implements Button{
    
    @Override
    public void paint(){
        System.out.println("Pintando boton estilo linux");
    }
}
