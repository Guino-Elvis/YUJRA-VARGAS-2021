package pe.edu.upeu.geyv.examengeyv;

import java.lang.System.Logger;
import java.util.logging.Level;

/**
 * examen05GEYV
 */
public class examen05GEYV {


  public static void main(String[] arg){
   
    examen05GEYV objnumeros = new examen05GEYV();
    objnumeros.recursivo(20);

  }
    
  public void recursivo(int numeros) {
    
 if(numeros==0){ 

  System.out.println("empesando recursividad x ");
  } else{
    


    System.out.println("metodo recursivo" + numeros);
    recursivo( numeros - 1);
   
  }

  }
  
}

