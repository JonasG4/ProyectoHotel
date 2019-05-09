package proyectohotel2;

import javax.swing.JOptionPane;

public class ProyectoHotel2 {

    public static void main(String[] args) {
       
        //Invocacion de los contructores
        CLoginUsuario  ex = new CLoginUsuario();
        
        ex.LoginUsuario();
        
        CLoginPass ez = new CLoginPass();
        
        ez.LoginContraseña();
        
        //Invocacion de los JFrame
      frmPrincipal main = new frmPrincipal();
         main.setVisible(true);
        
    }
    
}
