package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Credenciales;
import modelo.EnviarCorreo;
import vista.frmIngresoCorreo;

public class ctrlIngresoCorreo implements MouseListener{
    
    private Credenciales modelo;
    private frmIngresoCorreo vista;
    
    public ctrlIngresoCorreo(Credenciales modelo, frmIngresoCorreo vista){
        this.modelo = modelo;
        this.vista = vista;
        
        vista.btnEnviarCodigo.addMouseListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vista.btnEnviarCodigo){
        
            
            
            String recipient = vista.txtCorreo.getText();
        String subject = "Recuperacion de contraseña";
        String content = "Este es el codigo de recuperacion";
     
            EnviarCorreo.enviarCorreo(recipient, subject, content);
        
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    

    
}
