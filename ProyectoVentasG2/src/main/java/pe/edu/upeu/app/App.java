package pe.edu.upeu.app;

import java.io.Console;

import pe.edu.upeu.dao.CategoriaSansung;
import pe.edu.upeu.dao.ClienteSansung;
import pe.edu.upeu.dao.ProductoDeSansung;
import pe.edu.upeu.dao.UsuarioDeSansung;
import pe.edu.upeu.dao.VentaDeSansung;
import pe.edu.upeu.gui.MainGUI;
import pe.edu.upeu.dao.ColorDeCelularSansung;
import pe.edu.upeu.dao.ModeloDeSansung;

import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;
/**
 * Hello world!
 *
 */
public class App {

    public static void registrarCategoria(CategoriaTO categ) {
        System.out.println("------------Registro de Categoria de Productos---------");
        System.out.println("IDCateg:"+categ.getIdCateg()+"\tNombre:"+categ.getNombre());
    }

    public static void menuMain(){
        String mensaje="Seleccion el algoritmo que desea Ejecutar:"+
        "\n1=Registrar Categoria"+
        "\n2=Reportar Categoria "+
        "\n3=Crear Productos"+
        "\n4=Reportar Producto"+
        "\n5=Realizar Venta registroVentaGeneral"+
        "\n6=Reporte de Venta en Rango de Fechas"+
        "\n7=Registrar color"+
        "\n8=Crear nuevo Usuario"+
        "\n9=registrarModelo"+
        "\n10=registrarCliente"+
        "\n0=Salir del programa";
        LeerTeclado lt=new LeerTeclado(); 
        UtilsX ut=new UtilsX();
        CategoriaSansung daoC;       
        UsuarioDeSansung daoUso;
        ProductoDeSansung proDao;
        ColorDeCelularSansung colTO;
        VentaDeSansung venDao;
        ModeloDeSansung modTO;
         ClienteSansung cliDAO;
        int opcion=0;
        opcion=lt.leer(0, mensaje);
        do{            
            switch(opcion){
                case 1:                
                daoC=new CategoriaSansung(); daoC.crearCategoria(); 
                ut.clearConsole(); break;
                case 2: 
                ut.clearConsole();
                daoC=new CategoriaSansung(); daoC.reporteCategoria(); break;    
                case 3: proDao=new ProductoDeSansung(); proDao.crearProducto(); break;
                case 4: proDao=new ProductoDeSansung(); proDao.reporteProducto(); break;
                case 5: venDao=new VentaDeSansung(); venDao.registroVentaGeneral(); break;
                case 6: venDao=new VentaDeSansung(); venDao.reporteVentasRangoFecha(); break;
                case 7: colTO=new ColorDeCelularSansung(); colTO.registrarColor(); break;
                case 8: daoUso=new UsuarioDeSansung(); daoUso.crearNuevoUsuario(); break;
                case 9: modTO=new ModeloDeSansung(); modTO.registrarModelo(); break;
                case 10: cliDAO=new ClienteSansung(); cliDAO.RegistrarCliente(); break;
                case 11: break;
                
                default: System.out.println("La opcion que eligio no exuiste!");
                break;
            }
            if(opcion!=0){
                if(lt.leer("", "\nDesea seguir probando SI=S/NO=N:").toUpperCase().charAt(0)=='S'){
                    opcion=lt.leer(0, mensaje);
                }else{
                    opcion=0;
                }                
            }
            
        }while(opcion!=0);        
    }

    public static void validarAcceso() {
        LeerTeclado lt=new LeerTeclado(); 
        Console  constx= System.console();
        String usuario=lt.leer("", "Ingrese su usuario:");
        System.out.println("Ingrese su clave:");
        char[] clave=constx.readPassword();
        UsuarioDeSansung usuDao=new UsuarioDeSansung();
        if(usuDao.login(usuario, clave)){
            menuMain(); 
        }else{
            System.out.println("Intente Nuevamente!!");
            validarAcceso();
        }
    }





    

    public static void main( String[] args ){
        AnsiConsole.systemInstall();
        Ansi colorX=new Ansi();
        System.out.println(colorX.bgBrightGreen().fgBlue().a("***************Ingreso al Sistema***********").reset());
        AnsiConsole.systemInstall();
        System.out.println(colorX.render("@|red Hello|@ gggg @|green World|@") );
        validarAcceso();     
        menuMain(); 
        new MainGUI();
    }
}
