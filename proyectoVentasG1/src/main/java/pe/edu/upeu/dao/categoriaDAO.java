package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

/**
 * categoriaDAO
 */
public class CategoriaDao  extends  AppCrud{ 

    LeerArchivo  lar;
    CategoriaTO catTO;
    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();


public void registrarCategoriaSansung() {
    catTO=new CategoriaTO();
    lar=new LeerArchivo("categoria.txt");
    catTO.setIdCateg(generarId(lar, 0, "C", 1));
    catTO.setNombre(tre.read("","ingrese nombre de categoria sansung:"));
    agregarContenido(lar, catTO);
    
}

public  void reportaCategoriaSansung () {
    lar=new LeerArchivo("categoria.txt");
    imprimirLista(listarContenido(lar));
    
}
    
}