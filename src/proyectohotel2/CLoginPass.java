
package proyectohotel2;
import javax.swing.JOptionPane;
public class CLoginPass extends CLoginUsuario{
   
    
    public void LoginContraseña(){
    int e = 0;
    
        do {  
            super.passR=JOptionPane.showInputDialog("Ingrese Contraseña");
        
            if(super.passR.equals(super.pass)){
             e++;
             
        } else {
        
        JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
        ;
        }
    } while(e<=0 || e>=2);
    
        
    
    
    }
}
