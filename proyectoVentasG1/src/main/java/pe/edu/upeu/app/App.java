package pe.edu.upeu.app;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.VentaDAO;

import java.io.Console;
import pe.edu.upeu.dao.CategoriaDao;
import pe.edu.upeu.dao.ProductoDAO;
import pe.edu.upeu.gui.*;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;


/**
 * Hello world!
 *
 */
public class App 
{

     public static void menuMain(){
        
        String mensaje="Seleccion el algoritmo que desea Ejecutar:"+
        "\n1=Registrar CategoriaSansung"+
        "\n12=Reportar CategoriaSansung "+
        "\n2=Registrar ProductoSansung"+
        "\n21=Reportar Producto"+
        "\n22=Modificar Producto"+
        "\n3=crearNuevoUsuarioparaqueVendaEnSansung"+
        "\n4=registroVentaGeneralDeSansung"+
        "\n41=reporteVentasRangoFecha"+
        "\n0=Salir del programa";
        LeerTeclado lt=new LeerTeclado(); 
        UtilsX ut=new UtilsX();
        CategoriaDao daoC;       
        UsuarioDao daoUso;
        ProductoDAO proDAO;
        VentaDAO  ventDAO;
        int opcion=0;
        opcion=lt.read(0, mensaje);
        do{            
            switch(opcion){
                case 1: daoC=new CategoriaDao(); daoC.registrarCategoriaSansung(); break;
                case 11: daoC=new CategoriaDao(); daoC.reportaCategoriaSansung(); break;
                case 2: proDAO=new ProductoDAO(); proDAO.registrarProductoSansung(); break;
                case 3: daoUso=new UsuarioDao(); daoUso.crearNuevoUsuarioparaqueVendaEnSansung();  break;     
                case 4: ventDAO=new VentaDAO(); ventDAO.registroVentaGeneralDeSansung(); break;   
                case 41: ventDAO=new VentaDAO(); ventDAO.reporteVentasRangoFecha(); break;   
                default:System.out.println("Opcion no existe");   break;
            }
            if(opcion!=0){
                System.out.println("\nDesea seguir probando: ");
                opcion=lt.read(0, mensaje);
            }
            
        }while(opcion!=0);        
    }

    
    
    public static void validarAcceso() {
        LeerTeclado lt=new LeerTeclado(); 
        Console  constx= System.console();
        String usuario=lt.read("", "Ingrese su usuario S:");
        System.out.println("Ingrese su clave por seguridad:");
        char[] clave=constx.readPassword();
        UsuarioDao usuDao=new UsuarioDao();
        if(usuDao.login(usuario, clave)){
            menuMain(); 
        }else{
            System.out.println("Intente Nuevamente!!");
            validarAcceso();
        }
    }

    public static void main( String[] args ){
       
        validarAcceso();       
        //menuMain(); 
        //new MainGUI();
    }
}