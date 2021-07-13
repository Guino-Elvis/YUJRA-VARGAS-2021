package ejercicios;
import java.util.Scanner;
class tresRegalo{
static Scanner teclado=new Scanner(System.in);
static void ejercicio01(){
//Definir variables y otros
System.out.println("Ejemplo estructura Condicional Multiple 01 en Java");
String regaloamistad="";//targeta=T, chocolates=CH, flores=F, anillo=A 
//datos de entrada
int montodisponible= teclado.nextInt();
if(montodisponible<10){
regaloamistad="targeta";
}else if (montodisponible>=11 && montodisponible<=100){
 regaloamistad="chocolates";}
 else if (montodisponible>=101 && montodisponible<=250){
 regaloamistad="flores";}
 else if (montodisponible>=251){
 regaloamistad="anillo";}
  //Datos de salida:
  System.out.println("la persona va a regalar un obsequio de: "+regaloamistad);
}
public static void main(String[] arg){ejercicio01();}
}
