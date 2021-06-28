package pe.edu.upeu.app;
import pe.edu.upeu.dao.categoriaDAO;
import pe.edu.upeu.gui.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        categoriaDAO daoCAT=new categoriaDAO();
        daoCAT.registrarCategoria();
        daoCAT.reportaCategoria();
        //new MainGUI();

      
    }


    
}
