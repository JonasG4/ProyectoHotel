package proyectohotel2;

import javax.swing.JOptionPane;

public class CLoginUsuario implements ILogin {
    
    //Atributos
    public String UsuarioR;
    public String UsuarioC = "kevin";
    public String pass = "amamosprogra";
    public String passR;
    

    public void LoginUsuario(){
         int e = 0;
    
        do {  
            UsuarioR=JOptionPane.showInputDialog("Ingrese Usuario");
        
            if(UsuarioR.equals(UsuarioC)){
             e++;
             
        } else {
        
        JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
       ;
        }
    } while(e<=0 || e>=2);
    
        
    }
}

