package pe.edu.upeu.geyv.examengeyv;

/**
 * examen4GEYV
 */
import java.util.Scanner;


class examen4GEYV{
  
  public static void main(String[] arg){
    

    Scanner teclado =new Scanner(System.in);
  
  System.out.println("ingrese un numero :");
  
  if(isPerfect(teclado.nextInt()))

  System.out.println("El numero ingresado es perfecto :");

  else
 
  System.out.println("El numero ingresado no es perfecto :");


}

 public static boolean isPerfect(int number) {
   boolean boo1 =false;
   int addDivisors = 0, divisor=1;
   while(divisor  <= number/2 ) {

   if ( number % divisor == 0)
      addDivisors += divisor;
      divisor++;

   }

   if (addDivisors == number)
   boo1= true;

   return boo1;

  }

public void isPerfect() {
}
}

  



 