package pe.edu.upeu.geyv.examengeyv;

import java.util.Scanner;

/**
 * examen3GEYV
 */
class examen03GEYV{
    public static void main(String[] arg){
      //definicion de variables u otros
      Scanner teclado =new Scanner(System.in);
      boolean comprobar = true;
      int n;

      while (comprobar == true) {
          
      
        //Datos de entrada
        System.out.println("ingrese un numero positivo:");
    
        n = teclado.nextInt();
        if ( n > 0) {
        //proceso
        for(int i = 1; i<= 10;i++) {
            
            System.out.println(n+" por"+i+" es igual a:"+(n*i));
           
            
          
          }
          
        
          
        
            }
            else{
            System.out.println("el nuemero ingresado no es correcto."
            +"intentelo nuevamente");


    }
    comprobar = false;
}
}

    public void isPerfect() {
    }
}
