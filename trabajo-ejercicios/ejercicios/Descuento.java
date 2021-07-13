package ejercicios;
import java.util.Scanner;
class Descuento{
static Scanner teclado=new Scanner(System.in);
static void ejercicio01(){
//Definir variables y otros de gino elvis
System.out.println("Ejemplo estructura Condicional Multiple 01 en Java");
String preciodelarticulo="";//sacar el precio nada mas
//datos de entrada
int montodisponible= teclado.nextInt();
if(montodisponible>=200){
preciodelarticulo="A";
}else if (montodisponible>=100 && montodisponible<=200){
 preciodelarticulo="B";}
 else if (montodisponible<=100){
 preciodelarticulo="C";}
  //Datos de salida:
  System.out.println("el precio del articulo es de: "+preciodelarticulo);
}
public static void main(String[] arg){
 //ejercicio01();
 ejercicio01();
}
}