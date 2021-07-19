package pe.edu.upeu.dao;

import java.io.Console;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ClienteDAO extends AppCrud{
    LeerArchivo lar;
    UsuarioTO cliTO;

    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();    

    public void RegistrarCliente() {
        cliTO=new UsuarioTO();
        lar=new LeerArchivo("Cliente.txt");
        String user=lte.leer("", "Ingrese nombrea y apellido del cliente:").toLowerCase();
        if(validarExistUser(user)){
            cliTO.setUsuario(user);
            cliTO.setIdUsuario(generarId(lar, 0, "U", 1));
            cliTO.setPerfil(lte.leer("", "Ingrese DNI del cliente:").toUpperCase());        
            
            
            agregarContenido(lar, cliTO);            
        }else{
           System.out.println("Ingresar otro cliente:"); 
           RegistrarCliente();
        }
    }

    
    public boolean validarExistUser(String user) {
        lar=new LeerArchivo("Cliente.txt");
       Object[][] data=buscarContenido(lar, 1, user);  
       if(data!=null && data.length>0){
           System.out.println("-----ya se registro el nombre de ese cliente ingrese otro-----");
        return false;
       }
       return true;
    }

}