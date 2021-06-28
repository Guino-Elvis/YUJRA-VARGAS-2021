package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.categoriaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.TecladoRead;
import pe.edu.upeu.util.UtilsX;

/**
 * categoriaDAO
 */
public class categoriaDAO  extends  AppCrud{ 

    LeerArchivo  lar;
    categoriaTO catTO;
    TecladoRead tre=new TecladoRead();
    UtilsX ut=new UtilsX();


public void registrarCategoria() {
    catTO=new categoriaTO();
    lar=new LeerArchivo("categoria.txt");
    catTO.setIdCateg(generarId(lar, 0, "C", 1));
    catTO.setNombre(tre.read("","ingrese nombre de categoria:"));
    agregarContenido(lar, catTO);
    
}

public  void reportaCategoria () {
    lar=new LeerArchivo("categoria.txt");
    imprimirLista(listarContenido(lar));
    
}
    
}